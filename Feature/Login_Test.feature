Feature: Login Action

  #Scenario Outline: Successful Login with valid crendentials
    
    #Given User is on Login page
    #When User Enters "charanpurushotham9@gmail.com" and "charan@4359"
    #Then Message Displays Login Successfully

  

  Scenario Outline: Successful Login with valid crendentials
    
    Given User is on Login page
    When User Enters "<UserName>" and "<Password>"
    Then Message Displays Login Successfully

Examples:
| UserName | Password |
| charanpurushotham9@gmail.com | charan@4359 |
| charanpurushotham9@gmail.com | charan@4359 | 