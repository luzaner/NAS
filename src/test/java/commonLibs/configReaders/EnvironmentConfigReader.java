package commonLibs.configReaders;

public class EnvironmentConfigReader extends ConfigReader {

    public EnvironmentConfigReader(String configFilePath) {
        super(configFilePath);
    }

    public String getBaseURL() {
        return this.getProperty("baseURL");
    }
}
