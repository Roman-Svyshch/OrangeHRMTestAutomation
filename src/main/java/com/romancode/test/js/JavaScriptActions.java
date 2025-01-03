package com.romancode.test.js;

import com.romancode.test.driver.DriverFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class JavaScriptActions {
    private Logger log = LogManager.getLogger(JavaScriptActions.class);


    public void click(WebElement element){
        try {
            JavascriptExecutor js = (JavascriptExecutor) DriverFactory.getInstance().getDriver();
            js.executeScript("arguments[0].click()",element);
            log.info("element is clicked");
//            ExtentFactory.getInstance().passTest("Element clicked using js");
        }

        catch (Exception e){
            log.error("Excpetion occured while clicking on element using js");
//            ExtentFactory.getInstance().failTest("Excpetion occured while clicking on element using js");
        }
    }

    public void sendKeys(WebElement element,String value){
        try {
            JavascriptExecutor js = (JavascriptExecutor) DriverFactory.getInstance().getDriver();
            js.executeScript("arguments[0].value=" + "'"+ value + "'",element );

            log.info(value + " is entered");
//            ExtentFactory.getInstance().passTest(value + "is entered");
        }

        catch (Exception e){
            log.error("Excpetion occured while clicking on value " + value);
//            ExtentFactory.getInstance().failTest("\"Excpetion occured while clicking on value \" + value");
        }
    }

    public void scrollPageToViewElement(WebElement element){
        try {
            JavascriptExecutor js = (JavascriptExecutor) DriverFactory.getInstance().getDriver();
            js.executeScript("arguments[0].scrollIntoView(true)",element );

            log.info("Element is visible on the page");
//            ExtentFactory.getInstance().passTest("Element is visible on the page");
        }

        catch (Exception e){
            log.error("Excpetion occured while scrolling page to the element  " + element,e.getMessage());
//            ExtentFactory.getInstance().failTest("Excpetion occured while scrolling page to the element  ");
        }
    }


    public void scrollPageToTheEnd(){
        try {
            JavascriptExecutor js = (JavascriptExecutor) DriverFactory.getInstance().getDriver();
            js.executeScript("window.scroll(0,document.body.scrollHeight)");

            log.info("Scroll to the end of the page");
//            ExtentFactory.getInstance().passTest("Scroll to the end of the page");
        }

        catch (Exception e){
            log.error("Excpetion occured while scrolling page to the end  ",e.getMessage());
//            ExtentFactory.getInstance().failTest("Excpetion occured while scrolling page to the end  ");
        }
    }

}
