Feature: Sign Up Test cases
  I want to Sign Up an account on IResource website

  @SignUp @SignUpFunctionality @IR29 @Dev
  Scenario: IR-29: Verify that user is able to sign up when filling all the mandatory fields
    Given I want to open sign up page
    When I want to enter all fields
    And I click Sign Up button
    Then The verify email page should show

  @SignUp @SignUpFunctionality @IR223 @Dev
  Scenario Outline: IR-223: Verify that user cannot sign up when leaving all fields blank
    Given I want to open sign up page
    When I leave all fields blank
    And I click Sign Up button
    Then The error messages should show "<Message>"
    Examples:
    |Message  |
    |Required!|

  @SignUp @SignUpFunctionality @FirstnameAndLastname @IR151 @Dev
  Scenario:IR-151: Verify that the information is added normally when entering the name fields contain blank space
    Given I want to open sign up page
    When I enter firstname and lastname contain blank space
    And I click Sign Up button
    Then That name fields's data should be added normally

  @SignUp @SignUpFunctionality @FirstnameAndLastname @IR149 @Dev
  Scenario:IR-149: Verify that the error message is shown when entering Firstname and Lastname less than 2 characters
    Given I want to open sign up page
    When I want to enter less than 2 characters into Firstname and Lastname fields
    And I click Sign Up button
    Then That name fields's data should be added normally

  @SignUp @SignUpFunctionality @FirstnameAndLastname @IR32 @Dev
  Scenario Outline:IR-32: Verify that the error message is shown when entering Firstname and Lastname contain special characters, numbers
    Given I want to open sign up page
    When I want to enter Firstname and Lastname contain special characters, numbers
    And I click Sign Up button
    Then The error message "<message>" should be shown below "<field>" field
    Examples:
    |message                |field|
    |Please enter valid name|Name |

  @SignUp @SignUpFunctionality @FirstnameAndLastname @IR269 @Dev
  Scenario Outline:IR-269: Verify that the error message is shown when entering Firstname and Lastname with space characters
    Given I want to open sign up page
    When I want to enter Firstname and Lastname with space characters
    And I click Sign Up button
    Then The error message "<message>" should be shown below "<field>" field
    Examples:
      |message                        |field|
      |Cannot contain only blankspaces|Name |

  @SignUp @SignUpFunctionality @FirstnameAndLastname @IR270 @Dev
  Scenario Outline:IR-270: Verify that the error message is shown when leaving Firstname and Lastname fields blank
    Given I want to open sign up page
    When I want to leave Firstname and Lastname fields blank
    And I click Sign Up button
    Then The error message "<message>" should be shown below "<field>" field
    Examples:
      |message                |field|
      |Required!              |Name |

  @SignUp @SignUpFunctionality @FirstnameAndLastname @IR271 @Dev
  Scenario:IR-271: Verify that user sign up successfully when entering Firstname and Lastname with 15 characters
    Given I want to open sign up page
    When I want to enter Firstname and Lastname with 15 characters
    And I click Sign Up button
    Then That name fields's data should be added normally

  @SignUp @SignUpFunctionality @FirstnameAndLastname @IR272 @Dev
  Scenario Outline:IR-272: Verify that the error message is shown when entering Firstname and Lastname with more than 15 characters
    Given I want to open sign up page
    When I want to enter Firstname and Lastname with more than 15 characters
    And I click Sign Up button
    Then The error message "<message>" should be shown below "<field>" field
    Examples:
      |message                |field|
      |Maximum 15 characters  |Name |

  @SignUp @SignUpFunctionality @Email @IR35 @Dev
  Scenario Outline:IR-35: Verify that the error message is shown when entering email contains blank space
    Given I want to open sign up page
    When I want to enter an example email
    And I click Sign Up button
    When I want to enter email contains blank space
    Then The error message "<message>" should be shown below field
    Examples:
      |message                |
      |Invalid email format   |

  @SignUp @SignUpFunctionality @Email @IR35 @Dev
  Scenario Outline:IR-34: Verify that the error message is shown when entering already registered email id
    Given I want to open sign up page
    When I want to enter an example email
    And I click Sign Up button
    When I want to enter email contains blank space
    Then The error message "<message>" should be shown below field
    Examples:
      |message                |
      |Invalid email format   |















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

