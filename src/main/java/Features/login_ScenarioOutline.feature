Feature: Free CRM Login Feature

	Scenario Outline: Free CRM Login Test Scenario
		Given user is already on Login Page
		When title of login page is "Cogmento CRM"
		Then the user enters "<username>" and "<password>"
#		Then user clicks on login button
		Then Close the browser

		Examples:
			| username | password |
			| gunatdr@gmail.com  | gunaSK45 |
			| manitdr@gmail.com  | gunaSK45 |
			| kannutdr@gmail.com  | gunaSK45 |

		