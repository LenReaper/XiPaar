package org.xipaar.testing.signin;

import java.util.ResourceBundle;

import org.openqa.selenium.WebDriver;
import org.xipaar.testing.assertions.SignInAssertion;
import org.xipaar.testing.baseclass.BaseClass;
import org.xipaar.testing.pages.DashboardAndQRcode;
import org.xipaar.testing.pages.SignInPage;

import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;

public class SignInAndQRCode {

	DashboardAndQRcode dash;
	WebDriver driver;
	SignInPage signin;
	
	@Given("^User is on Signin page$")
	public void User_is_on_Signin_page(){
		BaseClass bclass = new BaseClass();
		driver = bclass.CreateInstanceInitiation("signin");
	}

	@When("^User enters Organization Code$")
	public void User_enters_Organization_Code(){
		signin = new SignInPage(driver);
		signin.enterOrgCode("THG16MTX19");
	}

	@When("^User enters Email$")
	public void User_enters_Email(){
		 signin.enterEmail("geetima1995@gmail.com");
	}

	@When("^User enters Password$")
	public void User_enters_Password(){
	    signin.enterPassword("Geetima@3");

	}

	@When("^User clicks on Log In$")
	public void User_clicks_on_Log_In(){
	    signin.clickLogin();
	}

	@Then("^User is signed in successfully$")
	public void User_is_signed_in_successfully(){
		ResourceBundle res = ResourceBundle.getBundle("resource");
		boolean result = SignInAssertion.validateURL(driver,res.getString("AfterSignInURL"));
	}
}
