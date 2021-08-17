# EHS Test Automation Task
## Table of contents
* [General info](#general-info)
* [Information About Framework](#Information-About-Framework)

## General info

This project is a Maven Project and it is created with Selenium - Java - Cucumber BDD - JUnit libraries.
It is created based on Page Object Model and it has singleton design pattern for Driver.

## Information About Framework

In this Test Automation Framework under the test package we have java and resources. 

Under resources, we have our feature files that we write on them our test steps in gherkin language. 

Under Java; we have pages, runners, step definitions and utilities packages. 
Runners provide us connection between our feature files and step definitions. we have failed test runners, that provides
us to rerun the failed tests automatically according to our setups. 
Under utilities; we have Driver class that is created according to singleton design pattern. We can add our other 
utility classes under this package whenever we need.




