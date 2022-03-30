Feature: Login Test cases
  I want to login into IResource website

#  Initial Login

  @Login @InitialLogin
  Scenario Outline:Verify user is able to login successfully when entering valid email and password
    Given I want to open login page
    When I enter "<Email>" and "<Password>"
    And I click Login button
    Then The Profile information should show "<url>"
    Examples:
    |Email                          |Password    |url                                              |
    |hoainam.nv.1406+test17@gmail.com|Hoainam1406@|https://iresource.smartdev.vn/profile-creation  |
    |hoainam.nv.1406+test18@gmail.com|Hoainam1406@|https://iresource.smartdev.vn/general-information|

#  Subsequent Login
  @Login @SubsequentLogin
  Scenario Outline:Verify user is able to login successfully when entering valid email and password as a Project Creator
    Given I want to open login page
    When I enter "<Email>" and "<Password>"
    And I click Login button
    Then The manage project page should show "<url>"
    Examples:
      |Email                          |Password    |url                                             |
      |hoainam.nv.1406+test16@gmail.com|Hoainam1406@|https://iresource.smartdev.vn/manage-projects   |
      |hoainam.nv.1406+test15@gmail.com|Hoainam1406@|https://iresource.smartdev.vn/explore-projects  |

# Email and Pasword fields
  @Login
  Scenario Outline:Verify user is unable to login when entering valid email and invalid password
    Given I want to open login page
    When I enter "<Email>" and "<Password>"
    And I click Login button
    Then The Error message should show
    Examples:
      |Email                          |Password    |
      |hoainam.nv.1406+test16@gmail.com|Hoainam1406 |

  @Login
  Scenario Outline:Verify user is unable to login when entering invalid email and valid password
    Given I want to open login page
    When I enter "<Email>" and "<Password>"
    And I click Login button
    Then The Error message should show
    Examples:
      |Email                           |Password     |
      |hoainam.nv.1406+test61@gmail.com|Hoainam1406@ |

  @Login
  Scenario Outline:Verify user is unable to login when entering invalid email and valid password
    Given I want to open login page
    When I enter "<Email>" and "<Password>"
    And I click Login button
    Then The Error message should show
    Examples:
      |Email                           |Password    |
      |hoainam.nv.1406+test61@gmail.com|Hoainam1406 |

  @Login
  Scenario Outline:Verify that the error message will show when entering invalid email or password
    Given I want to open login page
    When I enter "<Email>" and "<Password>"
    And I click Login button
    Then The Error message should show under that fields "<Message1>" "<Message2>"
    Examples:
      |Email                          |Password    |Message1                    |Message2            |
      |hoainam@com                    |      dd  |Invalid email format        |Minimum 5 characters|

# Remember me function
  @Login @RememberMe
  Scenario Outline:Verify that the user's login data will be saved when logging-in successfully with remmember me button is checked
    Given I want to open login page
    When I enter "<Email>" and "<Password>"
    And I check the remember me checkbox
    And I click Login button
    And The explore project page should show "<url>"
    And I click Log out button
    And I want to open login page
    Then The user data: "<Email>" and "<Password>" should be saved
    Examples:
      |Email                          |Password     |url                                            |
      |hoainam.nv.1406+test15@gmail.com|Hoainam1406@ |https://iresource.smartdev.vn/explore-projects |

  @Login @RememberMe
  Scenario Outline:Verify that the user's login data will be saved when logging-in successfully but remmember me button is unchecked
    Given I want to open login page
    When I enter "<Email>" and "<Password>"
    And I click Login button
    And The explore project page should show "<url>"
    And I click Log out button
    And I want to open login page
    Then The user data: email and password should not be saved
    Examples:
      |Email                          |Password     |url                                            |
      |hoainam.nv.1406+test15@gmail.com|Hoainam1406@ |https://iresource.smartdev.vn/explore-projects |

  @Login @ShowPassword
  Scenario Outline:Verify that the password data will show when clicking the show-password icon
    Given I want to open login page
    When I enter "<Password>"
    And I click show-password icon
    Then The password data should show "<Password>"
    Examples:
      |Password     |
      |Hoainam1406@ |

  @Login @ShowPassword
  Scenario Outline:Verify that the password data will show when clicking the show-password icon
    Given I want to open login page
    When I enter "<Password>"
    And I click show-password icon
    Then The password data should show "<Password>"
    Examples:
      |Password     |
      |Hoainam1406@ |

# Forgot password
  @Login @ShowPassword
  Scenario Outline:Verify that user is able to navigate to forgot password page when tapping the "Forgot password" button
    Given I want to open login page
    When I click the Forgot password button
    Then The Forgot password page should show "<url>"
    Examples:
      |url                                                      |
      |https://iresource.smartdev.vn/fogot-password-enter-email |

  @Login @ShowPassword
  Scenario Outline:Verify that the error message will show when email address does not exist
    Given I want to open login page
    When I click the Forgot password button
    And The Forgot password page should show "<url>"
    And I enter the "<email>" address
    And I click send code button
    Then The error message should be shown "<email>"
    Examples:
      |url                                                       |email                         |
      |https://iresource.smartdev.vn/fogot-password-enter-email  |hoainam.nv.1406@gmail.com     |

  @Login @ShowPassword
  Scenario Outline:Verify that the error message will show when leaving the email field blank
    Given I want to open login page
    When I click the Forgot password button
    And The Forgot password page should show "<url>"
    And I enter the "<email>" address
    And I click send code button
    Then The error "<message>" should be shown
    Examples:
      |url                                                       |email|message  |
      |https://iresource.smartdev.vn/fogot-password-enter-email  |     |Required!|

  @Login @ShowPassword
  Scenario Outline:Verify that the error message will show when entering invalid email
    Given I want to open login page
    When I click the Forgot password button
    And The Forgot password page should show "<url>"
    And I enter the "<email>" address
    And I click send code button
    Then The error "<message>" should be shown
    Examples:
      |url                                                       |email     |message             |
      |https://iresource.smartdev.vn/fogot-password-enter-email  |namhoai   |Invalid email format|

  @Login @ShowPassword
  Scenario Outline:Verify that the error message will show when entering invalid email
    Given I want to open login page
    When I click the Forgot password button
    And The Forgot password page should show "<url>"
    And I enter the "<email>" address
    And I click send code button
    Then The error "<message>" should be shown
    Examples:
      |url                                                       |email     |message             |
      |https://iresource.smartdev.vn/fogot-password-enter-email  |namhoai   |Invalid email format|

#   Sign Up Here function
  @Login @SignUpHere
  Scenario Outline:Verify that the Sign up page will show when clicking the Sign up Here button
    Given I want to open login page
    When I click the Sign Up Here button
    And The Sign Up Here page should show "<url>"
    Examples:
      |url                                   |
      |https://iresource.smartdev.vn/signup  |

