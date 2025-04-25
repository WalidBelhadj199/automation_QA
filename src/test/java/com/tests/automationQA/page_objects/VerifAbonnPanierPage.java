package com.tests.automationQA.page_objects;

import com.tests.automationQA.base.BasePage;
import com.tests.automationQA.hooks.Setup;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class VerifAbonnPanierPage extends BasePage {

    @FindBy(how= How.XPATH, using= "//body[1]/header[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[3]/a[1]")
    private static WebElement btnPanier;
    @FindBy(how= How.XPATH, using= "//h2[normalize-space()='Subscription']")
    private static WebElement verifTextSubscription;
    @FindBy(how= How.ID, using= "susbscribe_email")
    private static WebElement champsEmail;
    @FindBy(how= How.ID, using= "subscribe")
    private static WebElement btnFléché;




    public VerifAbonnPanierPage() {
        super(Setup.getDriver());
    }

    public static WebElement getBtnPanier(){
        waitForElementToBeClickable(btnPanier);
        return btnPanier;
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
