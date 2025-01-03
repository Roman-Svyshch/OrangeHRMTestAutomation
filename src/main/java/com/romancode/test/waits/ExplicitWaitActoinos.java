package com.romancode.test.waits;

import com.romancode.test.constants.Constants;
import com.romancode.test.driver.DriverFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExplicitWaitActoinos {
    private Logger log = LogManager.getLogger(ExplicitWaitActoinos.class);
    public void waitForElementTBePresent(WebElement webElement,String elementName){
    try{
            WebDriverWait wait
                    = new WebDriverWait(DriverFactory
                    .getInstance()
                    .getDriver(), Duration.ofSeconds(Constants.EXPLICIT_WAIT_TIME));
            wait.until(ExpectedConditions.visibilityOf(webElement));
            log.info(elementName + " is available on the screen");
    }catch (Exception e){
        log.error("Exception occurred while waiting for element to be visible " + e.getMessage());
//        ExtentFactory.getInstance().failTest("Exception occurred while waiting for element to be visible ");
    }
    }

    public void waitForElementTBeClickable(WebElement webElement,String elementName){
        try{
            WebDriverWait wait
                    = new WebDriverWait(DriverFactory
                    .getInstance()
                    .getDriver(), Duration.ofSeconds(Constants.EXPLICIT_WAIT_TIME));
            wait.until(ExpectedConditions.elementToBeClickable(webElement));
            log.info(elementName + " is clickable on the screen");
        }catch (Exception e){
            log.error("Exception occurred while waiting for element to be clickable " + e.getMessage());
//            ExtentFactory.getInstance().failTest("Exception occurred while waiting for element to be clickable ");
        }
    }
}
