package tests.api;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.response.ValidatableResponse;
import commonLibs.Core.User;
import commonLibs.api.AuthAPI;
import commonLibs.api.ProfileAPI;
import commonLibs.utils.JWTTokenUtil;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.startsWith;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class ProfileAuthIntegrationTest extends BaseTest {
    ProfileAPI profileAPI;
    AuthAPI authAPI;
    User user;

    @BeforeClass
    public void SetupBaseURL() {
        profileAPI = new ProfileAPI(this.commonConfig);
        authAPI = new AuthAPI(this.commonConfig);
        user = new User(this.commonConfig.getBrandId());
        RestAssured.baseURI = environmentConfig.getBaseURL();
    }

    @Test
    public void signUP() {
        ValidatableResponse response = profileAPI.postUser(user);
        response.statusCode(profileAPI.SIGNUP_CODE)
                .and()
                .body("playerUUID", startsWith("PLAYER"));
        user.setUUID(response.extract().path("playerUUID"));

        response = authAPI.postSignin(user);
        response.statusCode(profileAPI.SIGNIN_CODE);
        assertEquals(user.getUUID(),
                response.extract().path("uuid"));

        String token = response.extract().path("token");
        assertTrue(JWTTokenUtil.checkFormat(token));
        user.setToken(token);

        response = profileAPI.getProfiles(user.getUUID(), user.getToken());
        response.statusCode(profileAPI.PROFILES_CODE)
                .and()
                .body("email", equalTo(user.getEmail()))
                .body("playerUUID", equalTo(user.getUUID()));
    }
}
