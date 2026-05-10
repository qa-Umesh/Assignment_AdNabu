package com.adnabu.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.adnabu.utility.BrowserUtility;

public class ProductPage extends BrowserUtility {

	public ProductPage(WebDriver driver) {
		super(driver);
	}

	private static final By ADD_TO_CART_BUTTON_LOCATOR = By.xpath("//button[contains(@id,'ProductSubmitButton')]");
	private static final By ADD_TO_CART_TEXT_LOCATOR=By.xpath("//h2[contains(text(),\"Your cart\")]");

	public ProductPage addProductToCart() {
		clickOn(ADD_TO_CART_BUTTON_LOCATOR);
		ProductPage productPage = new ProductPage(getDiver());
		return productPage;
	}
	
	public String getAddToCartConfirmation() {
		return getVisibleText(ADD_TO_CART_TEXT_LOCATOR);
	}

}
