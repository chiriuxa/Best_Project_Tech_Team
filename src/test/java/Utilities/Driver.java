package Utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Driver {
    private static WebDriver driver;
    public static WebDriver getDriver (){
        if (driver == null){

            switch (Config.getProperty("browser")) {
                case "edge" -> {
                    WebDriverManager.edgedriver().setup();
                    driver = new EdgeDriver();
                }
                case "chrome" -> {
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                }
                case "firefox" -> {
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                }
            }

            driver.manage().window().fullscreen();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        }

        return driver;
    }

    public static void quitDriver (){
        if (driver != null){
            driver.quit();
            driver = null;
        }
    }
}
