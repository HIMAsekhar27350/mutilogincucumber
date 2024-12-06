Feature: login with different username and password

  Scenario Outline:enter the different usernames
    Given lanching the chrome browser and land on swag Lags
    When enter the <username> and <password>
    And click on the login button
    Then close the browser

  Examples:
    | username                | password     |
    | standard_user           | secret_sauce |
    | locked_out_user         | secret_sauce |
    | problem_user            | secret_sauce |
    | performance_glitch_user | secret_sauce |
    | error_user              | secret_sauce |
    | visual_user             | secret_sauce |

