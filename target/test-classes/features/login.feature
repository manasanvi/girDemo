Feature: Application Login

Scenario: Home Page default login
Given User access Login Page
When User logins with "manasa" and password "zucazuca"
Then Home Page is displayed
And Welcome Message is displayed "true"
And close the driver


#Scenario: Home Page default login
#Given User access Login Page
#When User logins with "mmmmm" and password "zuca123zuca"
#Then Home Page is displayed
#And Welcome Message is displayed "false"
