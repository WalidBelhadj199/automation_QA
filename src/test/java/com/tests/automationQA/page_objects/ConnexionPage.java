package com.tests.automationQA.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.tests.automationQA.base.BasePage;
import com.tests.automationQA.hooks.Setup;

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
	@FindBy(how = How.XPATH, using = "//li[10]//a[1]")
	private static WebElement verifPageAcceuil;
	@FindBy(how = How.XPATH, using = "//h2[normalize-space()='Login to your account']")
	private static WebElement verifMessAcceuil;


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

	public static WebElement getVerifMessAcceuil() {
		waitForElementToBeClickable(verifMessAcceuil);
		return verifMessAcceuil;
	}
	public static WebElement getVerifPageAcceuil() {
		waitForElementToBeClickable(verifPageAcceuil);
		return verifPageAcceuil;
	}


	public static String getVerifPageAcceuil1() {
		waitForElementToBeClickable(verifPageAcceuil);
		String msg = verifPageAcceuil.getText();
		return msg;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
