package utillities;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigDataProvider {

    private static final Logger log = LoggerFactory.getLogger(ConfigDataProvider.class);
    private Properties properties;  // Properties object to hold config data

    // Constructor to load the properties file
    public ConfigDataProvider() {
        String projectLocation = System.getProperty("user.dir");
        String configFilePath = projectLocation + "/config/config.properties";
        try {
            File file = new File(configFilePath);
            FileInputStream fileInputStream = new FileInputStream(file);
            properties = new Properties();
            properties.load(fileInputStream);  // Load properties from file
        } catch (Exception e) {
            log.error("Failed to load config file: ", e);
        }
    }

    // Method to get the browser type from the config file
    public String getBrowser() {
        return properties.getProperty("Browser", "chrome");  // Default to Chrome if not specified
    }

    // Example for other properties (you can add more getters as needed)
    public String getOperator() {
        return properties.getProperty("Operator");
    }
}