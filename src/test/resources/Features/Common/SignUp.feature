Feature: Sign Up Test cases
  I want to Sign Up an account on IResource website

#  Using excel reader
  @SignUp @1
  Scenario: Verify user is able to sign up successfully when entering all valid fields
    Given I want to open sign up page
    When I want to enter all fields
    And I click Sign Up button
    Then The error message should be shown

#   Using Scenario Outline
  @SignUp
  Scenario Outline:Verify user is able to sign up successfully when entering all valid fields
    Given I want to open sign up page
    When I want to enter all fields "<FirstName>" "<LastName>" "<Email>" "<Password>" "<ConfirmPassword>"
    And I click Sign Up button
    Then The verify email page should show
    Examples:
      |FirstName|LastName|Email                           |Password     |ConfirmPassword|
      | Nam     | Hoai   |test9@gmsail.com                |Hoainam1406@ |Hoainam1406@   |

  @SignUp
  Scenario Outline:Verify user is able to sign up successfully when entering all valid fields
    Given I want to open sign up page
    When I want to enter all fields "<FirstName>" "<LastName>" "<Email>" "<Password>" "<ConfirmPassword>"
    And I click Sign Up button
    Then The error message should be shown
    Examples:
      |FirstName|LastName|Email                           |Password    |ConfirmPassword|
      | Nam     | Hoai   |hoainam.nv.1406+test19@gmail.com|Hoainam1406@|Hoainam1406@   |

#  Name fields
  @SignUp
  Scenario Outline:Verify user the error message will show when entering invalid Firstname and Lastname
    Given I want to open sign up page
    When I want to enter all fields "<FirstName>" "<LastName>" "<Email>" "<Password>" "<ConfirmPassword>"
    And I click Sign Up button
    Then The error messages should show "<Message>"
    Examples:
      |FirstName |LastName |Email         |Password    |ConfirmPassword|Message                |
      | Nam123   | Hoai    |hoainam@namhoai|Hoainam1406@|Hoainam1406@   |Please enter valid name|
      | Nam      | Hoai*   |hoainam@namhoai|Hoainam1406@|Hoainam1406@   |Please enter valid name|

  @SignUp
  Scenario Outline:Verify user the error message will show when leaving the Firstname and Lastname fields blank
    Given I want to open sign up page
    When I want to enter all fields "<FirstName>" "<LastName>" "<Email>" "<Password>" "<ConfirmPassword>"
    And I click Sign Up button
    Then The error messages should show "<Message>"
    Examples:
      |FirstName |LastName |Email          |Password    |ConfirmPassword|Message   |
      |  Nam     |         |hoainam@namhoai|Hoainam1406@|Hoainam1406@   |Required! |
      |          |Hoai     |hoainam@namhoai|Hoainam1406@|Hoainam1406@   |Required! |

#   Email field
  @SignUp
  Scenario Outline:Verify user the error message will show when leaving the Email field blank
    Given I want to open sign up page
    When I want to enter all fields "<FirstName>" "<LastName>" "<Email>" "<Password>" "<ConfirmPassword>"
    And I click Sign Up button
    Then The error messages should show "<Message>"
    Examples:
      |FirstName |LastName |Email          |Password    |ConfirmPassword|Message   |
      |    ABC   |   DEF   |               |Hoainam1406@|Hoainam1406@   |Required! |

  @SignUp
  Scenario Outline:Verify user the error message will show when entering invalid email
    Given I want to open sign up page
    When I want to enter all fields "<FirstName>" "<LastName>" "<Email>" "<Password>" "<ConfirmPassword>"
    And I click Sign Up button
    Then The error messages should show "<Message>"
    Examples:
      |FirstName |LastName |Email          |Password    |ConfirmPassword|Message             |
      |    ABC   |   DEF   |hoainam@namhoai|Hoainam1406@|Hoainam1406@   |Invalid email format|

#   Password field
  @SignUp
  Scenario Outline:Verify user the error message will show when leaving the password field blank
    Given I want to open sign up page
    When I want to enter all fields "<FirstName>" "<LastName>" "<Email>" "<Password>" "<ConfirmPassword>"
    And I click Sign Up button
    Then The error messages should show "<Message>"
    Examples:
      |FirstName |LastName |Email            |Password    |ConfirmPassword|Message             |
      |    ABC   |   DEF   |hoainam@gmail.com|            |Hoainam1406@   |Required!           |

  @SignUp
  Scenario Outline:Verify user the error message will show when entering invalid Password
    Given I want to open sign up page
    When I want to enter all fields "<FirstName>" "<LastName>" "<Email>" "<Password>" "<ConfirmPassword>"
    And I click Sign Up button
    Then The error messages should show "<Message>"
    Examples:
      |FirstName |LastName |Email            |Password  |ConfirmPassword        |Message                                                          |
      |    ABC   |   DEF   |hoainam@gmail.com|Hoai1     |Hoainam1406@           |At least one uppercase, one number and one special case character|
      |    ABC   |   DEF   |hoainam@gmail.com|Hoainam   |Hoainam1406@           |At least one uppercase, one number and one special case character|
      |    ABC   |   DEF   |hoainam@gmail.com|Hoainam@  |Hoainam1406@           |At least one uppercase, one number and one special case character|
      |    ABC   |   DEF   |hoainam@gmail.com|Hoainam@  |hoainam1406@           |At least one uppercase, one number and one special case character|

  @SignUp
  Scenario Outline:Verify user the error message will show when entering password contains blank space
    Given I want to open sign up page
    When I want to enter all fields "<FirstName>" "<LastName>" "<Email>" "<Password>" "<ConfirmPassword>"
    And I click Sign Up button
    Then The error messages should show "<Message>"
    Examples:
      |FirstName |LastName |Email            |Password    |ConfirmPassword      |Message                                  |
      |    ABC   |   DEF   |hoainam@gmail.com|Hoa 1406@   |Hoainam1406@         |This field cannot contain blankspaces    |

#   Confirm password field
  @SignUp
  Scenario Outline:Verify user the error message will show when leaving the Confirmpassword field blank
    Given I want to open sign up page
    When I want to enter all fields "<FirstName>" "<LastName>" "<Email>" "<Password>" "<ConfirmPassword>"
    And I click Sign Up button
    Then The error messages should show "<Message>"
    Examples:
      |FirstName |LastName |Email            |Password    |ConfirmPassword      |Message       |
      |    ABC   |   DEF   |hoainam@gmail.com|Hoainam1406@|                     |Required!     |

  @SignUp
  Scenario Outline:Verify user the error message will show when entering Confirmpassword not match with password
    Given I want to open sign up page
    When I want to enter all fields "<FirstName>" "<LastName>" "<Email>" "<Password>" "<ConfirmPassword>"
    And I click Sign Up button
    Then The error messages should show "<Message>"
    Examples:
      |FirstName |LastName |Email            |Password    |ConfirmPassword      |Message                |
      |    ABC   |   DEF   |hoainam@gmail.com|Hoainam1406@|Hoainam1406          |Password doesn’t match |

