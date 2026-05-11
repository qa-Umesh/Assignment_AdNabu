package com.adnabu.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.adnabu.utility.BrowserUtility;

public class ProductPage extends BrowserUtility {

	public ProductPage(WebDriver driver) {
		super(driver);
	}

	private static final By ADD_TO_CART_BUTTON_LOCATOR = By.xpath("//button[contains(@id,'ProductSubmitButton')]");
	private static final By CART_ITEM_NAME=By.cssSelector(".cart-item__name");

	public ProductPage addProductToCart() {
		clickOn(ADD_TO_CART_BUTTON_LOCATOR);
		return new ProductPage(getDiver());
	}

	public String getCartConfirmationMessage() {
		return getVisibleText(CART_ITEM_NAME);
	}

}
