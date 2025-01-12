package com.tests.easyges.step_definitions;

import org.junit.Assert;

import com.tests.easyges.actions.SeleniumUtils;
import com.tests.easyges.actions.Validations;
import com.tests.easyges.page_objects.ConnexionPage;
import com.tests.easyges.utils.ConfigFileReader;

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
	
	
	

	@Given("Je me connecte sur l'application Automation Exercise")
	public void jeMeConnecteSurLApplicationAutomationExercise() throws InterruptedException {
		seleniumUtils.get(configFileReader.getProperty("home.A"));
		//Thread.sleep(5000);
	}
	@When("je clique sur bouton Signup\\/Login")
	public void jeCliqueSurBoutonSignupLogin() {
		seleniumUtils.click(ConnexionPage.getBtnSignup());
	}
	@When("Je saisis l adresse mail {string}")
	public void jeSaisisLAdresseMail(String email) {
		seleniumUtils.writeText(ConnexionPage.getEmailField(), email);
	}
	@When("Je saisis le mot de passe {string}")
	public void jeSaisisLeMotDePasse(String pwd) {
		seleniumUtils.writeText(ConnexionPage.getPasswordField(), pwd);

	}
	@When("Je clique sur le bouton Login")
	public void jeCliqueSurLeBoutonLogin() {
		seleniumUtils.click(ConnexionPage.getBtnLogin());
  
	}
	@Then("Je suis redirigé vers la page d'accueil et {string} s affiche")
	public void jeSuisRedirigéVersLaPageDAccueilEtSAffiche(String string) {
		Assert.assertTrue(ConnexionPage.getVerifPage().contains(string));
	}
	



	
	
	
	
	
	
	
	
	
	
	
}
