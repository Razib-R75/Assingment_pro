package stepDefinitions;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import pages.Locator.Locator;
import utils.ContextSetup;

import java.time.Duration;


public class TestSteps {

    AppiumDriver driver;
    Locator testingApp;
    ContextSetup setup;


    public TestSteps(ContextSetup setup){
       this.setup = setup;
       this.testingApp = setup.pageObjectManager.getAdditionPage();
    }


    @Given("the ApiDemos-debug.apk app is launched and the home screen is visible,")
    public void theApiDemosDebugApkAppIsLaunchedAndTheHomeScreenIsVisible() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertTrue(testingApp.Home_screen().isDisplayed());
    }

    @When("clicks on the Views option,")
    public void theUserClicksOnTheViewsOption() throws InterruptedException {
        testingApp.ViewOption().click();
        Thread.sleep(2000);
    }

    @Then("the Views section should open.")
    public void theViewsSectionShouldOpen() {
        Assert.assertTrue(testingApp.Expandable_Lists().isDisplayed());
    }

    @When("scrolls and selects the Expandable Lists option,")
    public void theUserScrollsAndSelectsTheExpandableListsOption() throws InterruptedException {
        testingApp.Expandable_Lists().click();
        Thread.sleep(2000);
    }

    @Then("the Expandable Lists section should open.")
    public void theExpandableListsSectionShouldOpen() {
        Assert.assertTrue(testingApp.Expandable_Lists_section().isDisplayed());
    }

    @When("selects the Custom Adapter option inside the Expandable Lists section,")
    public void theUserSelectsTheCustomAdapterOptionInsideTheExpandableListsSection() throws InterruptedException {
        testingApp.Custom_Adapter().click();
        Thread.sleep(2000);
    }

    @Then("the Custom Adapter list should appear with a list of items.")
    public void theCustomAdapterListShouldAppearWithAListOfItems() {
        Assert.assertTrue(testingApp.Custom_Adapter_List().isDisplayed());

    }

    @When("performs a long press on the first item in the list \\(e.g., People Names),")
    public void theUserPerformsALongPressOnTheFirstItemInTheListEGPeopleNames() throws InterruptedException {
        testingApp.People_Names().click();
        Thread.sleep(2000);
    }

    @Then("a contextual popup menu should appear with options like Sample action.")
    public void aContextualPopupMenuShouldAppearWithOptionsLikeSampleAction() {
        Assert.assertTrue(testingApp.contextual_menu().isDisplayed());
    }

    @When("navigates back to the Views section after validating the popup menu,")
    public void theUserNavigatesBackToTheViewsSectionAfterValidatingThePopupMenu() throws InterruptedException {
        testingApp.ViewOption().click();
        Thread.sleep(2000);

    }


    @And("scrolls and selects the Drag and Drop option from the Views section,")
    public void theUserScrollsAndSelectsTheDragAndDropOptionFromTheViewsSection() throws InterruptedException {
        testingApp.Drag_and_Drop().click();
        Thread.sleep(2000);
    }

    @Then("the Drag and Drop section should open with draggable elements.")
    public void theDragAndDropSectionShouldOpenWithDraggableElements() {
        Assert.assertTrue(testingApp.Drag_and_Drop_section().isDisplayed());

    }

    @When("drags the first circle onto the second circle")
    public void theUserDragsTheFirstCircleOntoTheSecondCircle() throws InterruptedException {
        // Get the location of the first and second circles
        Assert.assertTrue(testingApp.firstCircle().isDisplayed()); // Wait for 2 seconds to see the result of the action // Wait for 2 seconds to see the result of the action
    }


    @Then("a success message or UI change should confirm the successful completion of the action.")
    public void aSuccessMessageOrUIChangeShouldConfirmTheSuccessfulCompletionOfTheAction() {
        Assert.assertTrue(testingApp.secondCircle().isDisplayed());
    }
}
