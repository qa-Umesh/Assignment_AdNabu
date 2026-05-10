package com.adnabu.pages;

import static com.adnabu.constants.Env.UAT;

import org.openqa.selenium.By;

import com.adnabu.constants.Browser;
import com.adnabu.utility.BrowserUtility;
import com.adnabu.utility.PropertiesReaderUtility;

public class LoginPage extends BrowserUtility {

	public LoginPage(Browser browserName, boolean isHeadless) {
		super(browserName, isHeadless);
//		goToWebsite(JSONReaderUtility.readConfigJSON(Env.QA).getUrl());
		goToWebsite(PropertiesReaderUtility.readConfigProperties(UAT, "URl"));

	}

	public void quite() {
		getDiver().quit();
	}

	private static final By PASSWORD_TEXTBOX_LOCATOR = By.id("password");
	private static final By ENTER_BUTTON_LOCATOR = By.xpath("//button[text()=\"Enter\"]");

	public HomePage loginWith(String password) {
		enterText(PASSWORD_TEXTBOX_LOCATOR, password);
		clickOn(ENTER_BUTTON_LOCATOR);
		return new HomePage(getDiver());
	}

}
