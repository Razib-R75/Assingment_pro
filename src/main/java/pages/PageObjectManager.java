package pages;

import io.appium.java_client.AppiumDriver;
import pages.Locator.Locator;

public class PageObjectManager {

    public static AppiumDriver driver;
    public Locator testingApp;

    public PageObjectManager(AppiumDriver driver) {
        this.driver = driver;
    }
    public Locator getAdditionPage() {
        testingApp = new Locator(driver);
        return testingApp;
    }

}
