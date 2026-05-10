package com.adnabu.dataProvider;

import java.util.Iterator;

import org.testng.annotations.DataProvider;

import com.adnabu.pojo.User;
import com.adnabu.utility.CSVReaderUtility;
import com.adnabu.utility.ExcelReaderUtility;
import com.adnabu.utility.JSONReaderUtility;

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
