package com.adnabu.test;

import org.testng.AssertJUnit;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.adnabu.pojo.User;

@Listeners(com.adnabu.listners.MyTestListner.class)
public class LoginTest extends BaseTest {

//	@Test(description = "Verify that user is able to login with valid Password", dataProviderClass = com.adnabu.dataProvider.DataProviders.class, dataProvider = "loginDataProvider")
//	public void loginJSONTest(User user) {
//
//		AssertJUnit.assertEquals(loginPage.loginWith(user.getPassword()).getHomeText(), "Home");
//
//	}


//	@Test(description = "Verify that user is able to login with valid Password", dataProviderClass = com.adnabu.dataProvider.DataProviders.class, dataProvider = "loginCSVDataProvider")
//	public void loginCSVTest(User user) {
//
//		AssertJUnit.assertEquals(loginPage.loginWith(user.getPassword()).getHomeText(), "Home");
//
//	}

	@Test(description = "Verify that user is able to login with valid Password", dataProviderClass = com.adnabu.dataProvider.DataProviders.class, dataProvider = "loginExcelDataProvider", retryAnalyzer = com.adnabu.listners.MyRetryAnalyzer.class)
	public void loginExcelTest(User user) {

		AssertJUnit.assertEquals(loginPage.loginWith(user.getPassword()).getHomeText(), "Home");

	}

}
