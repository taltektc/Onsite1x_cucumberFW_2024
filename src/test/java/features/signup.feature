Feature: Signup
  Background:
    Given student at talentTEK Homepage

  @signup @regression @smoke
  Scenario: Student signup with invalid firstname
    And student enter their invalid firstname

