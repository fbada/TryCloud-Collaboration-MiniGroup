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
 
Basic cucumber framework used for running automation tests on Jenkins.
--------------
Running locally

To run locally and generate HTML reports, use this maven goal verify. HTML reports should be generated under target/cucumber-html-reports

`mvn verify`

Jenkins
--------------
Install Cucumber HTML report plugin. Create a simple job and use this repository in the repository url field. In the post build actions, select option Cucumber reports and point to the location of the cucumber json report. Run the project as a maven goal test.

`mvn test`

Tags
--------------
You can pass a custom tag using terminal. Available tags are @smoke, @regression.

`mvn test -Dcucumber.filter.tags="@smoke"`

Browsers
--------------
You can pass change using command line argument BROWSER

`mvn test -DBROWSER=firefox`



