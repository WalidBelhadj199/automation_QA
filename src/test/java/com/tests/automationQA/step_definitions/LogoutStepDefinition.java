package com.tests.automationQA.step_definitions;

import com.tests.automationQA.actions.SeleniumUtils;
import com.tests.automationQA.actions.Validations;
import com.tests.automationQA.base.BasePage;
import com.tests.automationQA.hooks.Setup;
import com.tests.automationQA.page_objects.ConnexionPage;
import com.tests.automationQA.page_objects.LogoutPage;
import com.tests.automationQA.utils.ConfigFileReader;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LogoutStepDefinition {
    private final SeleniumUtils seleniumUtils;
    private final ConfigFileReader configFileReader;

    private final Validations validations;

    public LogoutStepDefinition() {

        LogoutPage logoutPage =new LogoutPage();
        seleniumUtils = new SeleniumUtils();
        configFileReader = new ConfigFileReader();

        validations = new Validations();
    }

    @When("je clique sur  bouton  SignupLogin")
    public void jeCliqueSurBoutonSignupLogin() {
        seleniumUtils.click(LogoutPage.getBtnSignup());
    }

    @Then("l option {string} doit etr visible")
    public void lOptionDoitEtrVisible(String string) {
       // LogoutPage.getVerifPageDisplay().isDisplayed();
    }

    @When("je saisis l adresse email {string} et le mot de passe {string}")
    public void jeSaisisLAdresseEmailEtLeMotDePasse(String string, String string2) {
        seleniumUtils.writeText(LogoutPage.getEmailField(),configFileReader.getProperty("home.login2"));
        seleniumUtils.writeText(LogoutPage.getPasswordField(),configFileReader.getProperty("home.password2"));

    }

    @When("je clique sur  bouton  de Connexion")
    public void jeCliqueSurBoutonDeConnexion() {
        seleniumUtils.click(LogoutPage.getBtnLogin());
    }

    @Then("l option {string} doit etre visible")
    public void lOptionDoitEtreVisible(String string) {
       // LogoutPage.getVerifPage().isDisplayed();

    }

    @When("je clique sur le bouton Logout")
    public void jeCliqueSurLeBoutonLogout() {
        seleniumUtils.click(LogoutPage.getbtnLogout());
    }

   @Then("la page daccueil doit etre visible")
    public void laPageDaccueilDoitEtreVisible() {
      // LogoutPage.getVerifPageDisplay().isDisplayed();
    }



























}
