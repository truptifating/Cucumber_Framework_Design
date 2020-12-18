Feature: Login Action

Scenario: Facebook Login Test 
	Given Initialize the browser
	Then Enter the URl and Verify the Title of Login Page
	Then Verify the Objects on Login Page
	Then User Enters Credentials to login Page
	|Username     | Password   |
	|truptifatting@gmail.com| sweettuputony|
#	Then Click on Login Button
#   Then Take Screenshot
    Then Closing the browser
