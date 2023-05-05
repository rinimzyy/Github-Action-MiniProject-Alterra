Feature: Login

  Scenario: AP009 - Successfully login by entering valid email and password
    Given I set login endpoint
    When I send login POST HTTP request and fill body parameter
    Then I successfully login with status code 200

  Scenario: AP010 - Fail to login because email and password field is empty
    Given I set valid login endpoint
    When I send login POST HTTP request with empty email and password
    Then I fail login with status code 400

  Scenario: AP011 - Fail to login because email field is empty
    Given I set valid login endpoint url
    When I send login POST HTTP request with empty email
    Then I failed login with status code 400

  Scenario: AP012 - Fail to login because password field is empty
    Given I set login endpoint url
    When I send login POST HTTP request with empty password
    Then I fail to login with status code 400

  Scenario: AP013 - Fail to login because email invalid
    Given I set login endpoints
    When I send login POST HTTP request with invalid email
    Then I failed to login with status code 400

  Scenario: AP014 - Fail to login because filling email field with username
    Given I set login endpoints url
    When I send login POST HTTP request fill email with username
    Then I cant login and get status code 400

  Scenario: AP015 - Failed to login because body parameter is invalid
    Given I set valid login endpoints url
    When I send login POST HTTP request with invalid parameter
    Then I can not login and get status code 400

  Scenario: AP016 - Failed to login because body is empty
    Given I set valid endpoints url
    When I send login POST HTTP request with empty body
    Then I can not login and get response code 400

  Scenario: AP017 - Failed to login because method is wrong
    Given I set valid endpoint url
    When I send login POST HTTP request with wrong method
    Then I can not login and get response code 405