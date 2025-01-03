package com.romancode.test.waits;


import com.romancode.test.constants.Constants;
import com.romancode.test.driver.DriverFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.checkerframework.checker.units.qual.C;

import java.time.Duration;

public class ImplicitWaitActions {

    private Logger log =  LogManager.getLogger(ImplicitWaitActions.class);

    public void setImplicitWait(){
       try {
           DriverFactory.getInstance()
                   .getDriver()
                   .manage()
                   .timeouts()
                   .implicitlyWait(Duration.ofSeconds(Constants.IMPLICIT_WAIT_TIME));
           log.info("Implicit wait time is :" + Constants.IMPLICIT_WAIT_TIME + " second");
       }catch (Exception e){
           log.error("Exception occurred while setting the implicit wait" + e.getMessage());

       }
    }

}
