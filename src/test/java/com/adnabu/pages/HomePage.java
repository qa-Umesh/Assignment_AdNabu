package com.adnabu.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.adnabu.utility.BrowserUtility;

public class HomePage extends BrowserUtility {

	public HomePage(WebDriver driver) {
		super(driver);
	}

	private static final By HOME_TEXT_LOCATOR = By.xpath("//span[text()='Home']");
	private static final By SEARCH_ICON_LOCATOR = By.xpath("//details-modal[@class=\"header__search\"]");
	private static final By SEARCH_TEXT_BOX_LOCATOR = By.id("Search-In-Modal");

	public String getHomeText() {
		return getVisibleText(HOME_TEXT_LOCATOR);
	}

	public SearchResultPage searchProduct(String ProductName) {
		clickOn(SEARCH_ICON_LOCATOR);
		enterText(SEARCH_TEXT_BOX_LOCATOR, ProductName);
		specialKey(SEARCH_TEXT_BOX_LOCATOR, Keys.ENTER);
		return new SearchResultPage(getDiver());
	}

}
