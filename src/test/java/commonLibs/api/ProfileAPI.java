package commonLibs.api;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.ValidatableResponse;
import commonLibs.Core.User;
import commonLibs.configReaders.CommonConfigReader;
import commonLibs.utils.TimeUtils;

import static com.jayway.restassured.RestAssured.given;

public class ProfileAPI extends BaseAPI {

    public String profilePath;
    public String signUpPath;
    public String profilesPath;

    public ProfileAPI(CommonConfigReader commonConfig) {
        this.profilePath = commonConfig.getProfilePath();
        this.signUpPath = commonConfig.getSignUpPath();
        this.profilesPath = commonConfig.getProfilesPath();
    }

    public String getSignUpEndpoint() {
        return profilePath + signUpPath;
    }

    public String getProfilesEndpoint() {
        return profilePath + profilesPath;
    }

    public ValidatableResponse postUser(User user) {
        return given()
                .contentType(ContentType.JSON)
                .body(user)
                .when()
                .post(getSignUpEndpoint())
                .then();
    }

    public ValidatableResponse getProfiles(String uuid, String token) {
        TimeUtils.sleep(2000); // this time for creation of user in database(value need to be taken from requirements), in case to remove it there is possibility to get 404
        return given()
                .header("Authorization", "Bearer " + token)
                .when()
                .get(getProfilesEndpoint() + "/" + uuid)
                .then();
    }
}
