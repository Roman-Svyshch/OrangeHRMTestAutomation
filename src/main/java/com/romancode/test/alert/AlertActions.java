package com.romancode.test.alert;

import com.romancode.test.driver.DriverFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;

public class AlertActions {

    private Logger log = LogManager.getLogger(AlertActions.class);
    private Alert alert;

    public void switchToAlert() {
        try {
            alert = DriverFactory.getInstance().getDriver().switchTo().alert();
            log.info("Switched to alert");
//            ExtentFactory.getInstance().passTest("Switched to alert");
        } catch (NoAlertPresentException e) {
            log.error("Exception occurred while switching to alert");
//            ExtentFactory.getInstance().failTest("Exception occurred while swithcing to alert");
        }
    }

    public void acceptAlert(){
        try {
            this.alert.accept();
            log.info("clicked on the OK button");
//            ExtentFactory.getInstance().passTest("clicked on the OK button");
        }catch (NoAlertPresentException e) {
            log.error("Exception occurred while clicking on OK button");
//            ExtentFactory.getInstance().failTest("Exception occurred while ckicking on the OK button");
        }
    }

    public void cancelAlert(){
        try {
            this.alert.dismiss();
            log.info("click cancel alert button");
//            ExtentFactory.getInstance().passTest("clicked on the cancel button");
        }catch (NoAlertPresentException e) {
            log.error("Exception occurred while clicking on cancel button");
//            ExtentFactory.getInstance().failTest("Exception occurred while clicking on the cancel button");
        }
    }

}
