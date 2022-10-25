package com.cydeo.library.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Driver {

     /*
        A new private constructor so we are closing access         to the object of this class from outside the class
     */

    private Driver() {

    }


    /*
    We make Webdriver private, because we want to     close access from outside the class.
    We make it static, because we will use it  in a static method.
     */

    //private static WebDriver driver; //value is null by default

    //parallel threading lines instead of above single driver
    private static InheritableThreadLocal<WebDriver> driverPool = new InheritableThreadLocal<>();



    /*
    A new re-usable utility method which wil return same
    driver instance when we call it.
     */
    public static WebDriver getDriver() {

        if (driverPool.get()==null) {


            /*
            We read our browserType from configuration.properties.
            This way, we control which browser is opened from outside our code, from configuration.properties.
             */
            String browserType = ConfigurationReader.getProperty("browser");

            /*
            Dependng on the browser type that will be return from configuration.properties file
            switch statement will determine the case, and open matching browser.
            */

            switch (browserType) {
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driverPool.set(new ChromeDriver());
                    driverPool.get().manage().window().maximize();
                    driverPool.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    break;
                case "firefox":
                    WebDriverManager.chromedriver().setup();
                    driverPool.set(new FirefoxDriver());
                    driverPool.get().manage().window().maximize();
                    driverPool.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    break;
            }

        }
        //return existing one if driver != null
        return driverPool.get();
    }


    //driver.quit()-->no such session exception
    //driver.close()-->

    /*
This method will make sure our driver value is always null after
using quit() method.
     */

    // a method named closeDriver
    public static void closeDriver() {

        if(driverPool.get()!=null) {
            driverPool.get().quit();//this line   will terminate the existing session. value will not even be null.
            driverPool.remove();
        }

    }//endmethod




}
