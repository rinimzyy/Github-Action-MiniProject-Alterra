Feature: Product

  Scenario: AP020 - Successfully get product with valid endpoint
    Given I set product endpoint
    When I send GET HTTP request
    Then I successfully get all product data with status code 200

  Scenario: AP021 - Failed get all product with invalid endpoint
    Given I set product endpoints
    When I send GET HTTP request with invalid endpoint
    Then I fail get all product data with status code 404

  Scenario: AP022 - Failed all product because method is invalid
    Given I set product endpoints url
    When I send GET HTTP request with wrong method
    Then I fail get all product data with status code 405

  Scenario: AP023 - Successfully get product by ID with valid endpoint
    Given I set product id endpoint
    When I send GET HTTP request with valid endpoint
    Then I success get product data by id with status code 200

  Scenario: AP024 - Failed get product by id because id is invalid
    Given I set product id endpoints
    When I send GET HTTP request with invalid id
    Then I failed get product data by id with status code 404

  Scenario: AP025 - Failed get product by id because endpoint is invalid
    Given I set product id endpoints url
    When I send GET HTTP request with invalid endpoints url
    Then I failed to get product data by id with status code 404

  Scenario: AP026 - Successfully get product rating with valid endpoint
    Given I set product rating endpoints url
    When I send GET HTTP request with valid rating endpoint
    Then I success to get product rating by id with status code 200

  Scenario: AP027 - Failed get product because endpoint is invalid
    Given I set product rating endpoint url
    When I send GET HTTP request with invalid rating endpoint
    Then I failed to get product rating by id with status code 404

  Scenario: AP028 - Successfully get product comment with valid endpoint
    Given I set product comment endpoint url
    When I send GET HTTP request with valid comment endpoint
    Then I success to get product comment by id with status code 200

  Scenario: AP029 - Failed get product comment because endpoint is invalid
    Given I set product comment endpoint
    When I send GET HTTP request with invalid comment endpoint
    Then I failed to get product comment by id with status code 404

  Scenario: AP030 - Successfully create new product with valid endpoint and body is filled with valid parameter
    Given I POST add new products endpoints
    When I POST HTTP request for add new products
    Then I receive valid HTTP response 200 for add new products

  Scenario: AP031 - Failed create a new product because parameter value is empty
    Given I POST add new products endpoint
    When I POST HTTP request for add new product
    Then I receive HTTP response 500 for add new products

  Scenario: AP032 - Failed create a new product because parameter is invalid
    Given I POST add new products endpoint url
    When I POST HTTP request for add new product with invalid parameter
    Then I receive response 500 for add new products

  Scenario: AP033 - Failed create a new product because parameter "name" is not setted
    Given I POST add new products endpoints url
    When I POST HTTP request for add new product with name field is not setted
    Then I receive response 500 for add new product

  Scenario: AP036 - Failed create a new product because parameter is filled with space
    Given I POST new products endpoints url
    When I POST HTTP request for add new product and parameter is filled with space
    Then I receive response code 400 for add new product

  Scenario: AP038 - Successfully assign product rating
    Given I POST give products rating endpoints
    When I POST HTTP request for give products ratings
    Then I receive valid HTTP response 200 for give products ratings

  Scenario: AP039 - Failed assign product rating because id is invalid
    Given I POST give products rating endpoint
    When I POST HTTP request for give products ratings with invalid id
    Then I receive valid HTTP response 500 for give products ratings

  Scenario: AP040 - Successfully create a comment with valid endpoint and body is filled with valid data
    Given I set add product comment endpoint
    When I send POST HTTP request with comment in body
    Then I success create a comment in product with status code 200

  Scenario: AP041 - Failed create a comment because endpoint is invalid
    Given I set add product comment wrong endpoint
    When I send POST HTTP request with invalid endpoint
    Then I failed create a comment in product with status code 404

  Scenario: AP042 - Failed create a comment because body is empy
    Given I set add product comment wrong endpoints
    When I send POST HTTP request with empty body content
    Then I failed create a comment in product with status code 500

  Scenario: AP043 - Failed create a comment because parameter body is invalid
    Given I set add product comment wrong endpoints url
    When I send POST HTTP request with invalid parameter comment
    Then I failed create a comment in product with response code 500

  Scenario: AP044 - Failed create a comment because method is wrong
    Given I set add product comments wrong endpoints url
    When I send PUT HTTP request with invalid parameter comment
    Then I failed create a comment in product with response code 405

  Scenario: AP045 - Successfully delete product with valid endpoint
    Given I set delete product endpoints url
    When I send DELETE HTTP request with valid endpoint
    Then I success delete product with response code 200

  Scenario: AP046 - Failed delete product because endpoint is invalid
    Given I set delete product endpoint url
    When I send DELETE HTTP request with invalid endpoint
    Then I fail delete product with response code 404















