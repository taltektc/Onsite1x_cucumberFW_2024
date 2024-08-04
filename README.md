# Onsite1x_cucumberFW_2024
Java, Cucumber BDD, Gherkin, CI/CD, GitHub, Maven, Git ect

# Tools that are required: https://talenttektraining.atlassian.net/wiki/spaces/AD/pages/951025684/Required+Tools+Java+Selenium+API
- GitHub Account
- Install Git
- Java 17 or up
- Cucumber and Selenium (add that inside the dependencies)
- Install Maven
- IDE: IntelliJ Community Edition (FREE)

# List of dependencies: https://mvnrepository.com/ goes inside the pom.xml
- selenium-java
- cucumber-testng
- cucumber-java

# Reporting
- JVM Report
  - In pom.xml file - We added a block call "Build". 
    - in that block just change the projectName value 

# Plugins from IntelliJ
- Cucumber for Java
- Gherkin

# How to run the test in CLI / Terminal using Command
- mvn verify (it will run all test with the default browser and env)
- mvn verify -Dbrowser=chrome -Denv=qa (it will run in Chrome browser in QA Env qa.taltektc.com)
- mvn verify -Dbrowser=chrome -Denv=qa -Dcucumber.filter.tags=@Test (it will run with particular tag)


# Steps by steps
1. Create repo in GitHub
2. Clone it into your local
3. Create project using intelliJ IDE and ensure to point at cloned project (step 2)