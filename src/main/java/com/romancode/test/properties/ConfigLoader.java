package com.romancode.test.properties;

import com.romancode.test.constants.Constants;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.Properties;

public class ConfigLoader {
    private final Logger log = LogManager.getLogger(ConfigLoader.class);

    private Properties properties;

    private ConfigLoader() {
        FileReader fileReader = null;
        try {
            System.out.println("CURRENT_DIR: " + Constants.CURRENT_DIR);
            log.info("Config file path: " + Constants.CONFIG_FILE_PATH);
            fileReader = new FileReader("src/test/resources/execution/config.properties");

        } catch (FileNotFoundException e) {
            log.error("Exception occur while reading config file");
//            ExtentFactory.getInstance().failTest("Exception occur while reading config file");
        }

        properties = new Properties();

        try {
            properties.load(fileReader);
        } catch (IOException e) {
            e.printStackTrace();
            }
        Constants.EXECUTION_ENV = getPropertyValue("environment");
    }


    private static ConfigLoader instance = new ConfigLoader();


    public static ConfigLoader getInstance() {
        return instance;
    }

    public  String  getPropertyValue(String key){

        return properties.getProperty(key);
    }
}
