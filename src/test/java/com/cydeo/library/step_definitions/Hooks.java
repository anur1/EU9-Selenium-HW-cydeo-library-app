package com.cydeo.library.step_definitions;



import com.cydeo.library.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


//All inside are automatically done in cucumber
public class Hooks {

    //all are done after a scenario completed
    @After
    public void teardown(Scenario scenario){

        if (scenario.isFailed()){

            byte[] screenShot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);

            scenario.attach(screenShot, "image/png", scenario.getName());

        }
        Driver.closeDriver();


        System.out.println();
        System.out.println("One of the tests is over");
        System.out.println();

    }

}//endclass

