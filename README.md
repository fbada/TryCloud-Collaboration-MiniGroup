# Mini-Group TryCloud Suite

[![Java CI with Maven](https://github.com/fbada/TryCloud-Collaboration-MiniGroup/actions/workflows/maven.yml/badge.svg?branch=master)](https://github.com/fbada/TryCloud-Collaboration-MiniGroup/actions/workflows/maven.yml)



Basic cucumber framework used for running automation tests on Github Actions and Jenkins using EC2 instances.
This web application has automatic data backup for servers & computers with 
secure, encrypted cloud that manages all types of files, photos, and videos
Remote file access from any device. It allowss for team collaboration and real-time communication.

BDD Cucumber framework  is used to test the TryCloud company’s cloud storage web-based application in this assignment specifically using elenium and Javaa. 
```
Java 11
Maven 3
Selenium WebDriver, 
Junit 4, 
Cucumber Design patterns - POM, Singleton 
Git/Github
Jenkins
GitHub Actions
```
## Running locally
To run locally and generate HTML reports, use this maven goal *verify*. HTML reports should be generated under target/cucumber-html-reports
```
mvn verify
```

## Jenkins
Install [Cucumber HTML report plugin](https://plugins.jenkins.io/cucumber-reports). Create a simple job and use this repository in the repository url field. In the post build actions, select option Cucumber reports and point to the location of the cucumber json report. Run the project as a maven goal *test*.

```
mvn test
```
## Tags
You can pass a custom tag using terminal. Available tags are **@smoketest**, **@regression**. 

```
mvn test -Dcucumber.filter.tags="@smoketest"
```
## Browsers
You can pass change using command line argument BROWSER, and run two tests parallel with two separate tags as seen below
```
mvn test -DBROWSER=firefox or mvn test -DBROWSER=chrome
```
