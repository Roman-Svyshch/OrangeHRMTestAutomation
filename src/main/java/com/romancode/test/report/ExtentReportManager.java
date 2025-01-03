//package com.romancode.test.report;
//
//import com.aventstack.extentreports.ExtentReports;
//import com.aventstack.extentreports.reporter.ExtentSparkReporter;
//import com.romancode.test.constants.Constants;
//
//public class ExtentReportManager {
//    public static ExtentReports  setUpExtentReport(){
//        ExtentSparkReporter reporter = new ExtentSparkReporter(Constants.EXECUTION_REPORT_PATH);
//        ExtentReports extent = new ExtentReports();
//
//        extent.attachReporter(reporter);
//
//        return  extent;
//    }
//}
