# TryCloud-Collaboration-MiniGroup

selenium-cucumber-java
=================

selenium-cucumber : Automation Testing Using Java

selenium-cucumber is a behavior driven development (BDD) approach to write automation test script to test Web.
It enables you to write and execute automated acceptance/unit tests.
It is cross-platform, open source and free.
Automate your test cases with minimal coding.
[More Details](http://seleniumcucumber.info/)

Writing a test
--------------

The cucumber features goes in the `features` library and should have the ".feature" extension.

Go to your project directory from terminal and hit following commands
`mvn test` (defualt will trigger a Jenkins workflow)
`mvn verify` (defualt will trigger a local execution of the tests and use the surefire plug in to execute the feature files parallel )
 
 Using canned tests in your project
----------------------------------

In your TestRunner class add a glue option:

```
package stepDefintions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
	plugin = {"html:target/cucumberHtmlReport"},
	features = "classpath:features",
	glue = {"info.seleniumcucumber.stepdefinitions"}
)

public class CukesRunner {
}
```
