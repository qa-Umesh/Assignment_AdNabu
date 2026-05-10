package com.adnabu.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.adnabu.utility.BrowserUtility;

public class SearchResultPage extends BrowserUtility {

	public SearchResultPage(WebDriver driver) {
		super(driver);
	}

	private static final By PRODUCT_LINK_LOCATOR = By.xpath("//h3[@class='card__heading h5']//a");

	public String getProductText() {
		return getVisibleText(PRODUCT_LINK_LOCATOR);
	}

	public ProductPage selectProduct() {
		clickOn(PRODUCT_LINK_LOCATOR);
		ProductPage productPage = new ProductPage(getDiver());
		return productPage;

	}

}
