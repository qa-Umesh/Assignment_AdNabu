package com.adnabu.test;

import static org.testng.Assert.*;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.adnabu.pages.HomePage;

public class SearchProductTest extends BaseTest {

	private HomePage homePage;
	private static final String PRODUCT_NAME="The Collection Snowboard: Liquid";

	@BeforeMethod
	public void setup() {
		homePage = loginPage.loginWith("AdNabuQA");
	}

	@Test(description = "Verify user can search product using valid product name")
	public void searchProductTest() {
		assertEquals(homePage.searchProduct(PRODUCT_NAME)
				.getProductText(PRODUCT_NAME), PRODUCT_NAME);
	}
	
	

}
