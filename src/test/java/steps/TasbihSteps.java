package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.example.Tasbih;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TasbihSteps {

   private Tasbih tasbih = new Tasbih();
    private int initialCount;
    @Given("the tasbih is initialized")
    public void theTasbihIsInitialized() {
        tasbih.initialize();
    }

    @When("I press the count button {int} times")
    public void iPressTheCountButtonTimes(int input) {
        tasbih.pressCountButton(input);
    }

    @Then("the count should be {int}")
    public void theCountShouldBe(int expectedCount) {
        assertEquals(expectedCount, tasbih.getCount());
    }

    @When("I press the reset button")
    public void iPressTheResetButton() {
        tasbih.pressResetButton();
    }

    @Then("the count should be reset to {int}")
    public void theCountShouldBeResetTo(int expectedCount) {
        assertEquals(expectedCount, tasbih.getCount());
    }

    @When("I press the LED button")
    public void iPressTheLEDButton() {
        tasbih.pressLEDButton();
    }

    @Then("the LED should be {string}")
    public void theLEDShouldBe(String expectedStatus) {
        boolean expectedLedOn = expectedStatus.equalsIgnoreCase("on");
        assertEquals(expectedLedOn, tasbih.isLEDOn());
    }

    @Then("the screen display of the count result is {int}")
    public void theScreenDisplayOfTheCountResultIsInput(int expectedCount) {
        assertEquals(expectedCount, tasbih.getCount());

    }

    @And("ignore the device until the screen turns off")
    public void ignoreTheDeviceUntilTheScreenTurnsOff() throws InterruptedException {
            Thread.sleep(31000);
            assertEquals(false, tasbih.isScreenOn());  //
    }

    @When("I long press the count button {int} second")
    public void iLongPressTheCountButtonSecond(int seconds) {
        tasbih.longPressCountButton(seconds);
    }

    @Then("the display on the screen doesn't change")
    public void theDisplayOnTheScreenDoesnTChange() {
        int currentCount = tasbih.getCount();
        assertEquals(initialCount, currentCount);
    }

    @Then("The count stops at {int}")
    public void theCountStopsAt(int count) {
        int currentCount = tasbih.getCount();
        assertEquals(count, currentCount);
    }

    @When("I press the count button and reset button at same times")
    public void iPressTheCountButtonAndResetButtonAtSameTimes() {
        tasbih.pressCountAndResetButtonsSimultaneously();
    }

    @Then("device doesn't respond")
    public void deviceDoesnTRespond() {
        assertTrue(tasbih.isSimultaneousPressDetected());
    }

    @When("I press the count button and LED button at same times")
    public void iPressTheCountButtonAndLEDButtonAtSameTimes() {
        tasbih.pressCountAndLEDButtonsSimultaneously();
    }

    @Then("The count reset to {int}")
    public void theCountResetTo(int reset) {
        assertEquals(0, tasbih.getCount());
    }

    @When("I long press the reset button {int} second")
    public void iLongPressTheResetButtonSecond(int seconds) {
        tasbih.longPressResetButton(seconds);
    }

    @When("I press the reset button and Count button at same times")
    public void iPressTheResetButtonAndCountButtonAtSameTimes() {
        tasbih.pressResetAndCountButtonsSimultaneously();
    }

    @When("I press the reset button and LED button at same times")
    public void iPressTheResetButtonAndLEDButtonAtSameTimes() {
        tasbih.pressResetAndLEDButtonsSimultaneously();
    }

    @Then("Wait until LED ligh is turn off")
    public void waitUntilLEDLighIsTurnOff() {
        tasbih.waitUntilLEDLightIsTurnedOff();
    }

    @When("I press the LED button and Count button at same times")
    public void iPressTheLEDButtonAndCountButtonAtSameTimes() {
        tasbih.pressLEDAndCountButtonsSimultaneously();
    }

    @When("I press the LED button and Reset button at same times")
    public void iPressTheLEDButtonAndResetButtonAtSameTimes() {
        tasbih.pressLEDAndResetButtonsSimultaneously();
    }
}
