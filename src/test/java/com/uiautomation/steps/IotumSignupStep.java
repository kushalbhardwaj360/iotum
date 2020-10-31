package com.uiautomation.steps;

import com.uiautomation.actions.*;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class IotumSignupStep {
	@Steps
	IotumSignup iotumSignup;

	@Given("^I want to Signup for Iotum$")
	public void i_want_to_Signup_for_Iotum() throws Exception {
		iotumSignup.openSignupPage();
	    //throw new PendingException();
	}


	@When("^I click on 'Signup' on homepage$")
	public void i_click_on_Signup_on_homepage() throws Exception {
		iotumSignup.performSignup();
//	    throw new PendingException();
	}

	@Then("^I provide my information$")
	public void i_provide_my_information() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
	}

	@Then("^I click on create account$")
	public void i_click_on_create_account() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
	}

}
