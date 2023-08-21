@regression

Feature: Login Funtionality
  # user story=feature
  #test case=scenario
  #test steps=Given,When,Then etc.
 # Background:
  #  Given The user is on the login page

  @gulden @Login
  Scenario: Login as gulden
    Given The user is on the login page
    When The user enters gulden's credentials
    Then The user should be able to login


  @mike @Login @dataBase
  Scenario: Login as mike
    Given  The user is on the login page
    When The user enters mike's credentials
    Then The user should be able to login


      # class task:
  #new scenerio: Login as Rosa

  @Rosa @smoke @Login
  Scenario: Login as Rosa
    Given The user is on the login page
    When The user enters Rosa's credentials
    Then The user should be able to login


  @john @Login @smoke
  Scenario: Login as John
    Given The user is on the login page
    When The user enters John's credentials
    Then The user should be able to login
