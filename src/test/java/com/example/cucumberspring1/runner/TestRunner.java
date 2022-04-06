package com.example.cucumberspring1.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(
        features = {"src/test/java/com/example/cucumberspring1/features"},
        plugin = {"json:target/cucumber-report.json", "pretty"},
        glue = {"com.example.cucumberspring1.steps"}
)
public class TestRunner extends AbstractTestNGCucumberTests {
    @DataProvider(parallel = true)
    @Override
    public Object[][] scenarios() {
        return super.scenarios();
    }
}
