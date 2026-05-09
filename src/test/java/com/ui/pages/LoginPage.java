package com.ui.pages;

import org.openqa.selenium.By;

import com.ui.constants.Browser;
import com.ui.constants.Env;
import com.utility.BrowserUtility;
import com.utility.JSONReaderUtility;
import com.utility.PropertiesReaderUtility;

public class LoginPage extends BrowserUtility {

	public LoginPage(Browser browserName, boolean isHeadless) {
		super(browserName, isHeadless);
//		goToWebsite("https://adnabu-store-assignment1.myshopify.com/");
//		goToWebsite(JSONReaderUtility.readConfigJSON(Env.QA).getUrl());
		goToWebsite(PropertiesReaderUtility.readConfigProperties(Env.UAT, "URl"));

	}

	public void quite() {
		getDiver().quit();
	}

	private static final By PASSWORD_TEXTBOX_LOCATOR = By.id("password");
	private static final By ENTER_BUTTON_LOCATOR = By.xpath("//button[text()=\"Enter\"]");

	public HomePage loginWith(String password) {
		enterText(PASSWORD_TEXTBOX_LOCATOR, password);
		clickOn(ENTER_BUTTON_LOCATOR);
		HomePage homePage = new HomePage(getDiver());
		return homePage;
	}

}
