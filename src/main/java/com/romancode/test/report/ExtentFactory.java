//package com.romancode.test.report;
//
//import com.aventstack.extentreports.ExtentTest;
//import com.aventstack.extentreports.MediaEntityBuilder;
//import com.aventstack.extentreports.Status;
//import com.aventstack.extentreports.markuputils.ExtentColor;
//import com.aventstack.extentreports.markuputils.MarkupHelper;
//import com.romancode.test.driver.DriverFactory;
//import org.apache.commons.io.FileUtils;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
//
//import java.io.File;
//import java.io.IOException;
//import java.util.Base64;
//
//public class ExtentFactory {
//    ThreadLocal <ExtentTest> extent = new ThreadLocal<>();
//
//    private ExtentFactory (){
//    }
//    private static ExtentFactory instance = new ExtentFactory();
//
//    public static ExtentFactory getInstance() {
//        return instance;
//    }
//    public void setExtent(ExtentTest obj) {
//        extent.set(obj);
//    }
//
//    public ExtentTest getExtent() {
//        return extent.get();
//    }
//
//    public void removeTest(){
//        extent.remove();
//    }
//
//    public static String captureAppScreenShot(){
//
//        TakesScreenshot screenshot = (TakesScreenshot) DriverFactory.getInstance().getDriver();
//
//        File file = screenshot.getScreenshotAs(OutputType.FILE);
//        byte[]fileContent = null;
//        try {
//            fileContent = FileUtils.readFileToByteArray(file);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//        return Base64.getEncoder().encodeToString(fileContent);
//    }
//
//    public static void clickPass(String  btnName){
//        getInstance().getExtent().pass(btnName + " button is clicked");
//    }
//    public static void clickFail(String  btnName){
//        getInstance().getExtent().fail(" Error occured while clicking on " + btnName);
//    }
//    public static void sendKeysPass(String value,String elementName){
//        getInstance().getExtent().pass(value + " is entered in " + elementName );
//    }
//    public static void sendKeysFail(String value,String elementName){
//        getInstance().getExtent().fail("Error occured while entering value " + value +  " in " + elementName);
//    }
//    public static void passTest(String message){
//        getInstance().getExtent().log(Status.PASS, MarkupHelper.createLabel(message, ExtentColor.GREEN));
//    }
//    public static void failTest(String message){
//        getInstance().getExtent().fail(message,
//                MediaEntityBuilder.createScreenCaptureFromBase64String(captureAppScreenShot())
//                        .build());
//    }
//
//
//}
