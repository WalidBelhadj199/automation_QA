package com.tests.automationQA.page_objects;

import com.tests.automationQA.base.BasePage;
import com.tests.automationQA.hooks.Setup;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class IncreaseQuantityPage extends BasePage {

    @FindBy(how = How.XPATH, using = "//body[1]/section[2]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[2]/ul[1]/li[1]/a[1]")
    private static WebElement btnViewProduct;
    @FindBy(how = How.XPATH, using = "//h2[normalize-space()='Men Tshirt']")
    private static WebElement menTshirt;
    @FindBy(how = How.XPATH, using = "//span[normalize-space()='Rs. 400']")
    private static WebElement priceTshirt;
    @FindBy(how = How.ID, using = "quantity")
    private static WebElement btnIncreaseQty;
    @FindBy(how = How.XPATH, using = "//button[normalize-space()='Add to cart']")
    private static WebElement btnAddToCart;
    @FindBy(how = How.XPATH, using = "//div[@class='modal-content']//button[contains(@class,'close-modal')]")
    private static WebElement btnContinueShopping;
    @FindBy(how = How.XPATH, using = "//body[1]/header[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[3]/a[1]")
    private static WebElement btnCart;
    @FindBy(how = How.XPATH, using = " //a[normalize-space()='Men Tshirt']")
    private static WebElement verifyNameProduct;
    @FindBy(how = How.XPATH, using = " //p[normalize-space()='Rs. 400']")
    private static WebElement verifyPrice;
    @FindBy(how = How.XPATH, using = "//*[contains(@name, 'quantity')]")
    private static WebElement verifyQty;
//input[contains(@name, 'quantity')]


    public IncreaseQuantityPage() {
        super(Setup.getDriver());
    }

    public static WebElement getBtnViewProduct(){
        waitForElementToBeVisible(btnViewProduct);
        return btnViewProduct;
    }
    public static String getNameProduct(){
        waitForElementToBeVisible(menTshirt);
        String msg = menTshirt.getText();
        return msg;
    }
    public static String getPriceTshirt(){
        waitForElementToBeVisible(priceTshirt);
        String msg = priceTshirt.getText();
        return msg;
    }
    public static WebElement getBtnIncreaseQty(){
        waitForElementToBeVisible(btnIncreaseQty);
        return btnIncreaseQty;
    }
    public static WebElement getBtnAddToCart(){
        waitForElementToBeClickable(btnAddToCart);
        return btnAddToCart;
    }
    public static WebElement getBtnContinueShopping(){
        waitForElementToBeClickable(btnContinueShopping);
        return btnContinueShopping;
    }
    public static WebElement getBtnCart(){
        waitForElementToBeClickable(btnCart);
        return btnCart;
    }
    public static String getVerifyNameProduct(){
        waitForElementToBeVisible(verifyNameProduct);
        String msg = verifyNameProduct.getText();
        return msg;
    }
    public static String getVerifyPrice(){
        waitForElementToBeVisible(verifyPrice);
        String msg = verifyPrice.getText();
        return msg;
    }


    public static String getVerifyQty(){
        waitForElementToBeVisible(verifyQty);
        String qty = verifyQty.getAttribute("value").trim();
        return qty;
    }



}
