@reset
Feature: Validate reset button work correctly
  Scenario Outline: Testing functional of reset button
    Given the tasbih is initialized
    When I press the count button <input> times
    And I press the reset button
    Then The count reset to 0

    Examples:
    |input|
    | 1 |
    |500 |
    |131 |

    Scenario: Testing Reset at Maximum Count
      Given the tasbih is initialized
      When I press the count button 999 times
      And I press the reset button
      Then The count reset to 0
      
      Scenario: Testing Reset at Minimum Count
        Given the tasbih is initialized
        When I press the count button 1 times
        And I press the reset button
        Then The count reset to 0

#Negatif Testcase##
        Scenario: Testing reset when count is 0
          Given the tasbih is initialized
          When I press the reset button
          Then The count reset to 0


          Scenario: Testing Long Press the reset button
            Given the tasbih is initialized
            When I long press the reset button 10 second
            Then The count reset to 0

            Scenario: Press Reset Button and Count Button at same times
              Given the tasbih is initialized
              When I press the reset button and Count button at same times
              Then device doesn't respond

              Scenario: Press Reset Button and LED Button at same times
                Given the tasbih is initialized
                When I press the reset button and LED button at same times
                Then device doesn't respond