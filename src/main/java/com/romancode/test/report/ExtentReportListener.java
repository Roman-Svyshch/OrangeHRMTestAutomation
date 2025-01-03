//package com.romancode.test.report;
//
//import com.aventstack.extentreports.ExtentReports;
//import com.aventstack.extentreports.ExtentTest;
//import com.aventstack.extentreports.Status;
//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
//import org.testng.ITestContext;
//import org.testng.ITestListener;
//import org.testng.ITestResult;
//
//
//
//public class ExtentReportListener implements ITestListener {
//    private static Logger log = LogManager.getFormatterLogger(ExtentReportListener.class);
//
//    private ExtentReports extentReports;
//    private ExtentTest extentTest;
//
//    @Override
//    public void onTestStart(ITestResult result) {
//    this.extentTest = extentReports.createTest(result.getName());
//
//    ExtentFactory.getInstance().setExtent(extentTest);
//    log.info("test is added in pool");
//    }
//
//    @Override
//    public void onTestSuccess(ITestResult result) {
//
//        ExtentFactory.getInstance().passTest(result.getName());
//    }
//
//    @Override
//    public void onTestFailure(ITestResult result) {
//        ExtentFactory.getInstance().getExtent().fail("Exception details " + result.getThrowable().getMessage());
//    }
//
//    @Override
//    public void onTestSkipped(ITestResult result) {
//        ExtentFactory.getInstance().getExtent().log(Status.SKIP,"Test case " + result.getName() + " skipped");
//
//    }
//
//    @Override
//    public void onStart(ITestContext context) {
//        this.extentReports = ExtentReportManager.setUpExtentReport();
//    }
//
//    @Override
//    public void onFinish(ITestContext context) {
//        this.extentReports.flush();
//    }
//}
