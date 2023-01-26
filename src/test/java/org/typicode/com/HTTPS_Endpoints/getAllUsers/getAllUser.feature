Feature: Validate post user
  Background:
    * url 'https://jsonplaceholder.typicode.com'

  Scenario: Verify the post user
    Given path '/posts'
    When method GET
    Then status 200
    And assert response.length == 100
    And assert responseTime < 12600
    * print response
    * print responseTime
    * print responseCookies
    * print responseType
    And match responseHeaders['Content-Type'][0] == 'application/json; charset=utf-8'

