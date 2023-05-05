Feature: Product Categories

  Scenario: AP046 - Successfully create new category with valid endpoint and valid body parameter and parameter value
    Given I POST create product categories endpoints
    When I POST HTTP request with valid data
    And I receive response data for product categories
    Then I receive valid HTTP response 200

  Scenario: AP047 - Failed create new category because endpoint is invalid
    Given I POST create product categories endpoint
    When I POST HTTP request with invalid endpoint and valid data
    Then I receive response code 404

  Scenario: AP048 - Failed create new category because body is empty
    Given I POST create product categories endpoint url
    When I POST HTTP request with empty body
    Then I receive response code 500

  Scenario: AP049 - Failed create new category because parameter is invalid
    Given I POST create product categories endpoints url
    When I POST HTTP request with invalid parameter body
    Then I receive status code 500

  Scenario: AP050 - Successfully get all category with valid endpoint
    Given I GET all product categories endpoint
    When I GET HTTP request with valid endpoint
    And I receive response data for all product categories
    Then I receive valid HTTP response 200 for get all product categories

  Scenario: AP051 - Failed get all category with invalid endpoint
    Given I GET all product categories endpoints
    When I GET HTTP request with invalid endpoint
    Then I receive HTTP response 404 for get all product categories

  Scenario: AP052 - Failed all category because method is invalid
    Given I GET all product categories endpoint url
    When I GET HTTP request with invalid method
    Then I receive HTTP response 405 for get all product categories

  Scenario: AP053 - Successfully get category by ID with valid endpoint
    Given I GET product category endpoints by ID
    When I GET HTTP request with valid ID
    And I receive response data for product category by ID
    Then I receive valid HTTP response 200 for get by ID

  Scenario: AP054 - Failed get category by id because id is invalid
    Given I GET product category endpoint by ID
    When I GET HTTP request with invalid ID
    Then I receive valid HTTP response 400 for get by ID

  Scenario: AP055 - Failed get category by id because method invalid
    Given I GET product category endpoints url by ID
    When I GET Product by ID HTTP request with invalid method
    Then I receive valid HTTP response 405 for get by ID

  Scenario: AP56 - Successfully delete product with valid endpoint
    Given I DELETE a product category endpoints
    When I DELETE HTTP request with valid ID
    And I receive response data for delete a product category
    Then I receive valid HTTP response 200 for delete a product category

  Scenario: AP57 - Failed delete product because endpoint is invalid
    Given I DELETE a product category endpoint
    When I DELETE HTTP request with invalid endpoints
    Then I receive valid HTTP response 404 for delete a product category
