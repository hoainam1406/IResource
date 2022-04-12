Feature: Login Test cases
  I want to login into IResource website

  @Login @LoginFunctionality @EmailField
  Scenario Outline:IR-20A: Verify that user is able to login successfully when entering valid email and password
    Given I want to open login page
    And  I want to enter valid email and password (initial login)
    And I click Login button
    Then The user will be redirected to corresponding page "<page>" with url "<url>"
    Examples:
      |page            |url                                           |
      |Project Creation|https://iresource.smartdev.vn/profile-creation|

  @Login @LoginFunctionality @EmailField
  Scenario Outline:IR-20B: Verify that user is able to login successfully when entering valid email and password
    Given I want to open login page
    And  I want to enter valid email and password (subsequent login)
    And I click Login button
    Then The user will be redirected to corresponding page "<page>" with url "<url>"
    Examples:
      |page           |url                                           |
      |Explore Project|https://iresource.smartdev.vn/explore-projects|

  @Login @LoginFunctionality @EmailField
  Scenario Outline:IR-222:Verify that user cannot log in with Email and Password field are empty
    Given I want to open login page
    And I click Login button
    Then The error message "<Message>" should be shown below each field
    Examples:
      |Message  |
      |Required!|

  @Login @LoginFunctionality @EmailField
  Scenario Outline:IR-139: Verify that user cannot log in with Email and Password field are empty
    Given I want to open login page
    And  I enter Email field without domain
    And I click Login button
    Then The error message below "<Field>" field should be shown "<Message>"
    Examples:
      |Field   |Message                      |
      |Email   |Invalid email format         |

  @Login @LoginFunctionality @EmailField
  Scenario Outline:IR-138: Verify that user cannot login successfully when entering the email without a domain
    Given I want to open login page
    And  I want to enter email contains two @ sign and valid Password
    And I click Login button
    Then The error message should show and user is stay in login page "<url>"
    Examples:
      |url|
      |https://iresource.smartdev.vn/login|

  @Login @LoginFunctionality @EmailField
  Scenario Outline:IR-137: Verify that user cannot login successfully when entering the email without @
    Given I want to open login page
    And  I want to enter email without @
    And I click Login button
    Then The error message should show and user is stay in login page "<url>"
    Examples:
      |url|
      |https://iresource.smartdev.vn/login|

  @Login @LoginFunctionality @EmailField
  Scenario Outline:IR-132: Verify that user is unable to login when leaving the email field blank
    Given I want to open login page
    And  I leave the email field blank and enter valid password
    And I click Login button
    Then The error message should show and user is stay in login page "<url>"
    Examples:
      |url|
      |https://iresource.smartdev.vn/login|

  @Login @LoginFunctionality @EmailField
  Scenario Outline:IR-259: Verify that the error message displayed when entering an email containing multiple consecutive dots
    Given I want to open login page
    And  I want to enter the email contains multiple consecutive dots
    And I click Login button
    Then The error message below "<Field>" field should be shown "<Message>"
    Examples:
      |Field   |Message                      |
      |Email   |Invalid email format         |

  @Login @LoginFunctionality @EmailField
  Scenario Outline:IR-260: Verify that user is able to login when entering unregistered email
    Given I want to open login page
    And  I want to enter an unregistered email
    And I click Login button
    Then The error message "<Message>" should be shown
    Examples:
      |Message                      |
      |Email or password is invalid.|

  @Login @LoginFunctionality @PasswordField
  Scenario Outline:IR-141: Verify that user cannot login successfully when entering the password less than 5 characters
    Given I want to open login page
    When I enter valid Email and Password less than 4 characters
    And I click Login button
    Then The error message below "<Field>" field should be shown "<Message>"
    Examples:
      |Field   |Message             |
      |Password|Minimum 5 characters|

  @Login @LoginFunctionality @PasswordField
  Scenario Outline:IR-22: Verify that user is unable to login when entering a valid email and an invalid password
    Given I want to open login page
    When I enter valid Email and invalid Password
    And I click Login button
    Then The error message "<Message>" should be shown
    Examples:
      |Message                      |
      |Email or password is invalid.|

  @Login @LoginFunctionality @PasswordField
  Scenario Outline:IR-133: Verify that user is unable to login when leaving the password field blank
    Given I want to open login page
    When I enter valid Email
    And I click Login button
    Then The error message below "<Field>" field should be shown "<Message>"
    Examples:
      |Field   |Message    |
      |Password|Required!  |

  @Login @LoginFunctionality @PasswordField
  Scenario:IR-23: Verify that user is unable to login when leaving the password field blank
    Given I want to open login page
    When I only enter Password field
    Then The data in password field should be visible as asterisk orr bullet signs

  @Login @LoginFunctionality @PasswordField
  Scenario:IR-24: Verify that the data in the password field is shown when clicking 'eye icon'
    Given I want to open login page
    When I only enter Password field
    And I click 'Eye' icon
    Then The data of the password field should be shown

  @Login @LoginFunctionality @RememberMeCheckbox
  Scenario:IR-26: Verify that the login data is saved when clicking ‘Remember Me’ button
    Given I want to open login page
    When I enter valid Email and Password
    And I click on 'Remember Me' checkbox
    And I click Login button
    And I click 'Log out' button
    Then User should be redirected to Log in page and Username and Password should be saved

  @Login @LoginFunctionality @ForgotPasswordHyperLink @0
  Scenario Outline:IR-27: Verify that the system is able to navigate when clicking on ‘Forgot Password’ hyperlink
    Given I want to open login page
    When I click on ‘Forgot Password’ hyperlink
    Then User should be redirected to "<page>" page with "<url>"
    Examples:
      |page           | url                                                      |
      |Forgot Password| https://iresource.smartdev.vn/fogot-password-enter-email |

  @Login @LoginFunctionality @SignUpHereHyperlink @0
  Scenario Outline:IR-28: Verify that the system is able to navigate when clicking on 'Sign Up Here' hyperlink
    Given I want to open login page
    When I click on SignUp here hyperlink
    Then User should be redirected to "<page>" page with "<url>"
    Examples:
      |page   | url                                  |
      |Sign Up| https://iresource.smartdev.vn/signup |


