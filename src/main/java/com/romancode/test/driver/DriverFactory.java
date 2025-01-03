package com.romancode.test.driver;

import org.openqa.selenium.WebDriver;

public class DriverFactory {
    ThreadLocal<WebDriver> driver = new ThreadLocal<>();
    private DriverFactory(){
    }
    private static DriverFactory instance = new DriverFactory();

    public static DriverFactory getInstance(){
        return instance;
    }
    public void setDriver(WebDriver driverObj){
        driver.set(driverObj);
    }

    public WebDriver getDriver(){
        return driver.get();
    }
}
