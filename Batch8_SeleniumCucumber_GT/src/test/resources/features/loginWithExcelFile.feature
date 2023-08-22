Feature: Login test with excel file
  Scenario Outline:
    Given The user is on the login page
    When The user logins with using excel file:"<path>","<sheetName>" and <rowNumber>
    Then The user should be able to login
    Examples:
      | path | sheetName | rowNumber |
