package com.cydeo.library.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = "json:target/cucumber.json",
        features = "src/test/resources/features",
        glue = "com/cydeo/library/step_definitions",
        dryRun = false, //for generating snippets enter 'true'
        tags = "@task6",
        publish = false
)

public class CukesRunner {
}
