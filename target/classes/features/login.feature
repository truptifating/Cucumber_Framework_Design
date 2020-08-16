Feature: Login Action

Scenario: Facebook Login Test 
	Given Initialize the browser
	When Title of Login Page is facebook
	Then User Enters Credentials to login Page
	|Username     | Password   |
	|truptifatting@gmail.com| xyz|
	Then Click on Login Button
    Then Take Screenshot
    Then Closing the browser
