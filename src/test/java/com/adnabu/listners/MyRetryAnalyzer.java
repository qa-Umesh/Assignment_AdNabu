package com.adnabu.listners;

import static com.adnabu.constants.Env.*;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

import com.adnabu.utility.JSONReaderUtility;

public class MyRetryAnalyzer implements IRetryAnalyzer {

	private static int count = 0;
	private static final int MAX_CHANGES = JSONReaderUtility.readConfigJSON(QA).getMAX_NO_OF_ATTEMP();

	@Override
	public boolean retry(ITestResult result) {
		while (count < MAX_CHANGES) {
			count++;
			return true;

		}
		return false;
	}

}
