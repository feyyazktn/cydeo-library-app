Feature: Login with parameters

  @librarianParam
  Scenario: Login as librarian 49
    Given I am on the login page
    When I enter username "librarian49@library"
    And I enter password 'libraryUser'
    And click the sign in button
    And there should be 1852 users
    Then dashboard should be displayed

#1852 users but failed because firstly 0 then 1852
@studentParam
  Scenario: Login as student 30
    Given I am on the login page
    When I enter username "student30@library"
    And I enter password 'libraryUser'
    And click the sign in button
    Then books should be displayed
@wip
  Scenario: Login as librarian same line
    Given I am on the login page
    When I login using "librarian1@library" and "libraryUser"
    Then dashboard should be displayed
#number can be whatever you have there