package com.ui.test;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import static org.testng.Assert.assertEquals;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ui.pages.ProductPage;

public class AddToCartTest extends BaseTest {

	private ProductPage productPage;

	@BeforeMethod
	public void setup() {
		productPage = loginPage.loginWith("AdNabuQA").searchProduct("The Collection Snowboard: Liquid").selectProduct();

	}

	@Test(description = "Verify that valid user is able to add product into the cart")
	public void AddProductToCart() {
		AssertJUnit.assertEquals(productPage.addProductToCart().getAddToCartConfirmation(), "Your cart");
	}

}
