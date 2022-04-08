Feature: Profile Creation Functionality
  I want to create profile with initial login into IResource website

  @Dev @ProfileCreationFunc @AllFields
  Scenario Outline: IR-301 Verify that the error message is shown when leaving Firstname field blank
    Given I want to open Profile Information page
    When I enter "<Lastname>","<Position>","<Contractual Term>","<Division>","<Location>"
    And I click Finish button
    Then The error message should be shown under that field "<Message>"
    Examples:
      | Lastname | Position          | Contractual Term  | Division         | Location | Message                |
      | Kim      | Quality Assurance | Fulltime employee | SmartDev Vietnam | Da Nang  | First name is required |

