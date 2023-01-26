Feature: Validate post user
  Background:
    * url 'https://jsonplaceholder.typicode.com'

  Scenario: Verify the post user{uid} single User

    Given path '/posts'
    And param userId = 1
    When method GET
    Then status 200