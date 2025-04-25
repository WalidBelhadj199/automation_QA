package com.tests.automationQA.step_definitions;

import com.tests.automationQA.hooks.Setup;
import org.junit.Assert;

import com.tests.automationQA.actions.SeleniumUtils;
import com.tests.automationQA.actions.Validations;
import com.tests.automationQA.page_objects.ConnexionPage;
import com.tests.automationQA.utils.ConfigFileReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ConnexionStepDefinition {

	private final SeleniumUtils seleniumUtils;
	private final ConfigFileReader configFileReader;
 
	private final Validations  validations;
	
	public ConnexionStepDefinition() {
		
		ConnexionPage connexionPage =new ConnexionPage();
		seleniumUtils = new SeleniumUtils();
		configFileReader = new ConfigFileReader();
	
		validations = new Validations();
	}
	@Given("que je lance le navigateur")
	public void queJeLanceLeNavigateur() {

		seleniumUtils.get(configFileReader.getProperty("home.G"));
	}
	@Given("je navigue vers {string}")
	public void jeNavigueVers(String string) {
		seleniumUtils.get(configFileReader.getProperty("home.A"));

	}

	@Then("la page d'accueil doit etre visible")
	public void laPageDAccueilDoitEtreVisible() {
		Assert.assertTrue( ConnexionPage.getBtnSignup().isDisplayed());
	}

	@When("je clique sur le bouton Signup Login")
	public void jeCliqueSurLeBoutonSignupLogin() {

		seleniumUtils.click(ConnexionPage.getBtnSignup());
	}
	@Then("l'option {string} doit etre visible")
	public void lOptionDoitEtreVisible(String string) {

		Assert.assertTrue( ConnexionPage.getVerifMessAcceuil().isDisplayed());
	}

	@When("je saisis l'adresse email {string} et le mot de passe {string}")
	public void jeSaisisLAdresseEmailEtLeMotDePasse(String string, String string2) {
		seleniumUtils.writeText(ConnexionPage.getEmailField(),configFileReader.getProperty("home.login2"));
		seleniumUtils.writeText(ConnexionPage.getPasswordField(),configFileReader.getProperty("home.password2"));
	}

	@When("je clique sur le bouton Connexion")
	public void jeCliqueSurLeBoutonConnexion() {

		seleniumUtils.click(ConnexionPage.getBtnLogin());
	}
	@Then("l'option {string} doit etr visible")
	public void lOptionDoitEtrVisible(String str) {


		Assert.assertEquals(str,ConnexionPage.getVerifPageAcceuil1());
	}




}
