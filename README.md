# TryCloud-Collaboration-MiniGroup

selenium-cucumber-java
=================

selenium-cucumber : Automation Testing Using Java

selenium-cucumber is a behavior driven development (BDD) approach to write automation test script to test Web.
It enables you to write and execute automated acceptance/unit tests.
It is cross-platform, open source and free.
[More Details](http://seleniumcucumber.info/)

Writing a test
--------------

The cucumber features goes in the `features` library and should have the ".feature" extension.

Go to your project directory from terminal and hit following commands
`mvn test` (default will trigger a Jenkins workflow)
`mvn verify` (default will trigger a local execution of the tests and use the surefire plug in to execute the feature files parallel )
 
 Using canned tests in your project
----------------------------------

In your TestRunner class add a glue option:

```
package com.trycloud.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty",
                "json:target/cucumber.json",
                "html:target/cucumber-reports.html",
                "me.jvt.cucumber.report.PrettyReports:target/cucumber",
                "rerun:target/rerun.text"},

        features = "src/test/resources/features",
        glue = "com/trycloud/step_definitions",
        dryRun = false,
        publish = true,

        tags = ""

)
public class CukesRunner {


}
```
