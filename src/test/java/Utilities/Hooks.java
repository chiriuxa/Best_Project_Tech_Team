package Utilities;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {
    @Before
    public void setup(){
        //Here we can add anything we want to run before our scenarios
        System.out.println("--the scenario is running--");
    }

    @After
    public void tearDown(Scenario scenario){
        if (scenario.isFailed()){
            byte [] screnshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screnshot,"image/png", "screenshot");
        }
        Driver.quitDriver();
    }
}
