package com.uiautomation.pages;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.WebElementFacade;

@DefaultUrl("https://www.freeconference.com/")
public class IotumSignupPage extends PageObject {

	@FindBy(id="password")
	WebElementFacade PasswordLocator;

	public void clickSignup() {
		$("//header/div[1]/div[2]/nav[2]/div[3]/a[1]").click();
		$("//input[@id='name']").type("firstName");
		$("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/label[1]/input[1]").type("firstname@email.com");
		PasswordLocator.type("password123");
		$("//input[@id='consent']").click();
		$("//button[contains(text(),'Create account')]").click();
	}
}
