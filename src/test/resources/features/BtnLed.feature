Feature: Validate button LED work correctly
  Scenario: Testing functional of LED button
    Given the tasbih is initialized
    When I press the LED button
    Then the LED should be "on"


    Scenario: Testing the waiting time of LED lights
      Given the tasbih is initialized
      When I press the LED button
      Then Wait until LED ligh is turn off

      Scenario: Testing LED at Count 0
        Given the tasbih is initialized
        When I press the count button 0 times
        And I press the LED button
        Then the LED should be "on"

        Scenario: Testing LED at minimum count
          Given the tasbih is initialized
          When I press the count button 1 times
          And I press the LED button
          Then the LED should be "on"

          Scenario: Testing LED at Maximum count
            Given the tasbih is initialized
            When I press the count button 999 times
            And I press the LED button
            Then the LED should be "on"

            Scenario: Testing LED Stays On after Count
              Given the tasbih is initialized
              When I press the LED button
              And I press the count button 10 times
              Then the LED should be "on"

              ##Negatif TestCase ##

  Scenario: Testing Reset When LED is On
    Given the tasbih is initialized
    When I press the count button 5 times
    And I press the LED button
    And I press the reset button
    And the LED should be "on"
    Then the count should be reset to 0

    Scenario: Press LED button and Count button at same times
      Given the tasbih is initialized
      When I press the LED button and Count button at same times
      Then device doesn't respond

      Scenario: Press LED button and Reset button at same times
        Given the tasbih is initialized
        When I press the LED button and Reset button at same times
        Then device doesn't respond