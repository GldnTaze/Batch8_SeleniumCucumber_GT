@regression
Feature: Dashboard Menu Checks

  @c_List
  Scenario: Example-1 for Cucumber List
    Given The user is on the login page
    When The user logs in with using credentials "vildansenih@gmail.com" and "Senih.1453"
    Then The user should be able to login
    And The user should be able to see following menu
      | Dashboard   |
      | Developers  |
      | Components  |
      | Forms       |
      | JavaScript  |
      | Melih Gezer |

  @c_Map
  Scenario: Example-2 Map for Cucumber
   #   Given The user is on the login page
    When The user logs in following menu
      | usermail | vildansenih@gmail.com |
      | password | Senih.1453            |
      | name     | gulden                |
    Then The user should be able to login
    And The user should be able to see following menu
      | Dashboard   |
      | Developers  |
      | Components  |
      | Forms       |
      | JavaScript  |
      | Melih Gezer |


    #Class Task
  #go to web page
  #login with user credentials
  #navigate to my profile menu
  #see the following menus Overview, Edit Profile, Add Experience, Add Education, Change Password

  @c_Task
  Scenario: Example-3 for Task
 #   Given The user is on the login page
    When The user logs in with using credentials "mgezer@gmail.com" and "Mg12345678"
    Then The user should be able to login
    And The user navigates to "Melih Gezer" and "My Profile"
    Then The user should be able to see following subMenu
      | Overview        |
      | Edit Profile    |
      | Add Experience  |
      | Add Education   |
      | Change Password |


    # Class Task f2 HW
    # go to web page -> https://demoqa.com/
    # verify that user see following menu list elements, forms,...
  @C_ScenarioOutLine
  Scenario Outline: : Example-2 Map for Cucumber
   #   Given The user is on the login page
    When The user logs in following menu
      | usermail | <userEmail> |
      | password | <password>  |

    Then The user should be able to login
    And The user should be able to see following menu
      | Dashboard  |
      | Developers |
      | Components |
      | Forms      |
      | JavaScript |
      | <name>     |
    Examples:
      | userEmail        | password   | name        |
      | rosa@test.com    | Test123456 | Rosa        |
      | mike@gmail.com   | mike1234   | mike        |
      | mgezer@gmail.com | Mg12345678 | Melih Gezer |