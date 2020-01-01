package org.xipaar.testing.signin;

import org.junit.runner.RunWith;

import cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(format={"pretty","html:target/cucumber-htmlreport","json-pretty:target/cucumber-report.json"},
					monochrome = true,
					//features = "./src.test.resources/org.xipaar.testing.signin/SignInTestCases.feature",
					glue = {"org.xipaar.testing.signin"})
public class RunCukesTest {

}
