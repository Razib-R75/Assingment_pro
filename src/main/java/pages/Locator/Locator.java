package pages.Locator;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Locator {

    public AppiumDriver driver;

    By Home_screen = By.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView");
    By View = By.xpath("//android.widget.TextView[@content-desc=\"Views\"]");
    By Expandable_Lists = By.xpath("//android.widget.TextView[@content-desc=\"Expandable Lists\"]");
    By Expandable_Lists_section = By.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView");
    By Custom_Adapter = By.xpath("//android.widget.TextView[@content-desc=\"1. Custom Adapter\"]");
    By Custom_Adapter_List = By.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ExpandableListView");
    By People_Names = By.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ExpandableListView/android.widget.TextView[1]");
    By contextual_menu = By.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ExpandableListView");
    By Drag_and_Drop = By.xpath("//android.widget.TextView[@content-desc=\"Drag and Drop\"]");
    By Drag_and_Drop_section = By.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout");
    By firstCircle = By.id("io.appium.android.apis:id/drag_dot_1");
    By secondCircle = By.id("io.appium.android.apis:id/drag_dot_2");
    By droppedMessage = By.xpath("//android.widget.TextView[@text='Dropped!']");
    public Locator(AppiumDriver driver) {
        this.driver = driver;
    }

    public  WebElement Home_screen(){
        return driver.findElement(Home_screen);
    }
    public  WebElement ViewOption(){
        return driver.findElement(View);
    }
    public  WebElement Expandable_Lists(){
        return driver.findElement(Expandable_Lists);
    }

    public  WebElement Expandable_Lists_section(){
        return driver.findElement(Expandable_Lists_section);
    }

    public  WebElement Custom_Adapter(){
        return driver.findElement(Custom_Adapter);
    }
    public  WebElement Custom_Adapter_List(){
        return driver.findElement(Custom_Adapter_List);
    }
    public  WebElement People_Names(){
        return driver.findElement(People_Names);
    }
    public  WebElement contextual_menu(){
        return driver.findElement(contextual_menu);
    }

    public  WebElement Drag_and_Drop(){
        return driver.findElement(Drag_and_Drop);
    }
    public  WebElement Drag_and_Drop_section(){
        return driver.findElement(Drag_and_Drop_section);
    }

    public  WebElement firstCircle(){
        return driver.findElement(firstCircle);
    }
    public  WebElement secondCircle(){
        return driver.findElement(secondCircle);
    }
    public WebElement droppedMessage() {
    return driver.findElement(droppedMessage);
    }

}
