Feature: Hotel Booking In Adactin Application
@First
Scenario: Login Functionality
Given user Launches The Application
When user Enters Valid Username 
And user Enters Valid  Password 
Then user Clicks on Login Button And It Navigates To Homepage


@Second
Scenario: Search Hotels Availability
When user Select Location of Hotel
And user Select The Hotel Name
And user Select Type Of Room
And user Select No Of Room
And user Select The Check In Date
And user Select The Check Out Date
And user Select Adults Per Room Details
And user Select Children Per Room Details
Then user Clicks On Search Button And It Navigates Search Hotel Page

@Third
Scenario: Select The Hotel
When user Select The Hotel Via Radio Button 
Then user Click The Continue Button And Navigate To Book A Hotel Page

@Fourth
Scenario: Book A Hotel
When user Enter The First Name In First Name Field
And user Enter The Last Name In Last Name Field
And user Enter THe Billing Address in Billing Address Field
And user Enter The 16 Digit Credit Card Number In Credit Card Field
And user Select Credit Card Type In Credit Card Type Field
And user Select Expiry Month And Year In Expiry Date Field
And user Enter CVV Number In CVV Field
Then Click The Book Now Button And It Navigates TO Booking Confirmation Page
