package com.romancode.test.base;

import com.romancode.test.alert.AlertActions;
import com.romancode.test.iframe.IFrameActions;
import com.romancode.test.waits.ExplicitWaitActoinos;
import org.openqa.selenium.WebElement;

public class BasePage {

//    protected AlertActions alertActions;

//    protected IFrameActions iFrameActions;
//    protected JavaScriptActions javaScriptActions;
    protected ExplicitWaitActoinos explicitWaitActoinos;

    protected BasePage() {
//        alertActions = new AlertActions();
//        iFrameActions = new IFrameActions();
//        javaScriptActions = new JavaScriptActions();
        explicitWaitActoinos = new ExplicitWaitActoinos();
    }

    public void click(WebElement element,String elementName){

        explicitWaitActoinos.waitForElementTBeClickable(element,elementName);
        element.click();
//        ExtentFactory.getInstance().passTest(elementName + "is clicked");
    }

    public void sendKeys(WebElement webElement,String elementName,String value){
        explicitWaitActoinos.waitForElementTBePresent(webElement,elementName);
        webElement.clear();
        webElement.sendKeys(value);
//        ExtentFactory.getInstance().passTest(value + " is enteredin " + elementName);
    }

    public boolean isElementSelected(WebElement webElement,String  elementName){
        explicitWaitActoinos.waitForElementTBePresent(webElement,elementName);
        return webElement.isSelected();
    }

    public void selectCheckBox(WebElement webElement,String elementName){
        if (!this.isElementSelected(webElement, elementName)){
            this.click(webElement,elementName);
        }
        else {
//            ExtentFactory.getInstance().failTest(elementName + "is already selected");
        }
    }
}
