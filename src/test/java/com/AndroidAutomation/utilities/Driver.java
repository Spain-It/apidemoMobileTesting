package com.AndroidAutomation.utilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileBrowserType;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;


public class Driver {
    private Driver() {
    }
    private static AndroidDriver<AndroidElement> driver;

    public static AndroidDriver<AndroidElement> get(){
        if (driver==null){
            String platform = ConfigurationReader.get("platform");
            DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
            switch (platform){
                case "android":

                    desiredCapabilities.setCapability("platformName", "Android");
                    desiredCapabilities.setCapability("platformVersion", "7.0");
                    desiredCapabilities.setCapability("deviceName", "Pixel_2");
                    desiredCapabilities.setCapability("automationName", "UiAutomator2");
                    desiredCapabilities.setCapability("app", "C:\\Users\\Tahsin\\IdeaProjects\\apidemoMobileTesting\\apidemos.apk");
                    try {
                        driver = new AndroidDriver<>(new URL("http://localhost:4723/wd/hub"), desiredCapabilities);
                        Driver.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    }catch (MalformedURLException e){
                        e.printStackTrace();
                    }
                    break;

                    default:

            }
        }
        return driver;
    }

    public static void closeDriver() {
        if (driver!=null){
            driver.quit();
            driver=null;
        }
    }
}