Feature: Login Page

@Single
Scenario: Successful Login with Valid Credentials

   #Pre_Requisite condition open browsers code put in hooks class
   #precondition launch application
   Given User launch application 
   #action
   When  User enters Email as "admin@yourstore.com"  and Password as "admin" 
   #action
   And   Click on Login 
   #verifiction
   Then  Page title should be "Dashboard / nopCommerce administration" 
   #action
   When  User click on Log out link
   #verifiction 
   Then  Page title should be "Your store. Login" 
   #Pre_Requisite condition close/quite browsers code put in hooks class
   
   @Multiple 
   Scenario Outline: Login Data Driven

   #precondition
   Given  User launch application 
   When   User enters Email as "<email>"  and Password as "<password>"
   And    Click on Login
   Then   Page title should be "<Title>"
   When   User click on Log out link
  
  
   
   Examples:
       |email               |password|Title                                 |
       |admin@yourstore.com |admin   |Dashboard / nopCommerce administration|
       |admin1@yourstore.com|admin   |Dashboard / nopCommerce administration|
   