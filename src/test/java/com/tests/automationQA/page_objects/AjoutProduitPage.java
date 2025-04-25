package com.tests.automationQA.page_objects;

import com.tests.automationQA.base.BasePage;
import com.tests.automationQA.hooks.Setup;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AjoutProduitPage extends BasePage {


    @FindBy(how= How.XPATH, using= "//a[@href='/products']")
    private static WebElement btnProduct;
    @FindBy(how= How.XPATH, using= "//body/section/div[@class='container']/div[@class='row']/div[@class='col-sm-9 padding-right']/div[@class='features_items']/div[2]/div[1]/div[1]/div[1]")
   private static WebElement premierProduit;
   // @FindBy(how = How.XPATH, using = "(//a[@class='add-to-cart'])[1]")
    //private static WebElement btnAjouterAuPanier;
    @FindBy(how = How.XPATH, using = "(//div[@class='product-overlay'])[1]//a[@class='btn btn-default add-to-cart']")
    private static WebElement btnAjouterAuPanier;
    @FindBy(how = How.XPATH, using = "//div[@class='modal-content']//button[contains(@class,'close-modal')]")
    private static WebElement btnContinuerLesAchats;
    @FindBy(how= How.XPATH, using= "//body/section/div[@class='container']/div[@class='row']/div[@class='col-sm-9 padding-right']/div[@class='features_items']/div[3]/div[1]/div[1]/div[1]")
    private static WebElement deuxièmeProduct;
    @FindBy(how = How.XPATH, using = "(//div[@class='product-overlay'])[2]//a[@class='btn btn-default add-to-cart']")
    private static WebElement btn2AjouterAuPanier;


    @FindBy(how= How.XPATH, using= "//body[1]/header[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[3]/a[1]")
    private static WebElement btnCart;
   @FindBy(how= How.XPATH, using= "//a[normalize-space()='Blue Top']")
    private static WebElement verifProduct1;
    @FindBy(how= How.XPATH, using= "//a[normalize-space()='Men Tshirt']")
    private static WebElement verifProduct2;

    @FindBy(how= How.XPATH, using= "//td[@class='cart_price']//p[contains(text(),'Rs. 500')]")
    private static WebElement prixProdct1;
    @FindBy(how= How.XPATH, using= "//tr[@id='product-1']//button[@class='disabled'][normalize-space()='1']")
    private static WebElement qtéProdct1;
    @FindBy(how= How.XPATH, using= "//p[@class='cart_total_price'][normalize-space()='Rs. 500']")
    private static WebElement totalProdct1;





    public AjoutProduitPage() {
        super(Setup.getDriver());
    }

    public static WebElement getBtnProduct(){
        waitForElementToBeClickable(btnProduct);
        return btnProduct;
    }
    public static WebElement getBtnPremierProduit(){
        waitForElementToBeClickable(premierProduit);
        return premierProduit;
    }
    public static WebElement getBtnAjouterAuPanier(){
        waitForElementToBeClickable(btnAjouterAuPanier);
        return btnAjouterAuPanier;
    }
    public static WebElement getBtnContinuerLesAchats(){
        waitForElementToBeClickable(btnContinuerLesAchats);
        return btnContinuerLesAchats;
    }
    public static WebElement getBtnDeuxièmeProduit(){
        waitForElementToBeClickable(deuxièmeProduct);
        return deuxièmeProduct;
    }
    public static WebElement getBtn2AjouterAuPanier(){
        waitForElementToBeClickable(btn2AjouterAuPanier);
        return btn2AjouterAuPanier;
    }
    public static WebElement getBtnCart(){
        waitForElementToBeClickable(btnCart);
        return btnCart;
    }
    public static String getVerifProduct1(){
        waitForElementToBeClickable(verifProduct1);
        String msg = verifProduct1.getText();
        return msg;
    }
    public static String getVerifProduct2(){
        waitForElementToBeClickable(verifProduct2);
        String msg = verifProduct2.getText();
        return msg;
    }public static String getPrixProduct1(){
        waitForElementToBeClickable(prixProdct1);
        String msg = prixProdct1.getText().replaceAll("[^0-9]", "");
        return msg;
    }
    public static String getQtéProduct1(){
        waitForElementToBeClickable(qtéProdct1);
        String msg = qtéProdct1.getText().replaceAll("[^0-9]", "");
        return msg;
    }
    public static String getTotalProduct1(){
        waitForElementToBeClickable(totalProdct1);
        String msg = totalProdct1.getText().replaceAll("[^0-9]", "");
        return msg;
    }










}
