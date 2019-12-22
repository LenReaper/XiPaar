package org.xipaar.testing.pages;

import java.util.ResourceBundle;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OrganizationSignUp {

	ResourceBundle res;
	WebDriver driver;
	
	public OrganizationSignUp(WebDriver driver)
	{
		this.driver = driver;
		res = ResourceBundle.getBundle("resource");
	}
	
	public void orgname(String oname)
	{
		driver.findElement(By.xpath(res.getString("OrganizationName"))).sendKeys(oname);
	}
	
	public void orgcity(String ocity)
	{
		driver.findElement(By.xpath(res.getString("City"))).sendKeys(ocity);
	}
	
	public void orgType()
	{
		Select drpType = new Select(driver.findElement(By.xpath(res.getString("OrganizationType"))));
		drpType.selectByVisibleText(res.getString("OrgnizationTypeFromDropDown"));
	}
	
	public void athpersonname(String authpersn)
	{
		driver.findElement(By.xpath(res.getString("AuthorisedPersonName"))).sendKeys(authpersn);
	}
	
	public void athpersonemail(String athemail)
	{
		driver.findElement(By.xpath(res.getString("OrganizationEmail"))).sendKeys(athemail);
	}
	
	public void GenerteOTP()
	{
		driver.findElement(By.xpath(res.getString("GenerateOTP"))).click();
	}
	
	public void pauseexec()
	{
		 try {
		        Thread.sleep(30*1000);
		    } 
		 catch (InterruptedException e) {}
	}
	
	public void EnterOTP(String enterotp)
	{
		//driver.findElement(By.xpath(res.getString("OTP"))).sendKeys(enterotp);
	}
	
	public void ContactNumber(String contactnum)
	{
		driver.findElement(By.xpath(res.getString("ContactNumber"))).sendKeys(contactnum);
	}
	
	public void Orgpword(String orgpd)
	{
		driver.findElement(By.xpath(res.getString("OrganizationPwrd"))).sendKeys(orgpd);
	}

	public void confirmorgpword(String cfmorgpd)
	{
		driver.findElement(By.xpath(res.getString("ConfirmOrganizationPwrd"))).sendKeys(cfmorgpd);
	}
	
	public void TermsConditions()
	{
		driver.findElement(By.xpath(res.getString("T&CAgree"))).click();
	}
	
	public void finalsignup()
	{
		driver.findElement(By.xpath(res.getString("UpSign"))).click();
	}
}
