package com.AndroidAutomation.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "com/AndroidAutomation/Step_definitions",
        dryRun = false,
        tags = "@list"


)
public class CukesRunner {
}


