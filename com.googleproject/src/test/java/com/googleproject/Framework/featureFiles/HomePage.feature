Feature: Home Page is displayed
	Google Home Page is displayed to the user checks Search box is displayed
		
Scenario: Navigate to Google Home Page and check Search box is displayed
	Given User navigates to Google website
	And Search box is displayed
	
Scenario: Navigate to Google Home Page and check Search box is displayed
	Given User navigates to Google website
	And Checks if is in Home Page
	And Feel lucky button is displayed
	
Scenario: Navigate to Google Home Page and clicks on Gmail link
	Given User navigates to Google website
	And Checks if is in Home Page
	And Click on Gmail link
	And Gmail page is displayed
