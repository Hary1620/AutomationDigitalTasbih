# Digital Tasbih Automation

## Description

This project is an automation program for a digital tasbih (prayer beads) using Java. It simulates various functions of a digital tasbih, including counting, resetting, and controlling the LED. The program also includes features to monitor the LED status and screen with specific timing.

## Features

- **Initialization**: Sets up the count, LED status, and screen status.
- **Count Button**: Increments the count based on the number of button presses.
- **Reset Button**: Resets the count to 0.
- **LED Button**: Toggles the LED and turns it off automatically after 20 seconds.
- **Screen Timeout**: The screen turns off after 30 seconds of inactivity.
- **Simultaneous Press Detection**: Checks if multiple buttons are pressed simultaneously.
- **Long Press**: Does not change the count when the button is long-pressed.

## How to Run

1. **Clone the Repository**:

   ```sh
   git clone https://github.com/Hary1620/AutomationDigitalTasbih.git
2. **Navigate to the Project Directory**:
   ```sh
   cd AutomationDigitalTasbih
3. **Install Dependencies**:
     ```sh
     mvn clean install
4. **Run Tests:**:
    ```sh
     mvn clean verify
   
