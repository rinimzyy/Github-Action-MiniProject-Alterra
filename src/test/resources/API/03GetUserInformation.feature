Feature: Get User Information

  Scenario: AP018 - Successfully get user information with user token
    Given I set user endpoint
    When I send login GET HTTP request with user bearer token
    Then I successfully get user information with status code 200

  Scenario: AP019 - Fail to get user information because method is wrong
    Given I set user endpoints
    When I send login POST HTTP request with user bearer token
    Then I failed get user information with status code 404