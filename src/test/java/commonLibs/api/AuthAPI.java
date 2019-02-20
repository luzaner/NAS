package commonLibs.api;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.ValidatableResponse;
import commonLibs.Core.User;
import commonLibs.configReaders.CommonConfigReader;

import static com.jayway.restassured.RestAssured.given;

public class AuthAPI extends BaseAPI {

    public String authPath;
    public String signinPath;

    public AuthAPI(CommonConfigReader commonConfig) {
        this.authPath = commonConfig.getAuthPath();
        this.signinPath = commonConfig.getSigninPath();
    }

    public String getSigninEndpoint() {
        return authPath + signinPath;
    }

    public ValidatableResponse postSignin(User user) {
        return given()
                .contentType(ContentType.JSON)
                .body(generateJSONForSignin(user))
                .when()
                .post(getSigninEndpoint())
                .then();
    }

    public String generateJSONForSignin(User user) {
        String json = "{\r\n  \"brandId\": " + "\"" + user.getBrandId() + "\", " +
                "\r\n  \"department\": \"\"," +
                "\r\n  \"device\": \"\"," +
                "\r\n  \"login\": " + "\"" + user.getEmail() + "\", " +
                "\r\n  \"password\": " + "\"" + user.getPassword() + "\"} ";
        return json;
    }
}
