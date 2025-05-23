package com.tests.automationQA.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxDriverManager implements DriverManager {

	@Override
	public WebDriver createDriver() {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		return driver;
	}
}
