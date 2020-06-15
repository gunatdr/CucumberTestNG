Feature: Free CRM Login Feature
	Scenario: gmail Login Test Scenario
		Given the user is already on youtube Page
		When title of login page is "YouTube"
		Then Close the browser
		
		
	Scenario Outline: Free CRM Login Test Scenario
		Given user is already on Login Page
		When title of login page is "Cogmento CRM"
		Then the user enters "<username>" and "<password>"
		Then user clicks on login button
		Then Close the browser

		Examples:
			| username | password |
			| gunatdr@gmail.com  | gunaSK45 |
			| manitdr@gmail.com  | gunaSK45 |

		