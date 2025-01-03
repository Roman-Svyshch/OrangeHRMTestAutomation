package com.romancode.test.iframe;

import com.romancode.test.constants.Constants;
import com.romancode.test.driver.DriverFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class IFrameActions {

    private Logger log = LogManager.getLogger(IFrameActions.class);

    public void waitFroIFrameAndSwitch(String idOrName){
        try {
            WebDriverWait wait = new WebDriverWait(DriverFactory
                    .getInstance()
                    .getDriver(), Duration.ofSeconds(Constants.EXPLICIT_WAIT_TIME));

            wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(idOrName));
            log.info("Switch to IFrame");
//            ExtentFactory.getInstance().passTest("Switched to iframe");
        }catch (Exception e){
            log.error("Error occured when switching to iFrame");
//            ExtentFactory.getInstance().failTest("Error occured while swithcing to iFrame");
        }

    }
    public void waitFroIFrameAndSwitch(int index){
        try {
            WebDriverWait wait = new WebDriverWait(DriverFactory
                    .getInstance()
                    .getDriver(), Duration.ofSeconds(Constants.EXPLICIT_WAIT_TIME));

            wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(index));
            log.info("Switch to IFrame");
//            ExtentFactory.getInstance().passTest("Switched to iframe");
        }catch (Exception e){
            log.error("Error occured when switching to iFrame");
//            ExtentFactory.getInstance().failTest("Error occured while swithcing to iFrame");
        }

    }

    public void switchToDefaultContent(){
        try {
            DriverFactory.getInstance().getDriver().switchTo().defaultContent();
            log.info("Switch to the default content");
//            ExtentFactory.getInstance().passTest("Switch to the default content");
        }catch (Exception e){
            log.error("Error occured when switching to back to the default content");
//            ExtentFactory.getInstance().failTest("\"Error occured when switching to back to the default content\"");
        }



    }





}
