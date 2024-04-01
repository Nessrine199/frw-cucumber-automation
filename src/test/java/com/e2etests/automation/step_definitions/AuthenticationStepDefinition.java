package com.e2etests.automation.step_definitions;

import org.junit.Assert;
import com.e2etests.automation.page_objects.AuthenticationPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AuthenticationStepDefinition {

	private AuthenticationPage authenticationPage = new AuthenticationPage();
	
	public AuthenticationStepDefinition() {
		this.authenticationPage = new AuthenticationPage();
		}
	
	@Given("Je me connecte à l application Mercury")
	public void jeMeConnecteÀLApplicationMercury() throws InterruptedException {
		authenticationPage.goToUrl();
		

		
	}
	@When("Je saisie le username {string}")
	public void jeSaisieLeUsername(String name) {
		authenticationPage.fillUserName(name);

	}
	@When("Je saisie le password {string}")
	public void jeSaisieLePassword(String password) {
		authenticationPage.fillPassword(password);
			
		}

	@When("Je clique sur le bouton Submit")
	public void jeCliqueSurLeBoutonSubmit() {
		authenticationPage.clickonbuttonSubmit();
	   
	}
	@Then("Je me redirige vers la page home {string}")
	public void jeMeRedirigeVersLaPageHome(String text) {
		String message = AuthenticationPage.WelcomeMessage.getText();
		Assert.assertEquals(message, text);
	 
	}




}
