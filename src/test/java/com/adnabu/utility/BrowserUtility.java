package com.adnabu.utility;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.adnabu.constants.Browser;

public abstract class BrowserUtility {

	private Logger logger = LoggerUtility.getLogger(this.getClass());
	private static ThreadLocal<WebDriver> localDriver = new ThreadLocal<WebDriver>();
	private WebDriverWait wait;

	public BrowserUtility(Browser browserName) {
		if (browserName == Browser.CHROME) {
			localDriver.set(new ChromeDriver());
			wait = new WebDriverWait(localDriver.get(), Duration.ofSeconds(20));
		} else if (browserName == Browser.FIREFOX) {
			localDriver.set(new FirefoxDriver());
			wait = new WebDriverWait(localDriver.get(), Duration.ofSeconds(20));
		}

	}

	public BrowserUtility(Browser browserName, boolean isHeadless) {
		if (isHeadless) {
			logger.info("Browser is set to Headless Mode");
			if (browserName == Browser.CHROME) {
				logger.info("Opening Browser: " + browserName);
				ChromeOptions options = new ChromeOptions();
				options.addArguments("--headless=old");
				options.addArguments("--window-size=1920,1080");
				localDriver.set(new ChromeDriver(options));
				wait = new WebDriverWait(localDriver.get(), Duration.ofSeconds(20));
			} else if (browserName == Browser.FIREFOX) {
				logger.info("Opening Browser: " + browserName);
				FirefoxOptions options = new FirefoxOptions();
				options.addArguments("--headless=old");
				localDriver.set(new FirefoxDriver());
				wait = new WebDriverWait(localDriver.get(), Duration.ofSeconds(20));
			}

		} else {

			if (browserName == Browser.CHROME) {
				logger.info("Opening Browser: " + browserName);
				ChromeOptions options = new ChromeOptions();
				options.addArguments("--no-sandbox");
				options.addArguments("--disable-dev-shm-usage");
				options.addArguments("--window-size=1920,1080");
				localDriver.set(new ChromeDriver());
				wait = new WebDriverWait(localDriver.get(), Duration.ofSeconds(20));
			} else if (browserName == Browser.FIREFOX) {
				logger.info("Opening Browser: " + browserName);
				FirefoxOptions options = new FirefoxOptions();
				options.addArguments("--no-sandbox");
				options.addArguments("--disable-dev-shm-usage");
				options.addArguments("--window-size=1920,1080");
				localDriver.set(new FirefoxDriver());
				wait = new WebDriverWait(localDriver.get(), Duration.ofSeconds(20));
			}
		}

	}

	public BrowserUtility(WebDriver driver) {
		localDriver.set(driver);
		wait = new WebDriverWait(localDriver.get(), Duration.ofSeconds(20));
	}

	public WebDriver getDiver() {
		return localDriver.get();
	}

	public void goToWebsite(String url) {
		logger.info("Visiting the Website: " + url);
		localDriver.get().get(url);
	}

	public void enterText(By locator, String enterText) {
		logger.info("Finding the Locator: " + locator);
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		logger.info("WebElement Found Entering Text: " + enterText);
		element.sendKeys(enterText);
	}

	public void specialKey(By locator, Keys key) {
		logger.info("Finding the Locator: " + locator);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
		logger.info("WebElement Found Performing special Key: " + key);
		element.sendKeys(key);
	}

	public void clickOn(By locator) {
		logger.info("Finding the Locator: " + locator);
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		logger.info("WebElement Found performing click Action");
		element.click();
	}

	public void clickOn(WebElement element) {
		element.click();
	}

	public List<WebElement> getAllElement(By locator) {
		List<WebElement> allElements = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
		return allElements;
	}

	public String getVisibleText(By locator) {
		logger.info("Finding the Locator: " + locator);
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		logger.info("WebElement Found returning Visible Text: " + element.getText());
		return element.getText();
	}

	public String getVisibleText(WebElement element) {
		return element.getText();
	}

	public List<String> getAllVisibleText(By locator) {
		logger.info("Finding the Locator: " + locator);
		List<WebElement> listOfElement = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));

		List<String> visibleTextList = new ArrayList<String>();
		for (WebElement element : listOfElement) {
			visibleTextList.add(getVisibleText(element));
			return visibleTextList;
		}
		return null;

	}

	public By getProductLocator(String ProductName) {
		String[] strArray = ProductName.split(" ");
		StringBuffer finalProductLink = new StringBuffer();

		for (int i = 0; i <= strArray.length - 1; i++) {

			finalProductLink.append(strArray[i].replace(":", ""));
			if (i != strArray.length - 1) {
				finalProductLink.append("-");
			}

		}
		return By.xpath("//a[contains(@href,'/products/" + finalProductLink.toString().toLowerCase() + "')]");

	}

	public String getScreenshot(String screenShotName) {

		String filePath = "./screenshots" + File.separator + screenShotName + ".png";
		File Destination = new File(filePath);
		TakesScreenshot ts = (TakesScreenshot) localDriver.get();
		File sourceFile = ts.getScreenshotAs(OutputType.FILE);

		try {
			FileUtils.copyFile(sourceFile, Destination);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return filePath;
	}

}
