Feature: validate button count work correctly
  Scenario Outline: Testing Functional of count Button
    Given the tasbih is initialized
    When I press the count button <input> times
    Then the screen display of the count result is <input>
    Examples:
    |input|
    | 1 |
    | 2 |
    | 4 |
    | 10 |

    Scenario:Testing Count After screen Turn Off
      Given the tasbih is initialized
      When I press the count button 5 times
      And  ignore the device until the screen turns off
      And  I press the count button 1 times
      Then the screen display of the count result is 6


      Scenario: Testing Count Consistency after Reset
        Given the tasbih is initialized
        When I press the count button 5 times
        And I press the reset button
        And I press the count button 3 times
        Then the screen display of the count result is 3

       #negatif test case#

  Scenario: Testing the Count button when long pressed
    Given the tasbih is initialized
    When I long press the count button 10 second
    Then the display on the screen doesn't change

    Scenario: Testing count button when Press the Count button more than 999 times
      Given the tasbih is initialized
      When I press the count button 999 times
      Then The count stops at 999


      Scenario: Press Count Button and Reset Button at same times
        Given the tasbih is initialized
        When I press the count button and reset button at same times
        Then device doesn't respond

        Scenario: Press Count Button and LED Button at same times
          Given the tasbih is initialized
          When I press the count button and LED button at same times
          Then device doesn't respond

    
   
    