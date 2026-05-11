package com.adnabu.test;

import static org.testng.Assert.*;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.adnabu.pages.HomePage;

public class SearchProductTest extends BaseTest {

	private HomePage homePage;
	private static final String VALID_PRODUCT_NAME = "The Collection Snowboard: Liquid";
	private static final String INVALID_PRODUCT_NAME = "Cricket Bat";

	@BeforeMethod
	public void setup() {
		homePage = loginPage.loginWith("AdNabuQA");
	}

	@Test(description = "Verify user can search product using valid product name")
	public void verifyValidProductSearchTest() {
		boolean actualResult = homePage.searchProduct(VALID_PRODUCT_NAME)
				.isSearchTermPresentInProductList(VALID_PRODUCT_NAME);
		assertEquals(actualResult, true);
	}

	@Test(description = "Verify system behavior when searching invalid/non-existing product.")
	public void verifyInvalidProductSearchTest() {
		boolean actualResult = homePage.searchProduct(INVALID_PRODUCT_NAME)
				.isSearchTermPresentInProductList(INVALID_PRODUCT_NAME);
		assertEquals(actualResult, false);
	}

}
