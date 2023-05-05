Feature: Register

#  Scenario: AP001 - Successfully register by entering parameter name, valid email, and password
#    Given I set register endpoint
#    When I send POST HTTP request and fill body parameter
#    Then I successfully register with status code 200

  Scenario: AP002 - Failed to register because body is empty
    Given I set register endpoint url
    When I send POST HTTP request with empty body
    Then I failed register with status code 400

  Scenario: AP003 - Failed to register because email was already registered
    Given I set url register endpoint
    When I send POST HTTP request with registered email
    Then I fail register with status code 400

  Scenario: AP006 - Failed to register because body parameter is invalid
    Given I set url register endpoints
    When I send POST HTTP request with invalid parameter
    Then I fail to register with status code 400

  Scenario: AP007 - Failed to register because body parameter is empty
    Given I set the url register endpoints
    When I send POST HTTP request with null parameter value
    Then I failed to register with status code 400

  Scenario: AP008 - Failed to register because method is wrong
    Given I set valid url register endpoints
    When I send PUT HTTP request with valid body
    Then I failed to register with status code 405