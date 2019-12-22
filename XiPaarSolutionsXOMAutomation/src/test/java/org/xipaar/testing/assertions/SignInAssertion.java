package org.xipaar.testing.assertions;

import org.openqa.selenium.WebDriver;

public class SignInAssertion {

	public static boolean validateURL(WebDriver driver, String expURL)
	{
		boolean result = false;
		if(driver.getCurrentUrl().equalsIgnoreCase(expURL))
		{
			result = true;
		}
		return result;
	}
}
