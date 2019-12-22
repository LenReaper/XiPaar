package org.xipaar.testing.signup;

import org.apache.bcel.generic.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.xipaar.testing.baseclass.BaseClass;
import org.xipaar.testing.pages.OrganizationSignUp;
import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;

public class Steps {
	WebDriver driver;
	OrganizationSignUp orgsp;
	
	@Given("^User is on signup page$")
	public void User_is_on_signup_page() throws Throwable {
		BaseClass base = new BaseClass();
		driver = base.CreateInstanceInitiation("signup");
	}

	@When("^User enters organizationname$")
	public void User_enters_organizationname() throws Throwable {
		orgsp = new OrganizationSignUp(driver);
		orgsp.orgname("B Da Inc");
	}

	@When("^User enters city$")
	public void User_enters_city() throws Throwable {
		orgsp.orgcity("Gauhati");
	}

	@When("^User chooses organizationtype$")
	public void User_chooses_organizationtype() throws Throwable {
		orgsp.orgType();
	}

	@When("^User enters authorisedpersonname$")
	public void User_enters_authorisedpersonname() throws Throwable {
		orgsp.athpersonname("Baruah da");
	}

	@When("^User enters email$")
	public void User_enters_email() throws Throwable {
		orgsp.athpersonemail("guruvegito1993@gmail.com");
	}
	
	@When("^User click on Generate OTP$")
	public void User_click_on_Generate_OTP() throws Throwable {
	    orgsp.GenerteOTP();
	    orgsp.pauseexec();
	}

/*	@When("^User pauses execution$")
	public void User_pauses_execution() throws Throwable {
		
	}
*/
	
	@When("^User enters phonenumber$")
	public void User_enters_phonenumber() throws Throwable {
		orgsp.ContactNumber("8005657418");
	}

	@When("^User enters password$")
	public void User_enters_password() throws Throwable {
		orgsp.Orgpword("Khalnayakhumai@9");
	}

	@When("^User confirms password$")
	public void User_confirms_password() throws Throwable {
		orgsp.confirmorgpword("Khalnayakhumai@9");
	}

	
	@When("^User agrees to TermsAndConditions$")
	public void User_agrees_to_TermsAndConditions() throws Throwable {
	    orgsp.TermsConditions();
	}

	@When("^User clicks on SignUp$")
	public void User_clicks_on_SignUp() throws Throwable {
		orgsp.finalsignup();
	}

	@Then("^User Signed Up successfully$")
	public void User_Signed_Up_successfully() throws Throwable {
		driver.get("https://xipaarsolutions.com/xom/portfolio_pvt_ltd.php/");
	}
}
