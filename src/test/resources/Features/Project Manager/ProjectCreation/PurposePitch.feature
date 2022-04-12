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
  Scenario Outline: IR-100 Verify that alphabet characters are accepted in both upper and lower case.
    Given I want to open Project Creation page after logging
    When I select the Public radio button
    And I enter data in "<Start date>", "<End date>", "<Project name>", "<Problem Statement>", "<The big vision>", "<Value Proposition>", "<Customer>" fields
    And I click the Finish button
    Then The Project Health page is shown with "<Title>"
    Examples:
      |Start date|End date|Project name|Problem Statement|The big vision|Value Proposition|Customer|Title|
      |04/07/2022|04/27/2022|SmartDev IResource Project|Lorem Ipsum|Lorem Ipsum|Lorem Ipsum |Lorem Ipsum|Project Health|

  @PM @ProjectCreation @PP @ProjectName @ContainBlank @IR-194 @IR-199  @IR-357 @IR-363 @IR-370
  Scenario Outline: IR-100 IR - 194- Verify that user is able to enter data contain blank space.
    Given I want to open Project Creation page after logging
    When I select the Public radio button
    And I enter data in "<Start date>", "<End date>", "<Project name>", "<Problem Statement>", "<The big vision>", "<Value Proposition>", "<Customer>" fields
    And I click the Finish button
    Then The Project Health page is shown with "<Title>"
    Examples:
      |Start date|End date|Project name|Problem Statement|The big vision|Value Proposition|Customer|Title|
      |04/07/2022|04/27/2022|SmartDev IResource Project|Lorem Ipsum|Lorem Ipsum|Lorem Ipsum |Lorem Ipsum|Project Health|

  @PM @ProjectCreation @PP @ProjectName @SpecialCharacters @IR-195
  Scenario Outline: IR-195 - Verify that user is able to enter data contain symbol, special characters
    Given I want to open Project Creation page after logging
    When I select the Public radio button
    And I enter data in "<Start date>", "<End date>", "<Project name>", "<Problem Statement>", "<The big vision>", "<Value Proposition>", "<Customer>" fields
    And I click the Finish button
    Then The Project Health page is shown with "<Title>"
    Examples:
      |Start date|End date|Project name|Problem Statement|The big vision|Value Proposition|Customer|Title|
      |04/07/2022|04/27/2022|$©™® |Lorem Ipsum|Lorem Ipsum|Lorem Ipsum|Lorem Ipsum|Project Health|
      |04/07/2022|04/27/2022|@#$%^ |Lorem Ipsum|Lorem Ipsum|Lorem Ipsum|Lorem Ipsum|Project Health|


  @PM @ProjectCreation @PP @ProjectName @NumericCharacters @IR-335 @IR-106
  Scenario Outline: IR-335 -Verify that user is able to enter data contain numeric characters
    Given I want to open Project Creation page after logging
    When I select the Public radio button
    And I enter data in "<Start date>", "<End date>", "<Project name>", "<Problem Statement>", "<The big vision>", "<Value Proposition>", "<Customer>" fields
    And I click the Finish button
    Then The Project Health page is shown with "<Title>"
    Examples:
      |Start date|End date|Project name|Problem Statement|The big vision|Value Proposition|Customer|Title|
      |04/07/2022|04/27/2022|123456 |Lorem Ipsum|Lorem Ipsum|Lorem Ipsum|Lorem Ipsum|Project Health|


  @PM @ProjectCreation @PP @ProjectName @Spaces @IR-338
  Scenario Outline: Verify that the error message is shown when user enters only spaces in the Project Name field
    Given I want to open Project Creation page after logging
    When I enter spaces in Project name field
    And I click the Finish button
    Then The error "<Message>" should be shown below the field Project name
    Examples:
      |Message|
      |Project name cannot contain only blankspaces|
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
    Scenario: Verify that user is able to reselect the checkbox when re-selecting the item
    Given I want to open Project Creation page after logging
    When I select the Public radio button
    And I reselect the Confidential radio button
    Then The Confidential radio button is selected


  @PM @ProjectCreation @PP @StartDate @IR-104
    Scenario: Verify that the calendar is openable when user clicks on any date box
    Given I want to open Project Creation page after logging
    When I click on any date box
    Then The calendar is openable


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

  @PM @ProjectCreation @PP @StartDate @EndDate @Blank @IR-339 @IR-340
  Scenario Outline: IR-339 & IR-340 -  Verify that user is unable to create "Purpose pitch" when leaving the "Start date" and "End date" fields blank
    Given I want to open Project Creation page after logging
    When I click the Finish button
    Then The errors "<Message1>" and "<Message2>" are shown below the Start date and End date field
    Examples:
      |Message1|Message2|
      |Start date is required|End date is required|

  @PM @ProjectCreation @PP @StartDate @InvalidData @IR-342 @IR-343
  Scenario Outline: Verify that the error message is shown when user enters only alphabets or special characters in the "Start date" field
    Given I want to open Project Creation page after logging
    When I enter data in "<Start date>" field
    And I click the Finish button
    Then The error "<Message>" should be shown below the Start date
    Examples:
      |Start date|Message|
      |abcdef|Start date is required|
      |@#$%^&*|Start date is required|

  @PM @ProjectCreation @PP @StartDate @InvalidData @IR-345 @IR-346
  Scenario Outline: Verify that the error message is shown when user enters only alphabets or special characters in the "End date" field
    Given I want to open Project Creation page after logging
    When I enter data in "<End date>" field
    And I click the Finish button
    Then The error "<Message>" should be shown below the End date
    Examples:
      |End date|Message|
      |abcdef|End date is required|
      |@#$%^&*|End date is required|

  @PM @ProjectCreation @PP @ProblemStatement @Blank @IR-109
  Scenario Outline: Verify that user is unable to leave the Problem Statement mandatory field blank
    Given I want to open Project Creation page after logging
    When I click the Finish button
    Then The error "<Message>" should be shown below the field Problem Statement
    Examples:
      |Message|
      |Problem Statement is required|

  @PM @ProjectCreation @PP @ProblemStatement @Number @SpecialCharacter @IR-110
  Scenario Outline: Verify that user is able to enter number or special characters
    Given I want to open Project Creation page after logging
    When I select the Public radio button
    And I enter data in "<Start date>", "<End date>", "<Project name>", "<Problem Statement>", "<The big vision>", "<Value Proposition>", "<Customer>" fields
    And I click the Finish button
    Then The Project Health page is shown with "<Title>"
    Examples:
      |Start date|End date|Project name|Problem Statement|The big vision|Value Proposition|Customer|Title|
      |04/07/2022|04/27/2022|SmartDev IResource Project|123456|Lorem Ipsum|Lorem Ipsum |Lorem Ipsum|Project Health|
      |04/07/2022|04/27/2022|SmartDev IResource Project|!@#$%|Lorem Ipsum|Lorem Ipsum |Lorem Ipsum|Project Health|

  @PM @ProjectCreation @PP @ProblemStatement @Minimum @IR-200
  Scenario Outline: Verify that user is unable to enter data less than 2 characters in the Problem Statement field
    Given I want to open Project Creation page after logging
    When I enter "<Data>" in Problem Statement field
    And I click the Finish button
    Then The error "<Message>" should be shown below the field Problem Statement
    Examples:
      |Data|Message|
      |T|Problem Statement is too short|

  @PM @ProjectCreation @PP @ProblemStatement @OnlySpaces @IR-349
    Scenario Outline: Verify that the error message is shown when user enters only spaces in the field Problem Statement
    Given I want to open Project Creation page after logging
    When I enter spaces in Problem Statement field
    And I click the Finish button
    Then The error "<Message>" should be shown below the field Problem Statement
    Examples:
      |Message|
      |Problem Statement cannot contain only blankspaces|

  @PM @ProjectCreation @PP @ProblemStatement @Maximum @IR-350
  Scenario Outline: Verify that the error message is shown when user enters more than 500 characters in the field
    Given I want to open Project Creation page after logging
    When I enter "<Data>" in Problem Statement field
    And I click the Finish button
    Then The error "<Message>" should be shown below the field Problem Statement
    Examples:
      |Data|Message|
      |Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop pung|Problem Statement is too long|

  @PM @ProjectCreation @PP @TheBigVision @Blank @IR-354
  Scenario Outline: Verify that user is unable to leave the The big vision mandatory field blank
    Given I want to open Project Creation page after logging
    When I click the Finish button
    Then The error "<Message>" should be shown below the field The big vision
    Examples:
      |Message|
      |Big Vision is required|

  @PM @ProjectCreation @PP @TheBigVision @Number @SpecialCharacter @IR-356
  Scenario Outline: Verify that user is able to enter number or special characters
    Given I want to open Project Creation page after logging
    When I select the Public radio button
    And I enter data in "<Start date>", "<End date>", "<Project name>", "<Problem Statement>", "<The big vision>", "<Value Proposition>", "<Customer>" fields
    And I click the Finish button
    Then The Project Health page is shown with "<Title>"
    Examples:
      |Start date|End date|Project name|Problem Statement|The big vision|Value Proposition|Customer|Title|
      |04/07/2022|04/27/2022|SmartDev IResource Project|Lorem Ipsum|123456|Lorem Ipsum |Lorem Ipsum|Project Health|
      |04/07/2022|04/27/2022|SmartDev IResource Project|Lorem Ipsum|!@#$%|Lorem Ipsum |Lorem Ipsum|Project Health|

  @PM @ProjectCreation @PP @TheBigVision @Minimum @IR-358
  Scenario Outline: Verify that user is unable to enter data less than 2 characters in The big vision field
    Given I want to open Project Creation page after logging
    When I enter "<Data>" in The big vision field
    And I click the Finish button
    Then The error "<Message>" should be shown below the field The big vision
    Examples:
      |Data|Message|
      |T|Big Vision is too short|


  @PM @ProjectCreation @PP @TheBigVision @OnlySpaces @IR-359
  Scenario Outline: Verify that the error message is shown when user enters only spaces in the field the Big Vision
    Given I want to open Project Creation page after logging
    When I enter spaces in the Big Vision field
    And I click the Finish button
    Then The error "<Message>" should be shown below the field The big vision
    Examples:
      |Message|
      |Big Vison cannot contain only blankspaces|

  @PM @ProjectCreation @PP @TheBigVision @Maximum @IR-360
  Scenario Outline: Verify that the error message is shown when user enters more than 500 characters in the field
    Given I want to open Project Creation page after logging
    When I enter "<Data>" in The big vision field
    And I click the Finish button
    Then The error "<Message>" should be shown below the field The big vision
    Examples:
      |Data|Message|
      |Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop pung|Big vision is too long|

  @PM @ProjectCreation @PP @ValueProposition @Blank @IR-362
  Scenario Outline: Verify that user is unable to leave the Value Proposition mandatory field blank
    Given I want to open Project Creation page after logging
    When I click the Finish button
    Then The error "<Message>" should be shown below the field Value Proposition
    Examples:
      |Message|
      |Value Proposition is required|

  @PM @ProjectCreation @PP @ValueProposition @Number @SpecialCharacter @IR-355
  Scenario Outline: Verify that user is able to enter number or special characters
    Given I want to open Project Creation page after logging
    When I select the Public radio button
    And I enter data in "<Start date>", "<End date>", "<Project name>", "<Problem Statement>", "<The big vision>", "<Value Proposition>", "<Customer>" fields
    And I click the Finish button
    Then The Project Health page is shown with "<Title>"
    Examples:
      |Start date|End date|Project name|Problem Statement|The big vision|Value Proposition|Customer|Title|
      |04/07/2022|04/27/2022|SmartDev IResource Project|Lorem Ipsum|Lorem Ipsum|123456 |Lorem Ipsum|Project Health|
      |04/07/2022|04/27/2022|SmartDev IResource Project|Lorem Ipsum|Lorem Ipsum|!@#$% |Lorem Ipsum|Project Health|

  @PM @ProjectCreation @PP @ValueProposition @Minimum @IR-364
  Scenario Outline: Verify that user is unable to enter data less than 2 characters in the Value Proposition field
    Given I want to open Project Creation page after logging
    When I enter "<Data>" in Value Proposition field
    And I click the Finish button
    Then The error "<Message>" should be shown below the field Value Proposition
    Examples:
      |Data|Message|
      |T|Value Proposition is too short|


  @PM @ProjectCreation @PP @ValueProposition @OnlySpaces @IR-367
  Scenario Outline: Verify that the error message is shown when user enters only spaces in the field Value Proposition
    Given I want to open Project Creation page after logging
    When I enter spaces in the Value Proposition field
    And I click the Finish button
    Then The error "<Message>" should be shown below the field Value Proposition
    Examples:
      |Message|
      |Value Proposition cannot contain only blankspaces|

  @PM @ProjectCreation @PP @ValueProposition @Maximum @IR-365
  Scenario Outline: Verify that the error message is shown when user enters more than 500 characters in the field
    Given I want to open Project Creation page after logging
    When I enter "<Data>" in Value Proposition field
    And I click the Finish button
    Then The error "<Message>" should be shown below the field Value Proposition
    Examples:
      |Data|Message|
      |Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop pung|Value Proposition is too long|

  @PM @ProjectCreation @PP @Customer @Blank @IR-368
  Scenario Outline: Verify that user is unable to leave the Customer mandatory field blank
    Given I want to open Project Creation page after logging
    When I click the Finish button
    Then The error "<Message>" should be shown below the field Customer
    Examples:
      |Message|
      |Customer is required|

  @PM @ProjectCreation @PP @Customer @Number @SpecialCharacter @IR-369
  Scenario Outline: Verify that user is able to enter number or special characters
    Given I want to open Project Creation page after logging
    When I select the Public radio button
    And I enter data in "<Start date>", "<End date>", "<Project name>", "<Problem Statement>", "<The big vision>", "<Value Proposition>", "<Customer>" fields
    And I click the Finish button
    Then The Project Health page is shown with "<Title>"
    Examples:
      |Start date|End date|Project name|Problem Statement|The big vision|Value Proposition|Customer|Title|
      |04/07/2022|04/27/2022|SmartDev IResource Project|Lorem Ipsum |Lorem Ipsum|Lorem Ipsum |123456|Project Health|
      |04/07/2022|04/27/2022|SmartDev IResource Project|Lorem Ipsum |Lorem Ipsum|Lorem Ipsum |!@#$%|Project Health|

  @PM @ProjectCreation @PP @Customer @Minimum @IR-371
  Scenario Outline: Verify that user is unable to enter data less than 2 characters in the Problem Statement field
    Given I want to open Project Creation page after logging
    When I enter "<Data>" in Customer field
    And I click the Finish button
    Then The error "<Message>" should be shown below the field Customer
    Examples:
      |Data|Message|
      |T|Customer is too short|

#  @IR-374
  @PM @ProjectCreation @PP @Customer @OnlySpaces @IR-374
  Scenario Outline: Verify that the error message is shown when user enters only spaces in the field Customer
    Given I want to open Project Creation page after logging
    When I enter spaces in the Customer field
    And I click the Finish button
    Then The error "<Message>" should be shown below the field Customer
    Examples:
      |Message|
      |Customer cannot contain only blankspaces|

  @PM @ProjectCreation @PP @Customer @Maximum @IR-375
  Scenario Outline: Verify that the error message is shown when user enters more than 500 characters in the Customer field
    Given I want to open Project Creation page after logging
    When I enter "<Data>" in Customer field
    And I click the Finish button
    Then The error "<Message>" should be shown below the field Customer
    Examples:
      |Data|Message|
      |Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop pung|Customer is too long|

  @PM @ProjectCreation @PP @RevenueStreams @Blank @IR-111
  Scenario Outline: Verify that user is able to leave the Revenue Streams field blank
    Given I want to open Project Creation page after logging
    When I select the Public radio button
    And I enter data in "<Start date>", "<End date>", "<Project name>", "<Problem Statement>", "<The big vision>", "<Value Proposition>", "<Customer>" fields
    And I click the Finish button
    Then The Project Health page is shown with "<Title>"
    Examples:
      |Start date|End date|Project name|Problem Statement|The big vision|Value Proposition|Customer|Title|
      |04/07/2022|04/27/2022|SmartDev IResource Project|Lorem Ipsum |Lorem Ipsum|Lorem Ipsum |Lorem Ipsum|Project Health|

  @PM @ProjectCreation @PP @RevenueStreams @Blank @IR-201
  Scenario Outline: Verify that user is able to enter data contain uppercase or numeric or symbol or special characters
    Given I want to open Project Creation page after logging
    When I select the Public radio button
    And I enter data in "<Start date>", "<End date>", "<Project name>", "<Problem Statement>", "<The big vision>", "<Value Proposition>", "<Customer>" fields
    And I enter "<Data>" in Revenue Streams field
    And I click the Finish button
    Then The Project Health page is shown with "<Title>"
    Examples:
      |Start date|End date|Project name|Problem Statement|The big vision|Value Proposition|Customer|Data|Title|
      |04/07/2022|04/27/2022|SmartDev IResource Project|Lorem Ipsum |Lorem Ipsum|Lorem Ipsum |Lorem Ipsum|UPPERcase|Project Health|
      |04/07/2022|04/27/2022|SmartDev IResource Project|Lorem Ipsum |Lorem Ipsum|Lorem Ipsum |Lorem Ipsum|@#$%^|Project Health|
      |04/07/2022|04/27/2022|SmartDev IResource Project|Lorem Ipsum |Lorem Ipsum|Lorem Ipsum |Lorem Ipsum|12345|Project Health|
      |04/07/2022|04/27/2022|SmartDev IResource Project|Lorem Ipsum |Lorem Ipsum|Lorem Ipsum |Lorem Ipsum|$©™®|Project Health|

  @PM @ProjectCreation @PP @RevenueStreams @FinishButton @IR-112
  Scenario Outline: Verify that the page is navigable when entering all of mandatory fields then click on 'Finish' button
    Given I want to open Project Creation page after logging
    When I select the Public radio button
    And I enter data in "<Start date>", "<End date>", "<Project name>", "<Problem Statement>", "<The big vision>", "<Value Proposition>", "<Customer>" fields
    And I click the Finish button
    Then The Project Health page is shown with "<Title>"
    Examples:
      |Start date|End date|Project name|Problem Statement|The big vision|Value Proposition|Customer|Title|
      |04/07/2022|04/27/2022|Prius|ABC| ABC| ABC|ABC|Project Health|








