package com.tests.automationQA.page_objects;

import com.tests.automationQA.base.BasePage;
import com.tests.automationQA.hooks.Setup;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RechercheProduitPage extends BasePage {

    @FindBy(how= How.XPATH, using = "//a[@href='/products']")
    private static WebElement btnProduct;
    @FindBy(how= How.XPATH, using = "//input[@id='search_product']")
    private static WebElement champsRechercheProduit;
    @FindBy(how= How.XPATH, using = "//button[@id='submit_search']")
    private static WebElement btnRechercher;



    public RechercheProduitPage() {
        super(Setup.getDriver());
    }



    public static WebElement getBtnProduct(){
        waitForElementToBeClickable(btnProduct);
        return btnProduct;
    }
    public static WebElement getChampsSaisie(){
        waitForElementToBeVisible(champsRechercheProduit);
        return champsRechercheProduit;
    }
    public static WebElement getBtnRechercher(){
        waitForElementToBeClickable(btnRechercher);
        return btnRechercher;
    }

















}
