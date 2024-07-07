Feature: Login

  Scenario: Student should be able to successfully login with valid credentials
    Given student at talentTEK Homepage
    And student enter their valid email address
    And student enter their valid password
    When student clicks on Login Button from login page
    Then student should be able to successfully login

  Scenario: Student should be not bale to successfully login with invalid email address
    Given student at talentTEK Homepage
    And student enter their invalid email address
    And student enter their valid password
    When student clicks on Login Button from login page
    Then student should not be able to successfully login

  Scenario: Student should be not bale to successfully login with invalid password
    Given student at talentTEK Homepage
    And student enter their valid email address
    And student enter their invalid password
    When student clicks on Login Button from login page
    Then student should not be able to successfully login

  Scenario: Student should be not bale to successfully login with invalid credentials
    Given student at talentTEK Homepage
    And student enter their invalid email address
    And student enter their invalid password
    When student clicks on Login Button from login page
    Then student should not be able to successfully login
