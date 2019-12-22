package org.xipaar.testing.pages;

import java.util.ResourceBundle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DashboardAndQRcode {
	ResourceBundle bundle;
	WebDriver driver;
	
	public DashboardAndQRcode(WebDriver driver)
	{
		driver = this.driver;
		bundle = ResourceBundle.getBundle("resource");
	}
	
	public void dash()
	{
		//driver.findElement(By.xpath(bundle.getString("AfterSignInURL"))).click();
		driver.findElement(By.xpath(bundle.getString("Dashbord"))).click();
	}
	
	public void clickQR()
	{
		driver.findElement(By.xpath(bundle.getString("QRCodeButton"))).click();
	}
	
	public void generateNewQRCode()
	{
		driver.findElement(By.xpath(bundle.getString("GenerateNewQR"))).click();
		driver.findElement(By.xpath(bundle.getString("QRegenertionConfirmation"))).click();
	}
	
	public void downloadpdf() throws InterruptedException
	{
		driver.get("chrome://settings/content/pdfDocuments");
		new WebDriverWait(driver, 10).until(ExpectedConditions.numberOfElementsToBeMoreThan(By.cssSelector("body/deep/#control"), 10));
		driver.findElements(By.cssSelector("body/deep/#control")).get(10).click();
		driver.findElement(By.xpath(bundle.getString("DownloadPDF"))).click();
	}
	
}
