Feature: Login Test cases
  I want to login into IResource website

  @Login @LoginFunctionality @General @IR20A @Dev
  Scenario Outline:IR-20A: Verify that user is able to login successfully when entering valid email and password
    Given I want to open login page
    And  I want to enter valid email and password (initial login)
    And I click Login button
    Then The user will be redirected to corresponding page "<page>" with url "<url>"
    Examples:
      |page            |url                                           |
      |Profile Creation|https://iresource.smartdev.vn/profile-creation|

  @Login @LoginFunctionality @General @IR20B @Dev
  Scenario Outline:IR-20B: Verify that user is able to login successfully when entering valid email and password
    Given I want to open login page
    And  I want to enter valid email and password (subsequent login)
    And I click Login button
    Then The user will be redirected to corresponding page "<page>" with url "<url>"
    Examples:
      |page           |url                                           |
      |Explore Project|https://iresource.smartdev.vn/explore-projects|

  @Login @LoginFunctionality @General @IR222 @Dev
  Scenario Outline:IR-222:Verify that user cannot log in with Email and Password field are empty
    Given I want to open login page
    And I click Login button
    Then The error message "<Message>" should be shown below each field
    Examples:
      |Message  |
      |Required!|

  @Login @LoginFunctionality @General @IR142 @Dev
  Scenario Outline:IR-142: Verify that the backspace or delete keys is working normally when removing the information
    Given I want to open login page
    When I want to enter data "<data>" into fields
    And I want to remove data by using backspace or delete keys
    Then The data should be removed "<new data>"
    Examples:
      |data        |new data   |
      |Thisisdata  |Thisisdat  |

  @Login @LoginFunctionality @General @IR21 @IR69 @Dev @PM
  Scenario Outline:IR-21, IR-69: Verify that user is unable to login when entering an invalid email and a valid password
    Given I want to open login page
    When I want to enter invalid data into fields
    And I click Login button
    Then The error message should show and user is stay in login page "<url>"
    Examples:
      |url|
      |https://iresource.smartdev.vn/login|

  @Login @LoginFunctionality @EmailField @IR139 @IR145 @Dev @PM
  Scenario Outline:IR-139, IR-145: Verify that user cannot log in with Email and Password field are empty
    Given I want to open login page
    And  I enter Email field without domain
    And I click Login button
    Then The error message below "<Field>" field should be shown "<Message>"
    Examples:
      |Field   |Message                      |
      |Email   |Invalid email format         |

  @Login @LoginFunctionality @EmailField @IR138 @IR144 @Dev @PM
  Scenario Outline:IR-138, IR-144: Verify that the error message is shown when entering the email contains two @ sign
    Given I want to open login page
    And  I want to enter email contains two @ sign and valid Password
    And I click Login button
    Then The error message should show and user is stay in login page "<url>"
    Examples:
      |url                                |
      |https://iresource.smartdev.vn/login|

  @Login @LoginFunctionality @EmailField @IR137 @IR-143 @Dev @PM
  Scenario Outline:IR-137, IR-143: Verify that user cannot login successfully when entering the email without @
    Given I want to open login page
    And  I want to enter email without @
    And I click Login button
    Then The error message should show and user is stay in login page "<url>"
    Examples:
      |url|
      |https://iresource.smartdev.vn/login|

  @Login @LoginFunctionality @EmailField @IR132 @IR134 @Dev @PM
  Scenario Outline:IR-132, IR-134: Verify that user is unable to login when leaving the email field blank
    Given I want to open login page
    And  I leave the email field blank and enter valid password
    And I click Login button
    Then The error message should show and user is stay in login page "<url>"
    Examples:
      |url|
      |https://iresource.smartdev.vn/login|

  @Login @LoginFunctionality @EmailField  @IR259 @IR146 @Dev @PM
  Scenario Outline:IR-259, IR-146: Verify that the error message displayed when entering an email containing multiple consecutive dots
    Given I want to open login page
    And  I want to enter the email contains multiple consecutive dots
    And I click Login button
    Then The error message below "<Field>" field should be shown "<Message>"
    Examples:
      |Field   |Message                      |
      |Email   |Invalid email format         |

  @Login @LoginFunctionality @EmailField @IR260 @Dev
  Scenario Outline:IR-260: Verify that user is able to login when entering unregistered email
    Given I want to open login page
    And  I want to enter an unregistered email
    And I click Login button
    Then The error message "<Message>" should be shown
    Examples:
      |Message                      |
      |Email or password is invalid.|

  @Login @LoginFunctionality @PasswordField @IR141 @IR147 @Dev @PM
  Scenario Outline:IR-141, IR-147: Verify that user cannot login successfully when entering the password less than 5 characters
    Given I want to open login page
    When I enter valid Email and Password less than 4 characters
    And I click Login button
    Then The error message below "<Field>" field should be shown "<Message>"
    Examples:
      |Field   |Message             |
      |Password|Minimum 5 characters|

  @Login @LoginFunctionality @PasswordField @IR22 @IR68 @Dev @PM
  Scenario Outline:IR-22, IR-68: Verify that user is unable to login when entering a valid email and an invalid password
    Given I want to open login page
    When I enter valid Email and invalid Password
    And I click Login button
    Then The error message "<Message>" should be shown
    Examples:
      |Message                      |
      |Email or password is invalid.|

  @Login @LoginFunctionality @PasswordField @IR133 @IR135 @Dev @PM
  Scenario Outline:IR-133, IR-135: Verify that user is unable to login when leaving the password field blank
    Given I want to open login page
    When I enter valid Email
    And I click Login button
    Then The error message below "<Field>" field should be shown "<Message>"
    Examples:
      |Field   |Message    |
      |Password|Required!  |

  @Login @LoginFunctionality @PasswordField @IR23 @Dev
  Scenario:IR-23: Verify that user is unable to login when leaving the password field blank
    Given I want to open login page
    When I only enter Password field
    Then The data in password field should be visible as asterisk orr bullet signs

  @Login @LoginFunctionality @PasswordField @IR24 @Dev
  Scenario:IR-24: Verify that the data in the password field is shown when clicking 'eye icon'
    Given I want to open login page
    When I only enter Password field
    And I click 'Eye' icon
    Then The data of the password field should be shown

  @Login @LoginFunctionality @EnterKey @IR25 @Dev
  Scenario Outline:IR-25: Verify that the ‘Enter’ key of the keyboard is working correctly
    Given I want to open login page
    When  I want to enter valid email and password (initial login)
    And I use the enter key
    Then The user will be redirected to corresponding page "<page>" with url "<url>"
    Examples:
      |page            |url                                           |
      |Project Creation|https://iresource.smartdev.vn/profile-creation|

  @Login @LoginFunctionality @RememberMeCheckbox @IR26 @IR73 @Dev @PM
  Scenario:IR-26, IR-73: Verify that the login data is saved when clicking ‘Remember Me’ button
    Given I want to open login page
    When I enter valid Email and Password
    And I click on 'Remember Me' checkbox
    And I click Login button
    And I click 'Log out' button
    Then User should be redirected to Log in page and Username and Password should be saved

  @Login @LoginFunctionality @ForgotPasswordHyperLink @IR27 @IR-74 @Dev @PM
  Scenario Outline:IR-27, IR-74: Verify that the system is able to navigate when clicking on ‘Forgot Password’ hyperlink
    Given I want to open login page
    When I click on ‘Forgot Password’ hyperlink
    Then User should be redirected to "<page>" page with "<url>"
    Examples:
      |page           | url                                                      |
      |Forgot Password| https://iresource.smartdev.vn/fogot-password-enter-email |

  @Login @LoginFunctionality @SignUpHereHyperlink @IR28 @IR75 @Dev @PM
  Scenario Outline:IR-28, IR-75: Verify that the system is able to navigate when clicking on 'Sign Up Here' hyperlink
    Given I want to open login page
    When I click on SignUp here hyperlink
    Then User should be redirected to "<page>" page with "<url>"
    Examples:
      |page   | url                                  |
      |Sign Up| https://iresource.smartdev.vn/signup |

  @Login @LoginFunctionality @General @IR67 @PM
  Scenario Outline:IR-67: Verify that user is able to login successfully when entering valid email and password
    Given I want to open login page
    And  I want to enter valid email and password (PM role initial login)
    And I click Login button
    Then The user will be redirected to corresponding page "<page>" with url "<url>"
    Examples:
      |page            |url                                              |
      |Profile Creation|https://iresource.smartdev.vn/general-information|

  @Login @LoginFunctionality @General @IR261 @PM
  Scenario Outline:IR-261: Verify that the Manage project page is shown when user logins for the second time
    Given I want to open login page
    And  I want to enter valid email and password (PM role subsequent login)
    And I click Login button
    Then The user will be redirected to corresponding page "<page>" with url "<url>"
    Examples:
      |page            |url                                              |
      |Manage Projects |https://iresource.smartdev.vn/manage-projects    |
