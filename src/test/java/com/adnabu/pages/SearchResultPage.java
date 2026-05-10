package com.adnabu.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.adnabu.utility.BrowserUtility;

public class SearchResultPage extends BrowserUtility {

	public SearchResultPage(WebDriver driver) {
		super(driver);
	}

	public String getProductText(String productName) {
		return getVisibleText(getProductLocator(productName));
	}

	public ProductPage selectProduct(String productName) {
		clickOn(getProductLocator(productName));
		return new ProductPage(getDiver());

	}

}
