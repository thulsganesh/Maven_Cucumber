Feature: Checking the Booking Functionality Of and Adactin Application
Scenario: Login Functionality
Given user Must Launch The Url
When user Enter The Username In The Username Field
And user Enter The Password In The Password Field
Then user Click The Login Button And It Navigates To The Search Hotel Page

Scenario: Search Hotel Functionality
When user Select The Location In The Location Field
And user Select The Hotels In The Hotels Field 
And user Select The Room Type In The Room Type Field
And user Select The Number of Rooms In The Number of Rooms Field
And user Select The Adults Per Room In The Adults Per Room Field
And user Select The Children Per Room In The Children Per Room Field
Then user Click The Search Button And It Navigates To The Select Hotel Page

Scenario: Select Hotel Functionality
When user Click The Select Button
Then user Click The Continue Button And It Navigates To The Book A Hotel Page

Scenario: Book A Hotel Functionality
When user Type The First Name In The First Name Field
And user Type The Last Name In The Last Name Field
And user Type Billing Address In The Billing Address Field
And user Type Credit Card No In The Credit Card No Field
And user Select Credit Card Type In The Credit Card Type Field
And user Select Month In The Month Field
And user Select Year In The Year Field
And user Type CVV Number In The CVV Number Field
Then user Click The Book Now Button And It Navigates To The Booking Confirmation

Scenario: Booking Confirmation Functionality
When user Take ScreenShot To Save The ScreenShot Page In The ScreenShot Folder
Then user Click The Logout Button And It Navigates To The Successfully Logged Out Page