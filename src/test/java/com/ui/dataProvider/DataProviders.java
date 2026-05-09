package com.ui.dataProvider;

import java.util.Iterator;

import org.testng.annotations.DataProvider;

import com.ui.pojo.User;
import com.utility.CSVReaderUtility;
import com.utility.ExcelReaderUtility;
import com.utility.JSONReaderUtility;

public class DataProviders {

	@DataProvider(name = "loginJSONDataProvider")
	public Iterator<Object[]> loginJSONData() {
		Iterator<Object[]> user = JSONReaderUtility.readLoginJSON();
		return user;
	}

	@DataProvider(name = "loginCSVDataProvider")
	public Iterator<User> loginCSVData() {
		return CSVReaderUtility.readLoginCSV();
	}

	@DataProvider(name="loginExcelDataProvider")
	public Iterator<User> loginExcelData() {
		return ExcelReaderUtility.loginExcelData();
	}

}
