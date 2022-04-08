Feature: Purpose pitch test cases
  I want to create my project

  @PM @ProjectCreation @PP @UploadThumbnail @IR-99
  Scenario:IR-99 - Verify that user is able to upload a file with a valid extension
    Given I want to open Project Creation page after logging
    When I click Upload icon
    And I select a Thumbnail
    Then The thumbnail should be shown

  @PM @ProjectCreation @PP @ProjectName @IR-101
  Scenario Outline: IR-101 - Verify that user is unable to leave the project name field blank
    Given I want to open Project Creation page after logging
    When I click the Finish button
    Then The error "<Message>" should be shown below the field Project name
    Examples:
    |Message|
    |Project name is required|

  @PM @ProjectCreation @PP @ProjectName @IR-196
  Scenario Outline: IR-196 - Verify that user is unable to enter data less than 2 characters in the Project name field
    Given I want to open Project Creation page after logging
    When I enter data in "<Project name>" field
    And I click the Finish button
    Then The error "<Message>" should be shown below the field Project name
    Examples:
      |Project name|Message|
      |v|Project name is too short|

  @PM @ProjectCreation @PP @ProjectName @IR-336
  Scenario Outline: IR-336 - Verify that the error message is show when user enters project name more than 100 characters
    Given I want to open Project Creation page after logging
    When I enter data in "<Project name>" field
    And I click the Finish button
    Then The error "<Message>" should be shown below the field Project name
    Examples:
      |Project name|Message|
      |Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy|Project name is too long|

  @PM @ProjectCreation @PP @ProjectName @IR-100
  Scenario Outline: IR-100 - Verify that alphabet characters are accepted in both upper and lower case.
    Given I want to open Project Creation page after logging
    When I enter data in "<Project name>" field
    And I click the Finish button
    Then No error message is shown
    Examples:
      |Project name|
      |SmartDev IResource Project|

  @PM @ProjectCreation @PP @Status @IR-198
  Scenario Outline: IR-198 - Verify that user is unable to create project when leaving the status field blank
    Given I want to open Project Creation page after logging
    When I click the Finish button
    Then The error "<Message>" should be shown below the Status field
    Examples:
      |Message|
      |Status is required|

  @PM @ProjectCreation @PP @Status @IR-102
    Scenario: Verify that user is able to select the item when clicking on the radio button by mouse
    Given I want to open Project Creation page after logging
    When I select the Public radio button
    Then The Public radio button is selected


  @PM @ProjectCreation @PP @Status @IR-103
    Scenario: Verify that user is able to reselect the checkbox when reselecting the item
    Given I want to open Project Creation page after logging
    When I select the Public radio button
    And I reselect the Confidential radio button
    Then The Confidential radio button is selected


  @PM @ProjectCreation @PP @StartDate @IR-104
    Scenario: Verify that the calendar is openable when user clicks on any date box
    Given I want to open Project Creation page after logging
    When I click on any date box
    Then The calendar is openable


  @PM @ProjectCreation @PP @StartDate @IR-106

  @PM @ProjectCreation @PP @StartDate @IR-108
    Scenario Outline:Verify that the error message is shown when user enters start date is greater than the end date
    Given I want to open Project Creation page after logging
    When I select the Start date
    And I select the End date
    And I click the Finish button
    Then The error "<Message>" is shown below the End date field
    Examples:
    |Message|
    |End date can't be before start date|








