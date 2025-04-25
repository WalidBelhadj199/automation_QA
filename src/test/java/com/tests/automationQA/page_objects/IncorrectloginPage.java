package com.tests.automationQA.page_objects;

import com.tests.automationQA.base.BasePage;
import com.tests.automationQA.hooks.Setup;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class IncorrectloginPage extends BasePage {

    /* Retrieve Web Element */

    @FindBy(how= How.XPATH, using = "//a[normalize-space()='Signup / Login']")
    private static WebElement btnSignup;
    @FindBy(how=How.XPATH, using = "//h2[normalize-space()='Login to your account']")
    private static WebElement verfiMessage;
    @FindBy(how= How.XPATH, using = "//input[@data-qa='login-email']")
    private static WebElement champEmail;
    @FindBy(how=How.XPATH, using = "//input[@placeholder='Password']")
    private static WebElement champMdp;
    @FindBy(how=How.XPATH, using = "//button[normalize-space()='Login']")
    private static WebElement btnLogin;
    @FindBy(how = How.XPATH, using = "//p[normalize-space()='Your email or password is incorrect!']")
    private static WebElement incorrectEmailMdp;


    public IncorrectloginPage() {
        super(Setup.getDriver());
    }

public static WebElement getBtnSignup() {
        waitForElementToBeClickable(btnSignup);
        return btnSignup;
}

public static String getVerifMessage(){
        waitForElementToBeVisible(verfiMessage);
        String msg = verfiMessage.getText();
        return msg;
}
public static WebElement getChampEmail(){
        waitForElementToBeVisible(champEmail);
        return champEmail;
}
public static WebElement getChampMdp(){
    waitForElementToBeVisible(champMdp);
    return champMdp;
}
public  static WebElement getBtnLogin(){
        waitForElementToBeClickable(btnLogin);
        return btnLogin;
    }
public static String getIncorrectEmailMdp(){
        waitForElementToBeVisible(incorrectEmailMdp);
        String msg = incorrectEmailMdp.getText();
        return msg;
}





}
