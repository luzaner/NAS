package commonLibs.configReaders;

public class CommonConfigReader extends ConfigReader {

    public CommonConfigReader(String configFilePath) {
        super(configFilePath);
    }

    public String getAuthPath() {
        return this.getProperty("authPath");
    }

    public String getSigninPath() {
        return this.getProperty("signinPath");
    }

    public String getProfilePath() {
        return this.getProperty("profilePath");
    }

    public String getSignUpPath() {
        return this.getProperty("signUpPath");
    }

    public String getProfilesPath() {
        return this.getProperty("profilesPath");
    }

    public String getBrandId() {
        return this.getProperty("brandId");
    }
}
