Feature: Tasbih Digital

  Scenario: Menguji tombol Count
    Given the tasbih is initialized
    When I press the count button 5 times
    Then the count should be 5