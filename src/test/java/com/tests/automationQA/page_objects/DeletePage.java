package com.tests.automationQA.page_objects;

import com.tests.automationQA.base.BasePage;
import com.tests.automationQA.hooks.Setup;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DeletePage extends BasePage {
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
    private static WebElement verifMessVisib;
    @FindBy(how = How.XPATH, using = "//img[@alt='Website for automation practice']")
    private static WebElement verifPageDisplay;
    @FindBy(how = How.XPATH, using = "//b[normalize-space()='Account Deleted!']")
    private static WebElement MessDeletComp;
    @FindBy(how = How.XPATH, using = "//a[normalize-space()='Delete Account']")
    private static WebElement btnDelete;



    public DeletePage() {
        super(Setup.getDriver());
    }



    public static  WebElement  getBtnDelete() {
        waitForElementToBeClickable(btnDelete);
        return btnDelete;
    }
    public static  WebElement  getMessDeletComp() {
        waitForElementToBeClickable(MessDeletComp);
        return MessDeletComp;
    }
    public static WebElement getVerifMessDisplay() {
        waitForElementToBeClickable(verifMessVisib);
        return verifMessVisib;
    }

    public static WebElement getVerifPageDisplay() {
        waitForElementToBeClickable(verifPageDisplay);
        return verifPageDisplay;
    }
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
