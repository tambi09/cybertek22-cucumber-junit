Feature:
  User Story:
  As a user, I should be able to login with correct credentials to different accounts.And dashboard should be displayed.
  Accounts are: librarian, student, admin

  Scenario: Login as librarian
    Given user is on tne login page
    When  user enters librarian username
    And   used enters librarian password
    Then  user should see the dashboard
