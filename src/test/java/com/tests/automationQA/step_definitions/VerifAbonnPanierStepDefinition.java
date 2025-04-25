package com.tests.automationQA.step_definitions;

import com.tests.automationQA.actions.SeleniumUtils;
import com.tests.automationQA.actions.Validations;
import com.tests.automationQA.page_objects.VerifAbonnAcceuilPage;
import com.tests.automationQA.page_objects.VerifAbonnPanierPage;
import com.tests.automationQA.utils.ConfigFileReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class VerifAbonnPanierStepDefinition {

    private final SeleniumUtils seleniumUtils;
    private final Validations validation;
    private final VerifAbonnPanierPage verifAbonnPanierPage;
    private final ConfigFileReader configFileReader;

    public VerifAbonnPanierStepDefinition(){
        seleniumUtils = new SeleniumUtils();
        validation = new Validations();
        verifAbonnPanierPage = new VerifAbonnPanierPage();
        configFileReader = new ConfigFileReader();
    }

    @Given("cliquer sur bouton Panier")
    public void cliquerSurBoutonPanier() {
    seleniumUtils.click(VerifAbonnPanierPage.getBtnPanier());
    }

    @When("défiler jusqu au pied de page")
    public void défilerJusquAuPiedDePage() {
        seleniumUtils.scrollDownIntoViewElement(VerifAbonnPanierPage.getChampsEmail());
    }

    @When("verfier texte {string}")
    public void verfierTexte(String string) {
        Assert.assertEquals(string, VerifAbonnPanierPage.getVerifTextSubscription());
    }

    @When("saisir email suivant {string} et cliquer sur le bouton fléché")
    public void saisirEmailSuivantEtCliquerSurLeBoutonFléché(String string) {
       seleniumUtils.writeText(VerifAbonnPanierPage.getChampsEmail(), configFileReader.getProperty("home.email"));
       seleniumUtils.click(VerifAbonnPanierPage.getBtnFléchél());
    }

    @Then("un message {string} doit etre affiché")
    public void unMessageDoitEtreAffiché(String string) {

    }














}
