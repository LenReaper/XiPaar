package org.xipaar.testing.signin;

import org.junit.runner.RunWith;

import cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(format={"pretty","html:target/cucumber-htmlreport","json-pretty:target/cucumber-report.json"},
					monochrome = true)
public class RunCukesTest {

}