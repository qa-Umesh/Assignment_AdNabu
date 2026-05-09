package com.ui.test;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.AssertJUnit;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.ui.pojo.User;

@Listeners(com.ui.listners.MyTestListner.class)
public class LoginTest extends BaseTest {

//	@Test(description = "Verify that user is able to login with valid Password", dataProviderClass = com.ui.dataProvider.DataProviders.class, dataProvider = "loginDataProvider")
//	public void loginJSONTest(User user) {
//
//		AssertJUnit.assertEquals(loginPage.loginWith(user.getPassword()).getHomeText(), "Home");
//
//	}


//	@Test(description = "Verify that user is able to login with valid Password", dataProviderClass = com.ui.dataProvider.DataProviders.class, dataProvider = "loginCSVDataProvider")
//	public void loginCSVTest(User user) {
//
//		AssertJUnit.assertEquals(loginPage.loginWith(user.getPassword()).getHomeText(), "Home");
//
//	}

	@Test(description = "Verify that user is able to login with valid Password", dataProviderClass = com.ui.dataProvider.DataProviders.class, dataProvider = "loginExcelDataProvider", retryAnalyzer = com.ui.listners.MyRetryAnalyzer.class)
	public void loginExcelTest(User user) {

		AssertJUnit.assertEquals(loginPage.loginWith(user.getPassword()).getHomeText(), "Home");

	}

}
