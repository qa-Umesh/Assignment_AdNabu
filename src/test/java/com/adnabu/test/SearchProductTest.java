package com.adnabu.test;

import org.testng.annotations.Test;

import com.adnabu.pages.HomePage;

import org.testng.AssertJUnit;
import static org.testng.Assert.assertEquals;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SearchProductTest extends BaseTest {

	private HomePage homePage;

	@BeforeMethod
	public void setup() {
		homePage = loginPage.loginWith("AdNabuQA");
	}

	@Test(description = "Verify that valid user is able to get search produc ")
	public void searchFunctionality() {
		AssertJUnit.assertEquals(homePage.searchProduct("Football - 2023 - Panini Illusions Football - Hobby Box (10 Packs)")
				.getProductText(), "Football - 2023 - Panini Illusions Football - Hobby Box (10 Packs)");
	}
	
	

}
