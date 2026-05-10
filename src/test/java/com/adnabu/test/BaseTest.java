package com.adnabu.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.adnabu.constants.Browser;
import com.adnabu.pages.LoginPage;
import com.adnabu.utility.BrowserUtility;

public abstract class BaseTest {

	protected LoginPage loginPage;

	@Parameters({ "browser", "isheadless" })
	@BeforeMethod
	public void SetUp(@Optional("FIREFOX") String browser, @Optional("true") boolean isheadless) {
		loginPage = new LoginPage(Browser.valueOf(browser.toUpperCase()), isheadless);
	}

	@AfterMethod
	public void quite() {
		loginPage.quite();
	}

	public BrowserUtility getInstance() {
		return loginPage;
	}

}
