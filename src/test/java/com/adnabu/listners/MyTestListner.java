package com.adnabu.listners;

import org.apache.logging.log4j.Logger;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.adnabu.test.BaseTest;
import com.adnabu.utility.BrowserUtility;
import com.adnabu.utility.ExtentReportUtility;
import com.adnabu.utility.LoggerUtility;
import com.aventstack.extentreports.Status;

public class MyTestListner implements ITestListener {

	private Logger logger = LoggerUtility.getLogger(this.getClass());

	public void onStart(ITestContext context) {
		logger.info("Test Sute started");
		ExtentReportUtility.setupSparkReport("Report.html");
	}

	public void onTestStart(ITestResult result) {
		logger.info(result.getMethod().getMethodName());
		logger.info(result.getMethod().getDescription());
		ExtentReportUtility.createExtentTest(result.getMethod().getMethodName());
	}

	public void onTestSuccess(ITestResult result) {
		logger.info(result.getMethod().getMethodName() + " " + "PASSED");
		ExtentReportUtility.getExtentTest().log(Status.PASS, result.getMethod().getMethodName());
		
		Object testClass = result.getInstance();
		BrowserUtility browserUtility = ((BaseTest) testClass).getInstance();
		String screenshotPath = browserUtility.getScreenshot(result.getMethod().getMethodName());
		ExtentReportUtility.getExtentTest().addScreenCaptureFromPath(screenshotPath);
		
	}

	public void onTestFailure(ITestResult result) {
		logger.info(result.getMethod().getMethodName() + " " + "FAILED");

		ExtentReportUtility.getExtentTest().log(Status.FAIL, result.getMethod().getMethodName());
		Object testClass = result.getInstance();
		BrowserUtility browserUtility = ((BaseTest) testClass).getInstance();
		String screenPath = browserUtility.getScreenshot(result.getMethod().getMethodName().toString());
		ExtentReportUtility.getExtentTest().addScreenCaptureFromPath(screenPath);
	}

	public void onTestSkipped(ITestResult result) {
		logger.info(result.getMethod().getMethodName() + " " + "SKIPPED");

		ExtentReportUtility.getExtentTest().log(Status.SKIP, result.getMethod().getMethodName());
	}

	public void onFinish(ITestContext context) {
		logger.info("Test Suite Completed");
		ExtentReportUtility.flush();
	}
}
