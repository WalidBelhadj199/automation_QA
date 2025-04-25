package com.tests.automationQA.page_objects;

import com.tests.automationQA.base.BasePage;
import com.tests.automationQA.hooks.Setup;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class VerifAbonnAcceuilPage extends BasePage {
    @FindBy(how= How.XPATH, using= "//h2[normalize-space()='Subscription']")
    private static WebElement verifTextSubscription;
    @FindBy(how= How.ID, using= "susbscribe_email")
    private static WebElement champsEmail;
    @FindBy(how= How.ID, using= "subscribe")
    private static WebElement btnFléché;
    //@FindBy(how= How.XPATH, using= "//h2[normalize-space()='Subscription']")
  //  private static WebDriver verifTextSubscription;


    public VerifAbonnAcceuilPage() {
        super(Setup.getDriver());
    }
public static String getVerifTextSubscription(){
        waitForElementToBeVisible(verifTextSubscription);
        String msg = verifTextSubscription.getText();
        return msg;
}
    public static WebElement getChampsEmail(){
        waitForElementToBeVisible(champsEmail);
        return champsEmail;
    }
    public static WebElement getBtnFléchél(){
        waitForElementToBeClickable(btnFléché);
        return btnFléché;
    }












}
