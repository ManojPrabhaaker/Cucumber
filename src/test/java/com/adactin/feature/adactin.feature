Feature: Hotel Booking In Adactin Application
@smoketest
Scenario: User Login In The Web Application
Given user launch The Adactin Application 
When user Enter The User In Username Feild
And user Enter The Password In Password Feild 
Then user Click The Login Button And It Navigates To Search Hotel Page 
@smoketest
Scenario: User Select The Hotel In Adactin Application
When user Select The Location In Adactin Application 
And user Select The Hotel In Adactin Application
And user Select The Room Type   In Adactin Application
And user Select The Number of Rooms In Adactin Application
And user Select The Check  In Date In Adactin Application
And user Select The Check Out Date In Adactin Application
And user Select The Adults Per Room  In Adactin Application
And user Select The Childrens Per Room  In Adactin Application
Then user Click The Search Button And It Navigates To Hotel Confirmation Page
@smoketest
Scenario: User Confirm The Hotel In Adactin Application
When user Confirm The Hotel By Selecting The Select Button
Then user Click The continue Button And It Navigates To Book A Hotel Page
@sanitytest
Scenario: User Book Hotel In Adactin Application
When user Enter The First Name In The Feild 
And user Enter The Last Name In The Feild 
And user Enter The Billing Address In The Feild 
And user Enter The Credit Card Number In The Feild 
And user Select The Credit Card Type  In The Application 
And user Select The Credit Card Expire Month In The Application 
And user Select The Credit Card Expire Year In The Application 
And user Select The Credit Card Cvv Number  In The Application 
Then user Click The Book Now  Button And It Navigates To Booking Confirmation Page 
@sanitytest
Scenario: User Confirm Booking In Adactin Application
Then user Click The Log Out Button In The Adactin Application and It Navigates To Home Page
