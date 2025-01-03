package com.romancode.test.properties;

import com.romancode.test.constants.Constants;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class TestDataLoader {

    private static TestDataLoader instance = new TestDataLoader();


    private static Properties properties;


    private TestDataLoader(){
        String env = Constants.EXECUTION_ENV;
        switch (env){
            case "test": loadFile(Constants.TEST_ENV_DATA_FILE);
            break;
            case "prod": loadFile(Constants.PROD_ENV_DATA_FILE);
            break;
            default:
                break;
        }
    }


    private static void loadFile(String filePath){
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(filePath);
        } catch (FileNotFoundException e) {
//            ExtentFactory.getInstance().failTest("Exception occur while reading test data file ");
            throw new RuntimeException(e);
        }

        properties = new Properties();

        try {
            properties.load(fileReader);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static TestDataLoader getInstance(){
        return instance;
    }

    private String getPropertiesValue(String key){
            return properties.getProperty(key);
    }
    public String getAppUrl(){
        return this.getPropertiesValue("app_url");
    }
    public String getUserName(){
        return this.getPropertiesValue("username");
    }
    public String getPassword(){
        return  this.getPropertiesValue("password");
    }


}
