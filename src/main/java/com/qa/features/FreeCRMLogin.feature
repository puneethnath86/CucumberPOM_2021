Feature: Free CRM Application Test using POM Concept

Scenario: Validate login to the Free CRM Application and if user is navigated to home page

Given user opens browser
Then user is on login page
Then user enters username and password
Then user click login button
Then user is navigated to homepage
Then validate homepage title
Then validate username logged in to the application