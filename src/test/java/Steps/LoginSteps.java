package Steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
    @And("click on login button")
    public void clickOnLoginButton() {
        System.out.println("clickOnLoginButton");
    }

    @When("user enters user name and password")
    public void userEntersUserNameAndPassword() {
        System.out.println("userEntersUserNameAndPassword");
    }

    @Given("user is on login page")
    public void userIsOnLoginPage() {
        System.out.println("userIsOnLoginPage");
    }

    @Then("User is navigated to the home page")
    public void userIsNavigatedToTheHomePage() {
        System.out.println("userIsNavigatedToTheHomePage");
    }

    @Given("link video has Ads")
    public void linkVideoHasAds() {
    }

    @And("luckily it has skipped button with contain secs of time")
    public void luckilyItHasSkippedButtonWithContainSecsOfTime() {
    }

    @When("i need to watch a desire video")
    public void iNeedToWatchADesireVideo() {
    }

    @And("Click on skipped button")
    public void clickOnSkippedButton() {
    }

    @Then("Continued to watch that video without waiting")
    public void continuedToWatchThatVideoWithoutWaiting() {
    }

    @And("with {int} of {int} Ads which will take time")
    public void withOfAdsWhichWillTakeTime(int arg0, int arg1) {
    }

    @When("i should watch a desire video")
    public void iShouldWatchADesireVideo() {
    }

    @And("have to wait until Ads finish for the video")
    public void haveToWaitUntilAdsFinishForTheVideo() {
    }

    @Then("proceed to watch")
    public void proceedToWatch() {
    }

    @When("need to watch a desire video")
    public void needToWatchADesireVideo() {
    }

    @And("there lot of received Text Ads")
    public void thereLotOfReceivedTextAds() {
    }

    @Then("click on close sign")
    public void clickOnCloseSign() {
    }

    @And("The video should have clear to watch")
    public void theVideoShouldHaveClearToWatch() {
    }

    @Given("User is on the home page")
    public void userIsOnTheHomePage() {
    }

    @When("User is on login page")
    public void isOnLoginPage() {
    }

    @And("User enters {string} and {string}")
    public void userEntersAnd(String arg0, String arg1) {
    }

    @Then("Message displayed Login Successfully")
    public void messageDisplayedLoginSuccessfully() {
    }
}
