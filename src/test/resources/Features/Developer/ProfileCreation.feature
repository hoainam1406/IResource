Feature: Profile Creation Functionality
  I want to create profile with initial login into IResource website

  @Dev @ProfileCreationFunc @AllFields @IR-299_300_301_302_303_304_305
  Scenario Outline: IR-299_300_301_302_303_304_305 Verify that the error message is shown when leaving all field blank
    Given I want to open Profile Information page
    When I click Finish button
    Then The error message should be shown under that field "<message1>" "<message2>" "<message3>" "<message4>" "<message5>" "<message6>"
    Examples:
      |message1              |message2             |message3            |message4                    |message5            |message6            |
      |First name is required|Last name is required|Position is required|Contractual Term is required|Division is required|Location is required|

  @Dev @ProfileCreationFunc @NameField @IR-xxx
  Scenario: IR-xxx Verify that the error message is shown when enter firstname and lastname with space characters
    Given I want to open Profile Information page
    When I enter firstname and lastname with space characters
    And I select to Position
    And I select to Contractual Term
    And I select to Division
    And I select to Location
#    And I click Finish button
#    Then The error message should be shown under that field "<message1>" "<message2>"
#      Examples:
#        |message1              |message2             |
#        |First name is required|Last name is required|

  @Dev @ProfileCreationFunc @NameField @IR-xxx
  Scenario Outline: IR-xxx Verify that the My profile page is shown when entering firstname and lastname with text, number, special characters
    Given I want to open Profile Information page
    When I enter data in "<firstname>" and "<lastname>" fields
    And I select to Position
    And I select to Contractual Term
    And I select to Division
    And I select to Location
#    And I click Finish button
#    Then The My profile page should be shown
      Examples:
        | firstname | lastname |
        | Ngan@123  | Lee##123 |

  @Dev @ProfileCreationFunc @AllField @IR-298
  Scenario Outline: IR-298 Verify that the My profile page is shown when entering valid data in all fields
    Given I want to open Profile Information page
    When I enter data in "<firstname>" and "<lastname>" fields
    And I select to Position
    And I select to Contractual Term
    And I select to Division
    And I select to Location
#    And I click Finish button
#    Then The My profile page should be shown
    Examples:
      | firstname | lastname |
      | Ngan      | Kim      |

  @Dev @ProfileCreationFunc @PositionField @IR-306
  Scenario Outline: IR-306 Verify that the location will be filtered accordingly when the user selects division
    Given I want to open Profile Information page
    When I enter data in "<firstname>" and "<lastname>" fields
    And I select to new Division
    When I select to Location corresponding
    Examples:
      | firstname | lastname |
      | Ngan      | Kim      |