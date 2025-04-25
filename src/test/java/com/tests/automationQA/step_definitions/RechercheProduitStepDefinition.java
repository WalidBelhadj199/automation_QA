package com.tests.automationQA.step_definitions;

import com.tests.automationQA.actions.SeleniumUtils;
import com.tests.automationQA.actions.Validations;
import com.tests.automationQA.page_objects.RechercheProduitPage;
import com.tests.automationQA.utils.ConfigFileReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class RechercheProduitStepDefinition {

    private final SeleniumUtils seleniumUtils;
    private final RechercheProduitPage rechercheProduitPage;
    private final ConfigFileReader configFileReader;
    private final Validations validations;

    public RechercheProduitStepDefinition(){
        seleniumUtils =new SeleniumUtils();
        rechercheProduitPage = new RechercheProduitPage();
        configFileReader = new ConfigFileReader();
        validations = new Validations();

    }

    @Given("je clique sur bouton Product")
    public void jeCliqueSurBoutonProduct() {
        seleniumUtils.click(RechercheProduitPage.getBtnProduct());

    }

    @When("je saisis un produit comme {string}")
    public void jeSaisisUnProduitComme(String string) {
        seleniumUtils.writeText(RechercheProduitPage.getChampsSaisie(), configFileReader.getProperty("home.produit"));

    }

    @When("je clique sur Rechercher")
    public void jeCliqueSurRechercher() {
        seleniumUtils.click(RechercheProduitPage.getBtnRechercher());
        //seleniumUtils.scrollDownIntoViewElement();

    }

    @When("le produit {string} ainsi les produits similaire doivent etre affichés")
    public void leProduitAinsiLesProduitsSimilaireDoiventEtreAffichés(String string) {

    }















}
