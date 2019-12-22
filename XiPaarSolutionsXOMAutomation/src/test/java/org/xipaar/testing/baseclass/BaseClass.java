package org.xipaar.testing.baseclass;

import java.util.ResourceBundle;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BaseClass {

	public WebDriver CreateInstanceInitiation(String type)
	{
		WebDriver driver;
		ResourceBundle res = ResourceBundle.getBundle("config");
		if(res.getString("browser").equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(res.getString("browser").equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","./Driver/geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else if(res.getString("browser").equalsIgnoreCase("ie"))
		{
			System.setProperty("webdriver.InternetExplorer.driver","./Driver/InternetExplorerdriver.exe");
			driver = new InternetExplorerDriver();
		}
		else
		{
			System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
			driver = new ChromeDriver();
		}
		driver.get(res.getString("applicationURL"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		if(type.equalsIgnoreCase("signup"))
		{
			driver.findElement(By.xpath(res.getString("Sup"))).click();
		}
		else if(type.equalsIgnoreCase("signin"))
		{
			driver.findElement(By.xpath(res.getString("Sin"))).click();
		}
		return driver;
	}
	
	public void CreateTerminateInitiation(WebDriver driver)
	{
		driver.quit();
	}
}
