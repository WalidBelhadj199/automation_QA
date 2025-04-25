package com.tests.automationQA.step_definitions;

import com.tests.automationQA.actions.SeleniumUtils;
import com.tests.automationQA.actions.Validations;
import com.tests.automationQA.page_objects.IncorrectloginPage;
import com.tests.automationQA.utils.ConfigFileReader;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class IncorrectloginStepDefinition {


    private final SeleniumUtils seleniumUtils;
    private final ConfigFileReader configFileReader;
    private final IncorrectloginPage incorrectloginPage;
    private final Validations validations;

   public  IncorrectloginStepDefinition(){
       incorrectloginPage = new IncorrectloginPage();
       seleniumUtils = new SeleniumUtils();
       configFileReader = new ConfigFileReader();
       validations = new Validations();
   }
    @When("je clique sur le bouton Signup\\/login")
    public void jeCliqueSurLeBoutonSignupLogin() {
        seleniumUtils.click(IncorrectloginPage.getBtnSignup());
    }
    @Then("{string} doit etr visibl")
    public void doitEtrVisibl(String str1) {
       // Assert.assertEquals(str1, IncorrectloginPage.getVerifMessage());
    }
    @When("je saisis l'adresse email {string} et un mot de passe {string}")
    public void jeSaisisLAdresseEmailEtUnMotDePasse(String string, String string2) {
        seleniumUtils.writeText(IncorrectloginPage.getChampEmail(),configFileReader.getProperty("home.incorrect_email"));
        seleniumUtils.writeText(IncorrectloginPage.getChampMdp(),configFileReader.getProperty("home.incorrectpassword"));

    }

    @When("je clique sur le bouton Login")
    public void jeCliqueSurLeBoutonLogin() {
        seleniumUtils.click(IncorrectloginPage.getBtnLogin());
    }

    @Then("une message {string} doit etre affiché")
    public void uneMessageDoitEtreAffiché(String str) {
        Assert.assertEquals(str, IncorrectloginPage.getIncorrectEmailMdp());
    }








}
