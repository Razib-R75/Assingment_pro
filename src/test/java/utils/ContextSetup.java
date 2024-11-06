package utils;

import io.appium.java_client.AppiumDriver;

import pages.PageObjectManager;

public class ContextSetup {

    public AppiumDriver driver;
    public PageObjectManager pageObjectManager;
    public TestBase base;

    public ContextSetup() throws Exception {
        base = new TestBase();
       pageObjectManager = new PageObjectManager(base.AppiumDriverManager());

    }

}
