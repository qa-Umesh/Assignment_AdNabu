package com.adnabu.pages;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.adnabu.utility.BrowserUtility;

public class SearchResultPage extends BrowserUtility {

	public SearchResultPage(WebDriver driver) {
		super(driver);
	}

	private static final By ALL_PRODUCT_LINK_LIST_NAME = By.xpath("//h3[contains(@class,'card__heading')]//a");
	private static final By ALL_PRODUCT_LIST_NAME = By.xpath("//a[contains(@id,'CardLink')]");

	public boolean isSearchTermPresentInProductList(String searchTerm) {
		List<String> keywordList = Arrays.asList(searchTerm.toLowerCase().split(" "));
		List<String> productNames = new ArrayList<>();
		List<WebElement> products = getAllElement(ALL_PRODUCT_LINK_LIST_NAME);
		
		for (WebElement product : products) {
			String text = ((JavascriptExecutor) getDiver()).executeScript("return arguments[0].innerText;", product)
					.toString();
			if (!text.isEmpty()) {
				productNames.add(text.toLowerCase());
			}
		}
		return productNames.stream().anyMatch(name -> keywordList.stream().anyMatch(name::contains));
	}

	public ProductPage clickOnTheProductAtIndex(int index) {
		clickOn(getAllElement(ALL_PRODUCT_LIST_NAME).get(index));
		return new ProductPage(getDiver());

	}

}
