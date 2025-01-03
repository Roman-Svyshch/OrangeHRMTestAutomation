package com.romancode.test.base;

import com.romancode.test.driver.BrowserFactory;
import com.romancode.test.driver.DriverFactory;
import com.romancode.test.properties.ConfigLoader;
import com.romancode.test.properties.TestDataLoader;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseTest {

    @BeforeSuite
    public void setUp(){
       WebDriver driver = BrowserFactory.createBrowserInstance(ConfigLoader
                .getInstance()
                .getPropertyValue("browser"));

        DriverFactory.getInstance().setDriver(driver);
        DriverFactory.getInstance().getDriver().get(TestDataLoader.getInstance().getAppUrl());
    }

    @AfterSuite
    public void tearDown(){
        DriverFactory.getInstance().getDriver().quit();
    }
}
