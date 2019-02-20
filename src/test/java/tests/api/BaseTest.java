package tests.api;

import commonLibs.configReaders.CommonConfigReader;
import commonLibs.configReaders.EnvironmentConfigReader;


public class BaseTest {
    private String environmentName = System.getProperty("environment");
    public CommonConfigReader commonConfig = new CommonConfigReader("config/Common.properties");
    public EnvironmentConfigReader environmentConfig =
            new EnvironmentConfigReader(String.format("config/Env%s.properties", environmentName));

    public BaseTest() {
    }

    ;
}
