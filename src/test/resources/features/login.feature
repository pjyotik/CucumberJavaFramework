@Login
Feature: Sign In
  As an employee of the company
  I want to login to application with my credentails
  In order to use the application features.

  Background: User navigates to ApplicationURL
	Given User Launch Chrome browser 
	When User opens URL "http://admin-demo.nopcommerce.com/login" 

 @sanity
Scenario: Successful Login with Valid Credentials 

	And User enters Email as "admin@yourstore.com" and Password as "admin" 
	And Click on Login 
	Then Page Title should be "Dashboard / nopCommerce administration" 
	When User click on Log out link 
	Then Page Title should be "Your store. Login" 
	And close browser 
	
@regression
Scenario Outline: Login Data Driven 
 
	And User enters Email as "<email>" and Password as "<password>" 
	And Click on Login 
	Then Page Title should be "Dashboard / nopCommerce administration" 
	When User click on Log out link 
	Then Page Title should be "Your store. Login" 
	And close browser 
	
	Examples: 
		| email | password |
		| admin@yourstore.com	|	admin |
		| admin@yourstore.com	|	admin |