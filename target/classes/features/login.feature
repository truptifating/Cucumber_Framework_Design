Feature: Login Action

Scenario: Facebook Login Test 
	Given Initialize the browser
	When Title of Login Page is facebook
#	When user enters Credentials
	Then User Enters Credentials to login Page
	|Username     | Passward   |
	|truptifatting@gmail.com| xyz|
	Then Click on Login Button

