package com.utility;

import java.io.File;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportUtility {

	ExtentSparkReporter extendSparkReport;
	static ExtentReports extentReport;
	static ThreadLocal<ExtentTest> LocalExtentTest = new ThreadLocal<ExtentTest>();

	public static void setupSparkReport(String reportName) {
		ExtentSparkReporter extendSparkReport = new ExtentSparkReporter(
				System.getProperty("user.dir") + "//Reports//" + reportName);
		extentReport = new ExtentReports();
		extentReport.attachReporter(extendSparkReport);

	}

	public static void createExtentTest(String testname) {
		ExtentTest test = extentReport.createTest(testname);
		LocalExtentTest.set(test);
	}

	public static ExtentTest getExtentTest() {
		return LocalExtentTest.get();
	}

	public static void flush() {
		extentReport.flush();
	}

}
