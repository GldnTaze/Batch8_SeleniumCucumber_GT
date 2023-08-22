@regression
@C_education
Feature: Add education Tests


  Scenario: Check Add Education form Labels
    Given The user is on the login page
    When The user logs in with using credentials "vildansenih@gmail.com" and "Senih.1453"
    Then The user should be able to login
    When The user navigates to "gulden" and "My Profile"
    When The user navigates to "Add Education"
    Then The user should be able to see following form labels
      | School or Bootcamp *    |
      | Degree or Certificate * |
      | Study                   |
      | From Date               |
      | To Date                 |
      | Program Description     |


  @c_addEducation
  Scenario Outline: Adding new education record to <accountName>
    Given The user is on the login page
    When The user logs in with using credentials "<email>" and "<password>"
    And The user navigates to "<accountName>" and "<menu>"
    And The user navigates to "<subMenu>"
    And The user fills the form with: "<school>", "<degree>", "<study>", "<fromDate>", "<toDate>" and "<description>"
    Then The user should be able to see last added education record with "<school>"
    Then The user should be able to delete last added record with "<school>"
    Examples:
      | email                 | password   | accountName | menu       | subMenu       | school    | degree | study   | fromDate | toDate   | description  |
      | vildansenih@gmail.com | Senih.1453 | gulden      | My Profile | Add Education | Hacettepe | second | finance | 11122012 | 12122016 | hard program |
      | rosa@test.com         | Test123456 | Rosa        | My Profile | Add Education | Boğaziçi  | First  | History | 11122012 | 12122016 | nice program |



