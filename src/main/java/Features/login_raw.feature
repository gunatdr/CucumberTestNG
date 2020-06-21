Feature: Free CRM Login Feature

	Scenario: Free CRM Login Test Scenario
		Given user is already on Login Page
		When title of login page is "Cogmento CRM"
#		Then user enters "<username>" and "<password>"
		Then user enters username and password
			| gunatdr@gmail.com  | gunaSK45 |
			| manitdr@gmail.com  | gunaSK45 |
			| kannutdr@gmail.com  | gunaSK45 |
		Then user clicks on login button
		Then Close the browser
#
#		Examples:
#			| username | password |


		