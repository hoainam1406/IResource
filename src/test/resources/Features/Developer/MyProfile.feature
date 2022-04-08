Feature: My profile functionalities
  I want to update my profile information into IResource website

  @Dev @MyProfileFunc @Certification @Popup @1.1
    Scenario Outline: IR-325 Verify that the popup is displayed successfully when clicking on 'Newcomer' icon
    Given I want to open My Profile page
    When I click on Newcomer icon
    Then The popup show with "<title>"
    Examples:
      | title          |
      | Certifications |

  @Dev @MyProfileFunc @Certification @Popup @1.2
    Scenario Outline: IR-326 Verify that the popup is disappeared when clicking on X icon on the right top of the popup
    Given I want to open My Profile page
    When I click on Newcomer icon
    And The popup show with "<title>"
    And I click on X icon
    Then The popup disappear and show "<header>" section
    Examples:
      | title          | header |
      | Certifications | Badges |

  @Dev @MyProfileFunc @Certification @NameCerField @1.3
    Scenario Outline: IR-328 Verify that the error message is shown when leaving Certification name field blank
    Given I want to open My Profile page
    When I click on Newcomer icon
    And The popup show with "<title>"
    And I click on Finish button
    Then The error message should be shown with "<error>"
    Examples:
      | title          | error                          |
      | Certifications | Certification name is required |

  @Dev @MyProfileFunc @Certification @NameCerField @1.4
  Scenario Outline: IR-329 Verify that user cannot view certifications after adding new certification with entering space characters
    Given I want to open My Profile page
    When I click on Newcomer icon
    And I enter certification name with space characters
    And I click on Finish button
    Then The error message should be shown with "<error>"
    Examples:
      | error                          |
      | Certification name is required |

  @Dev @MyProfileFunc @Certification @NameCerField @1.5
  Scenario Outline: IR-330 Verify that user can view certifications after adding new certification with accented text
    Given I want to open My Profile page
    When I click on Newcomer icon
    And I enter certification name with "<text>"
    And I click on Finish button
    Then The "<message>" should be shown
    Examples:
    | text             | message                   |
    | Kiểm thử tự động | Add Certification Success |

  @Dev @MyProfileFunc @Certification @NameCerField @1.6
  Scenario Outline: IR-327 Verify that user can view certifications after adding new certification with valid data
    Given I want to open My Profile page
    When I click on Newcomer icon
    And I enter certification name with "<text>"
    And I click on Finish button
    Then The "<message>" should be shown
    Examples:
      | text                   | message                   |
      | Information Technology | Add Certification Success |

  @Dev @MyProfileFunc @Certification @DeletePopup @1.7
  Scenario Outline: IR-334 Verify that the certifications is deleted when clicking on 'Delete Now' button on the popup
    Given I want to open My Profile page
    When I click on X icon beside
    And I click on Delete button
    Then The "<message>" should be shown
    Examples:
      | message                      |
      | Delete Certification Success |

  @Dev @MyProfileFunc @Certification @DeletePopup @1.8
  Scenario: IR-337 Verify that the certifications is not deleted when clicking on 'Cancel' button
    Given I want to open My Profile page
    When I click on X icon beside
    And I click on Cancel button
    Then The certification still shows
