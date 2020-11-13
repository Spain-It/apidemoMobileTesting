package com.AndroidAutomation.Pages;

import com.AndroidAutomation.utilities.Driver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.net.MalformedURLException;


public class View {

    public View() {
        PageFactory.initElements(new AppiumFieldDecorator(Driver.get()),this);
    }

    @AndroidFindBy(accessibility = "Preference")
    public WebElement preference;

    @AndroidFindBy(id = "android:id/checkbox")
    public WebElement wifi;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout[2]/android.widget.RelativeLayout/android.widget.TextView\n")
    public WebElement wifiSettings;

    @AndroidFindBy(id = "android:id/edit")
    public WebElement settingText;

    @AndroidFindBy(id = "android:id/button1")
    public WebElement okButton;

    @AndroidFindBy(id = "android:id/edit")
    public WebElement input;

    @AndroidFindBy(accessibility = "3. Preference dependencies")
    public WebElement preDependencies;


}
