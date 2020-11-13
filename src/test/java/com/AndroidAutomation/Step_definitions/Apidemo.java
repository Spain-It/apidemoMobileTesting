package com.AndroidAutomation.Step_definitions;

import com.AndroidAutomation.Pages.View;
import io.cucumber.java.en.Given;

import java.net.MalformedURLException;

public class Apidemo {
    View view = new View();
    @Given("click preference button")
    public void click_preference_button() throws InterruptedException, MalformedURLException {

        Thread.sleep(3000);
       view.preference.click();
    }
    @Given("click preDependencies button")
    public void click_pre_dependencies_button() throws InterruptedException {
        Thread.sleep(2000);
       view.preDependencies.click();
          }

    @Given("click wifi checkBox")
    public void click_wifi_check_box() {
       view.wifi.click();
    }

    @Given("click wifisetting button")
    public void click_wifisetting_button() {
        view.wifiSettings.click();
    }

    @Given("Enter {string} input box")
    public void enter_input_box(String text) {
       view.input.sendKeys(text);
    }

    @Given("click ok button")
    public void click_ok_button() {
        view.okButton.click();
    }

}
