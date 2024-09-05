package org.example;

import java.util.Timer;
import java.util.TimerTask;

public class Tasbih {

        private int count;
        private boolean ledOn;
        private boolean screenOn;
        private Timer timer;
        private boolean simultaneousPressDetected;

    public Tasbih() {
        timer = new Timer();
        simultaneousPressDetected = false;
    }


        public void initialize() {
            count = 0;
            ledOn = false;
            screenOn = true;
            System.out.println("Tasbih initialized.");
            startScreenTimeout();
        }

    private void startScreenTimeout() {
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                screenOn = false;
                System.out.println("Screen has turned off due to inactivity.");
            }
        }, 30000);
    }

    private void resetScreenTimeout() {
        timer.cancel();
        timer = new Timer();
        startScreenTimeout();
        screenOn = true;
        System.out.println("Screen is on again.");
    }

    public void pressCountAndResetButtonsSimultaneously() {
        simultaneousPressDetected = true;}

    public void pressCountAndLEDButtonsSimultaneously() {
        simultaneousPressDetected = true;}

    public void pressResetAndCountButtonsSimultaneously() {
        simultaneousPressDetected = true;}

    public void pressResetAndLEDButtonsSimultaneously() {
        simultaneousPressDetected = true;}

    public void pressLEDAndCountButtonsSimultaneously() {
        simultaneousPressDetected = true;}

    public void pressLEDAndResetButtonsSimultaneously() {
        simultaneousPressDetected = true;}

    public boolean isSimultaneousPressDetected() {
        return simultaneousPressDetected;
    }




        public void pressCountButton(int times) {
            for (int i = 0; i < times; i++) {
                if (count < 999) {
                    count++;
                }
            }
            System.out.println("Count button pressed " + times + " times. Current count: " + count);
        }

    public void longPressCountButton(int durationInSeconds) {
        resetScreenTimeout();
        System.out.println("Count button long pressed for " + durationInSeconds + " seconds. No count increment.");

    }

    public void longPressResetButton(int durationInseconds){
        resetScreenTimeout();
    }


        public int getCount() {
            return count;
        }


        public void pressResetButton() {
            count = 0;  // Reset hitungan ke 0
            System.out.println("Reset button pressed. Count reset to 0.");
        }


        public void pressLEDButton() {
            ledOn = !ledOn;  // Ubah status LED
            System.out.println("LED button pressed. LED is now " + (ledOn ? "on" : "off"));
            TimerTask turnOffLedTask = new TimerTask() {
                @Override
                public void run() {
                    ledOn = false;  // Matikan LED
                    System.out.println("LED has been turned off after 20 seconds.");
                }
            };
            timer.schedule(turnOffLedTask, 20000); // Tunggu 20 detik (20000 milidetik) sebelum mematikan LED

        }


        public boolean isLEDOn() {
            return ledOn;
        }

    public void waitUntilLEDLightIsTurnedOff() {

        while (ledOn) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public boolean isScreenOn() {
        return screenOn;
    }
    }


