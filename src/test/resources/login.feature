Feature: User login
  Scenario Outline: User can login with valid credential
    Given User visited the portal
    When User inputs valid "<username>" and "<password>"
    Then User can see dashboard

    Examples:
      | username | password |
      | Admin    | admin123 |
