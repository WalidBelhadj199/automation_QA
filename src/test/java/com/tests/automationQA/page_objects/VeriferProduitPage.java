package com.tests.automationQA.page_objects;

import com.tests.automationQA.base.BasePage;
import com.tests.automationQA.hooks.Setup;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class VeriferProduitPage extends BasePage {

    @FindBy(how= How.XPATH, using = "//a[@href='/products']")
    private static WebElement btnProduct;
    @FindBy(how=How.XPATH, using = "//h2[normalize-space()='All Products']")
    private static WebElement verifMessagAllProduct;
    @FindBy(how=How.XPATH, using ="//div[@class='col-sm-9 padding-right']//div[2]//div[1]//div[2]//ul[1]//li[1]//a[1]")
    private static WebElement btnViewProduct;
    @FindBy(how=How.XPATH, using = "//h2[normalize-space()='Blue Top']")
    private static WebElement verifProductName;
    @FindBy(how=How.XPATH, using = "//p[normalize-space()='Category: Women > Tops']")
    private static WebElement verifCategory;
    @FindBy(how=How.XPATH, using = "//span[normalize-space()='Rs. 500']")
    private static WebElement verifPrice;
    @FindBy(how=How.XPATH, using = "//div[@class='product-details']//p[2]")
    private static WebElement verifAvailability;
    @FindBy(how=How.XPATH, using = "//div[@class='product-details']//p[2]")
    private static WebElement verifCondition;
    @FindBy(how=How.XPATH, using = "//div[@class='product-details']//p[2]")
    private static WebElement verifBrand;


    public VeriferProduitPage() {
        super(Setup.getDriver());
    }

public static WebElement getBtnProduct(){
        waitForElementToBeClickable(btnProduct);
        return btnProduct;
}
public static String getVerifMessagAllProduct(){
        waitForElementToBeVisible(verifMessagAllProduct);
        String msg = verifMessagAllProduct.getText();
        return msg;
}
public static WebElement getBtnViewProduct(){
        waitForElementToBeClickable(btnViewProduct);
        return btnViewProduct;
}
    public static String getVerifverifProductName(){
        waitForElementToBeVisible(verifProductName);
        String msg = verifProductName.getText();
        return msg;
    }
    public static String getVerifCategory(){
        waitForElementToBeVisible(verifCategory);
        String msg = verifCategory.getText();
        return msg;
    }
    public static String getVerifPrice(){
        waitForElementToBeVisible(verifPrice);
        String msg = verifPrice.getText();
        return msg;
    }
    public static String getVerifAvailability(){
        waitForElementToBeVisible(verifAvailability);
        String msg = verifAvailability.getText();
        return msg;
    }
    public static String getVerifCondition(){
        waitForElementToBeVisible(verifCondition);
        String msg = verifCondition.getText();
        return msg;
    }
    public static String getVerifBrand(){
        waitForElementToBeVisible(verifBrand);
        String msg = verifBrand.getText();
        return msg;
    }




}
