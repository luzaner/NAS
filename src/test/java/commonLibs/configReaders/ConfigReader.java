package commonLibs.configReaders;

import commonLibs.utils.ResourceUtil;

import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    private Properties properties;
    private String configFilePath;

    public ConfigReader(String configFilePath) {
        this.configFilePath = configFilePath;
        properties = loadPropertyFile();
    }


    public Properties loadPropertyFile() {
        Properties properties = new java.util.Properties();
        try {
            properties.load(ResourceUtil.getResourceAsStream(configFilePath));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return properties;
    }

    public String getProperty(String key) {
        return properties.getProperty(key);
    }
}
