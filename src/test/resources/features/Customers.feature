Feature: Customers

 @Regression
Scenario: Add new Customer

   Given User launch application 
   When  User enters Email as "admin@yourstore.com"  and Password as "admin" 
   And   Click on Login 
   Then  Page title should be "Dashboard / nopCommerce administration" 
   When  User click on customers menu
   And   Click on customer menu item
   And   Click on Add new button
   Then  User can view Add new customer page
   When  User enter customer info
   And   Click on save button
   Then  User can view confirmation message "The new customer has been added successfully." 
  
   
  