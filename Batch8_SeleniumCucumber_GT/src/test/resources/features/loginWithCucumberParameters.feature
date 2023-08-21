@regression
Feature: Login Tests with cucumber Parameters
 # Background:
  #  Given The user is on the login page
@rerun
  Scenario: Login as gulden - Cucumber Parameters
    Given The user is on the login page
    When  The user logs in with using credentials "vildansenih@gmail.com" and "Senih.1453"
    Then The user should be able to login
    And Verify that username "gulden" is displayed on dashboard page


  Scenario: Login as mike - Cucumber Parameters
    Given The user is on the login page
    When  The user logs in with using credentials "mike@gmail.com" and "mike1234"
    Then The user should be able to login
    And Verify that username "mike" is displayed on dashboard page

  #class task
  # login as Rosa with cucumber parameters

  @C_maven_2
  Scenario: Login as Rosa -Cucumber Parameters
    Given The user is on the login page
    When The user logs in with using credentials "rosa@test.com" and "Test123456"
    Then The user should be able to login
    And Verify that username "Rosa" is displayed on dashboard page
    And The number is 5
    And The number also is 5.5

  @C_ScenarioOutLine
  Scenario Outline: Login with different names
    Given The user is on the login page
    When The user logs in with using credentials "<userEmail>" and "<password>"
    Then The user should be able to login
    And Verify that username "<name>" is displayed on dashboard page
    Examples:
      | userEmail             | password   | name   |
      | rosa@test.com         | Test123456 | Rosa   |
      | mike@gmail.com        | mike1234   | mike   |
      | vildansenih@gmail.com | Senih.1453 | gulden |
@C_maven

  Scenario: Login with list
  Given The user is on the login page
    When The user logins with following credentials
      | vildansenih@gmail.com |
      | Senih.1453            |
    Then The user should be able to login

 @rerun
  Scenario Outline:
   Given The user is on the login page
    When The user logins with following credentials
      | <userEmail> |
      | <password>  |
    Then The user should be able to login
    Examples:
      | userEmail             | password   |
      | rosa@test.com         | Test123456 |
      | mike@gmail.com        | mike1234   |
      | vildansenih@gmail.com | Senih.1453 |