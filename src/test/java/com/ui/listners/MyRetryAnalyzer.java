package com.ui.listners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

import com.ui.constants.Env;
import com.utility.JSONReaderUtility;

public class MyRetryAnalyzer implements IRetryAnalyzer {

	private static int count = 0;
	private static final int MAX_CHANGES = JSONReaderUtility.readConfigJSON(Env.QA).getMAX_NO_OF_ATTEMP();

	@Override
	public boolean retry(ITestResult result) {
		while (count < MAX_CHANGES) {
			count++;
			return true;

		}
		return false;
	}

}
