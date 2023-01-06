package br.com.Andre_dev_ALS.automacaoAmazon.core;

import java.util.Collections;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverFactory {

	private static WebDriver driver;

	private DriverFactory() {
	}

	public static WebDriver getDriver() {
		
		ChromeOptions co = new ChromeOptions();
		co.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
		co.setExperimentalOption("useAutomationExtension", false);
		co.addArguments("--disable-notifications", "--no-sandbox", "--single-process", "--incognito", "--disable-blink-features=AutomationControlled");

		if (driver == null) {
			driver = new ChromeDriver(co);
			driver.manage().window().maximize();
		}

		return driver;
	}

	public static void killDriver() {

		if (driver != null) {
			driver.quit();
			driver = null;
		}
	}

}
