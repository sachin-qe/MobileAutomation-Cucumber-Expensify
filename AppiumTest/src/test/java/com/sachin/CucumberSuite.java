package com.sachin;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(value = Cucumber.class)
@CucumberOptions(

        glue = "com.sachin.steps",
        features = {
                "classpath:resources/features"
        },
        plugin = {"pretty", "json:target/cucumber-reports/Cucumber.json"},
        monochrome = true
)

class CucumberSuite {
}
