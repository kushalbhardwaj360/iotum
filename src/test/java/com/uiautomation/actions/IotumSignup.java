package com.uiautomation.actions;

import java.util.ArrayList;
import java.util.List;

import com.uiautomation.pages.*;
import junit.framework.Assert;
import net.thucydides.core.annotations.Step;

public class IotumSignup {
	IotumSignupPage iotumSignupPage;

	@Step
	public void openSignupPage()
	{
		iotumSignupPage.open();
	}

	@Step
	public void performSignup()
	{
		iotumSignupPage.clickSignup();
	}
	

}
