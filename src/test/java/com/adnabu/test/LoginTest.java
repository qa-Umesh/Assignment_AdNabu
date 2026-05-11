package com.adnabu.test;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.adnabu.pojo.User;

@Listeners(com.adnabu.listners.MyTestListner.class)
public class LoginTest extends BaseTest {

//	@Test(description = "Verify that user is able to login with valid Password", dataProviderClass = com.adnabu.dataProvider.DataProviders.class, dataProvider = "loginDataProvider")
//	public void loginJSONTest(User user) {
//
//		assertEquals(loginPage.loginWith(user.getPassword()).getHomeText(), "Home");
//
//	}

//	@Test(description = "Verify that user is able to login with valid Password", dataProviderClass = com.adnabu.dataProvider.DataProviders.class, dataProvider = "loginCSVDataProvider")
//	public void loginCSVTest(User user) {
//
//		assertEquals(loginPage.loginWith(user.getPassword()).getHomeText(), "Home");
//
//	}

	@Test(description = "Verify that user is able to login with valid Password", dataProviderClass = com.adnabu.dataProvider.DataProviders.class, dataProvider = "loginExcelDataProvider", retryAnalyzer = com.adnabu.listners.MyRetryAnalyzer.class)
	public void loginExcelTest(User user) {

		assertEquals(loginPage.loginWith(user.getPassword()).getHomeText(), "Home");

	}

}
