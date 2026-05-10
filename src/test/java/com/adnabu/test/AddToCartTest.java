package com.adnabu.test;

import static org.testng.Assert.*;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.adnabu.pages.ProductPage;

public class AddToCartTest extends BaseTest {

	private ProductPage productPage;
	private static final String PRODUCT_NAME = "The Collection Snowboard: Liquid";

	@BeforeMethod()
	public void setup() {
		productPage = loginPage.loginWith("AdNabuQA").searchProduct(PRODUCT_NAME).selectProduct(PRODUCT_NAME);
	}

	@Test(description = "Verify user can add product to cart successfully")
	public void AddProductToCartTest() {
		assertEquals(productPage.addProductToCart().getCartConfirmationMessage(PRODUCT_NAME), PRODUCT_NAME);
	}

}
