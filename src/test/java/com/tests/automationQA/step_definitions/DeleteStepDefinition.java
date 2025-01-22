package com.tests.automationQA.step_definitions;

import com.tests.automationQA.actions.SeleniumUtils;
import com.tests.automationQA.actions.Validations;
import com.tests.automationQA.page_objects.ConnexionPage;
import com.tests.automationQA.page_objects.DeletePage;
import com.tests.automationQA.utils.ConfigFileReader;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class DeleteStepDefinition {

    private final SeleniumUtils seleniumUtils;
    private final ConfigFileReader configFileReader;

    private final Validations validations;

    public DeleteStepDefinition() {
        DeletePage deletePage = new DeletePage();
        seleniumUtils = new SeleniumUtils();
        configFileReader = new ConfigFileReader();

        validations = new Validations();
    }
    @When("je clique sur  bouton  Signup Login")
    public void jeCliqueSurBoutonSignupLogin() {
        seleniumUtils.click(DeletePage.getBtnSignup());
    }




    @Then("l'option {string} doit etr visibl")
    public void lOptionDoitEtrVisibl(String string) {

       // DeletePage.getVerifMessDisplay().isDisplayed();
    }

    @When("je saisis ladresse email {string} et le mot de passe {string}")
    public void jeSaisisLadresseEmailEtLeMotDePasse(String string, String string2) {
        seleniumUtils.writeText(DeletePage.getEmailField(), configFileReader.getProperty("home.login2"));
        seleniumUtils.writeText(DeletePage.getPasswordField(), configFileReader.getProperty("home.password2"));
    }

    @When("je clique sur le bouton  de Connexion")
    public void jeCliqueSurLeBoutonDeConnexion() {
        seleniumUtils.click(DeletePage.getBtnLogin());
    }

    @Then("loption {string} doit etre visible")
    public void loptionDoitEtreVisible(String string) {
        Assert.assertTrue(DeletePage.getVerifPage().contains(string));
    }

    @When("je clique sur le bouton Supprimer le compte")
    public void jeCliqueSurLeBoutonSupprimerLeCompte() {
        seleniumUtils.click(DeletePage.getBtnDelete());
    }

    @Then("le message {string} doit etre visible")
    public void leMessageDoitEtreVisible(String string) {

        //DeletePage.getMessDeletComp().isDisplayed();
    }
}