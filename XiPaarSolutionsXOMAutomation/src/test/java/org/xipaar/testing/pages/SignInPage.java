package org.xipaar.testing.pages;

import java.util.ResourceBundle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignInPage {
	ResourceBundle res;
	WebDriver driver;
	
	public SignInPage(WebDriver driver)
	{
		this.driver = driver;
		res = ResourceBundle.getBundle("resource");
	}
	
	public void enterOrgCode(String orgname)
	{
		driver.findElement(By.xpath(res.getString("OrganizationCode"))).sendKeys(orgname);
	}
	public void enterEmail(String mail)
	{
		driver.findElement(By.xpath(res.getString("Email"))).sendKeys(mail);
	}
	public void enterPassword(String pword)
	{
		driver.findElement(By.xpath(res.getString("Password"))).sendKeys(pword);
	}
	public void clickLogin()
	{
		driver.findElement(By.xpath(res.getString("Login"))).click();
	}
	
}
