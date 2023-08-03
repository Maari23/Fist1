Feature: Login

Scenario: Login Test with Valid cred 

    Given user iniate browser 
    When user on page "https://admin-demo.nopcommerce.com/admin/"
    And   user enter "admin@yourstore.com"  and  "admin"
    And clcik login
    Then titel page  is
    When user click logout
    Then title sould be 
    And close browser
    
 Scenario Outline: Login Test data driven

    Given user iniate browser 
    When user on page "https://admin-demo.nopcommerce.com/admin/"
    And   user enter "<Email>"  and  "<Pass>"
    And clcik login
    Then titel page  is
    When user click logout
    Then title sould be 
    And close browser 
    
    Examples:
    |   Email           |  Pass   |
    | admin@yourstore.com | admin |
    | admin@yourstore.com | admin@gmaila.com  |
   

