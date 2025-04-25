package com.tests.automationQA.step_definitions;

import com.tests.automationQA.actions.SeleniumUtils;
import com.tests.automationQA.actions.Validations;
import com.tests.automationQA.page_objects.VerifAbonnAcceuilPage;
import com.tests.automationQA.utils.ConfigFileReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class VerifAbonnAcceuilStepDefinition {
    private final SeleniumUtils seleniumUtils;
    private final Validations validation;
    private final VerifAbonnAcceuilPage verifAbonnAcceuilPage;
    private final ConfigFileReader configFileReader;

    public VerifAbonnAcceuilStepDefinition(){
        seleniumUtils = new SeleniumUtils();
        validation = new Validations();
        verifAbonnAcceuilPage = new VerifAbonnAcceuilPage();
        configFileReader = new ConfigFileReader();
    }

    @Given("défiler jusqu'au pied de page")
    public void défilerJusquAuPiedDePage() {
        seleniumUtils.scrollDownIntoViewElement(VerifAbonnAcceuilPage.getChampsEmail());
    }

    @When("verfier le texte {string}")
    public void verfierLeTexte(String string) {

        Assert.assertEquals(string, VerifAbonnAcceuilPage.getVerifTextSubscription());
    }

    @When("saisir lemail suivant {string} et cliquer sur bouton fléché")
    public void saisirLemailSuivantEtCliquerSurBoutonFléché(String string) {
        seleniumUtils.writeText(VerifAbonnAcceuilPage.getChampsEmail(), configFileReader.getProperty("home.email"));
        seleniumUtils.click(VerifAbonnAcceuilPage.getBtnFléchél());
    }

    @Then("le message {string} doit etre affiché")
    public void leMessageDoitEtreAffiché(String string) {

    }





















}
