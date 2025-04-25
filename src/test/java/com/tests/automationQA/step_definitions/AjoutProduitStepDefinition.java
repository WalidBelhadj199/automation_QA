package com.tests.automationQA.step_definitions;

import com.tests.automationQA.actions.SeleniumUtils;
import com.tests.automationQA.actions.Validations;
import com.tests.automationQA.page_objects.AjoutProduitPage;
import com.tests.automationQA.page_objects.VerifAbonnAcceuilPage;
import com.tests.automationQA.utils.ConfigFileReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class AjoutProduitStepDefinition {

    private final SeleniumUtils seleniumUtils;
    private final Validations validation;
    private final AjoutProduitPage ajoutProduitPage;
    private final ConfigFileReader configFileReader;

    public AjoutProduitStepDefinition(){
        seleniumUtils = new SeleniumUtils();
        validation = new Validations();
        ajoutProduitPage = new AjoutProduitPage();
        configFileReader = new ConfigFileReader();
    }

    @Given("cliquer sur bouton Produit")
    public void cliquerSurBoutonProduit() {
        seleniumUtils.click(AjoutProduitPage.getBtnProduct());
        seleniumUtils.scrollDownIntoViewElement(AjoutProduitPage.getBtnPremierProduit());
    }

    @When("Passez la souris sur le premier produit et cliquez sur Add  to cart")
    public void passezLaSourisSurLePremierProduitEtCliquezSurAddToCart() {
        seleniumUtils.mouseHover(AjoutProduitPage.getBtnPremierProduit());
        seleniumUtils.click(AjoutProduitPage.getBtnAjouterAuPanier());
    }

    @When("Cliquez sur le bouton Continue Shopping")
    public void cliquezSurLeBoutonContinueShopping() {
        seleniumUtils.click(AjoutProduitPage.getBtnContinuerLesAchats());

    }

    @When("Passez la souris sur le deuxième produit et cliquez sur Add to cart")
    public void passezLaSourisSurLeDeuxièmeProduitEtCliquezSurAddToCart() {

        seleniumUtils.mouseHover(AjoutProduitPage.getBtnDeuxièmeProduit());
        seleniumUtils.click(AjoutProduitPage.getBtn2AjouterAuPanier());
        seleniumUtils.click(AjoutProduitPage.getBtnContinuerLesAchats());

    }

    @When("Cliquez sur le bouton View cart")
    public void cliquezSurLeBoutonViewCart() {
        seleniumUtils.scrollDownIntoViewElement(AjoutProduitPage.getBtnCart());
        seleniumUtils.click(AjoutProduitPage.getBtnCart());

    }

    @When("Vérifiez que les deux produits {string} et {string} sont ajoutés au panier")
    public void vérifiezQueLesDeuxProduitsEtSontAjoutésAuPanier(String string, String string2) {
        Assert.assertEquals(AjoutProduitPage.getVerifProduct1(), string);
        Assert.assertEquals(AjoutProduitPage.getVerifProduct2(), string2);
    }


    @When("Verifier que le premier produit saffiche avec un prix {string} , qté {string} et un total {string}")
    public void verifierQueLePremierProduitSafficheAvecUnPrixQtéEtUnTotal(String string, String string2, String string3) {

        int nombre1 = Integer.parseInt(string);
        int nombre2 = Integer.parseInt(string2);
        int nombre3 = Integer.parseInt(string3);
        int nbr1 = Integer.parseInt(AjoutProduitPage.getPrixProduct1());
        int nbr2 = Integer.parseInt(AjoutProduitPage.getQtéProduct1());
        int nbr3 = Integer.parseInt(AjoutProduitPage.getTotalProduct1());

        Assert.assertEquals(nbr1, nombre1, "same");
        Assert.assertEquals(nbr2, nombre2, "same");
        Assert.assertEquals(nbr3, nombre3, "same");

    }

    @When("Verifier que le deuxième produit saffiche avec un prix {string} , qté {string} et un total {string}")
    public void verifierQueLeDeuxièmeProduitSafficheAvecUnPrixQtéEtUnTotal(String string, String string2, String string3) {

    }























}
