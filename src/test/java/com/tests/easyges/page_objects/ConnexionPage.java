package com.tests.easyges.page_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.tests.easyges.base.BasePage;
import com.tests.easyges.hooks.Setup;

public class ConnexionPage extends BasePage {
	

	/* Retrieve Web Element */
	@FindBy(how = How.XPATH, using = "//a[normalize-space()='Signup / Login']")
	private static WebElement btnSignup;
	@FindBy(how = How.XPATH, using = "//input[@data-qa='login-email']")
	private static WebElement champsEmail;
	@FindBy(how = How.XPATH, using = "//input[@placeholder='Password']")
	private static WebElement champsPassword;
	@FindBy(how = How.XPATH, using = "//button[normalize-space()='Login']")
	private static WebElement btnLogin;
	@FindBy(how = How.XPATH, using = "//li[10]")
	private static WebElement verifPageAcceuil;
	
	
	public ConnexionPage() {
		super(Setup.getDriver());
		
	}
	
	/* Create methods */
	public static WebElement getBtnSignup() {
		waitForElementToBeClickable(btnSignup);
		return btnSignup;
	}
	
	
	public static WebElement getEmailField() {
		waitForElementToBeVisible(champsEmail);
		return champsEmail;
	}
	public static WebElement getPasswordField() {
		waitForElementToBeVisible(champsPassword);
		return champsPassword;
	}
	public static WebElement getBtnLogin() {
		waitForElementToBeClickable(btnLogin);
		return btnLogin;
	}
	
	public static String getVerifPage() {
		waitForElementToBeVisible(verifPageAcceuil);
		String msg =verifPageAcceuil.getText();
		return msg;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
