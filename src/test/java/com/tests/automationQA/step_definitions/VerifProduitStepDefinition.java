package com.tests.automationQA.step_definitions;

import com.tests.automationQA.actions.SeleniumUtils;
import com.tests.automationQA.actions.Validations;
import com.tests.automationQA.page_objects.ConnexionPage;
import com.tests.automationQA.page_objects.IncorrectloginPage;
import com.tests.automationQA.page_objects.VerifAbonnAcceuilPage;
import com.tests.automationQA.page_objects.VeriferProduitPage;
import com.tests.automationQA.utils.ConfigFileReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class VerifProduitStepDefinition {

    private final SeleniumUtils seleniumUtils;
    private final ConfigFileReader configFileReader;
    private final VeriferProduitPage veriferProduitPage ;
    private final Validations validations;

    public  VerifProduitStepDefinition(){
        seleniumUtils = new SeleniumUtils();
        configFileReader =new ConfigFileReader();
        veriferProduitPage =new VeriferProduitPage();
        validations =new Validations();
    }

    @Given("je clique sur le bouton Product")
    public void jeCliqueSurLeBoutonProduct() {
        seleniumUtils.click(VeriferProduitPage.getBtnProduct());
    }

    @Then("Redirection vers la page des Produit et {string} s affiche")
    public void redirectionVersLaPageDesProduitEtSAffiche(String str) {

        Assert.assertEquals(str.trim(), VeriferProduitPage.getVerifMessagAllProduct().trim());

    }

    @Then("Cliquez sur  Afficher le produit  du premier produit")
    public void cliquezSurAfficherLeProduitDuPremierProduit() {
        seleniumUtils.scrollDownIntoViewElement(VeriferProduitPage.getBtnViewProduct());
        seleniumUtils.click(VeriferProduitPage.getBtnViewProduct());
    }

    @Then("Redirection vers la page detail de produit et {string}, {string},{string}, {string}, {string}, {string} sont affichés")
    public void redirectionVersLaPageDetailDeProduitEtSontAffichés(String string, String string2, String string3, String string4, String string5, String string6) {
        Assert.assertEquals(string, VeriferProduitPage.getVerifverifProductName() );
        Assert.assertEquals(string2, VeriferProduitPage.getVerifCategory() );
        Assert.assertEquals(string3, VeriferProduitPage.getVerifPrice() );
        Assert.assertEquals(string4, VeriferProduitPage.getVerifAvailability() );
        //Assert.assertEquals(string5, VeriferProduitPage.getVerifCondition() );
        //Assert.assertEquals(string6, VeriferProduitPage.getVerifBrand() );

    }











}
