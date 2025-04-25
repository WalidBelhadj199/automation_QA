package com.tests.automationQA.step_definitions;

import com.tests.automationQA.actions.SeleniumUtils;
import com.tests.automationQA.actions.Validations;
import com.tests.automationQA.page_objects.AjoutProduitPage;
import com.tests.automationQA.page_objects.IncreaseQuantityPage;
import com.tests.automationQA.utils.ConfigFileReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class IncreseQuantityStepDefinition {
    private final SeleniumUtils seleniumUtils;
    private final Validations validation;
    private final IncreaseQuantityPage increaseQuantityPage;
    private final ConfigFileReader configFileReader;

    public IncreseQuantityStepDefinition(){
        seleniumUtils = new SeleniumUtils();
        validation = new Validations();
        increaseQuantityPage = new IncreaseQuantityPage();
        configFileReader = new ConfigFileReader();
    }


    @Given("Click View Product for the second product")
    public void clickViewProductForTheSecondProduct() {

        seleniumUtils.scrollDownIntoViewElement(IncreaseQuantityPage.getBtnViewProduct());
        seleniumUtils.click(IncreaseQuantityPage.getBtnViewProduct());

    }

    @When("Verify product name is {string} and product price is {string}")
    public void verifyProductNameIsAndProductPriceIs(String string, String string2) {
        Assert.assertEquals(string, IncreaseQuantityPage.getNameProduct());
        Assert.assertEquals(string2, IncreaseQuantityPage.getPriceTshirt());

    }

    @When("Increase quantity to {string}")
    public void increaseQuantityTo(String string) {

        IncreaseQuantityPage.getBtnIncreaseQty().clear();
       // int number = Integer.parseInt(string);

            seleniumUtils.writeText(IncreaseQuantityPage.getBtnIncreaseQty(), string);



    }

    @When("Click Add to cart button")
    public void clickAddToCartButton() {
        seleniumUtils.click(IncreaseQuantityPage.getBtnAddToCart());

    }

    @When("Click Continue shopping")
    public void clickContinueShopping() {
        seleniumUtils.click(IncreaseQuantityPage.getBtnContinueShopping());

    }

    @Then("Verify that product is displayed in cart page with  Quantity is {string}")
    public void verifyThatProductIsDisplayedInCartPageWithQuantityIs(String string) {
      // Assert.assertEquals(int1, Integer.parseInt(IncreaseQuantityPage.getVerifyQty1()), "ok they are same");

        int nombre = Integer.parseInt(string);
        int nombre1 = Integer.parseInt(IncreaseQuantityPage.getVerifyQty());
        Assert.assertEquals(nombre1, nombre, " ok they are same");

   }





























}
