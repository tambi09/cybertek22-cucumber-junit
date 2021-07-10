package com.cybertek.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Driver {

    private Driver(){}
    /*
    Making our 'driver instance private so that it not  reachable from outside of the class.
    We make it static, bc we want it to run before everything else, and also we will use it in a static method
     */

    private static WebDriver driver;

    public static WebDriver getDriver() {
        if (driver == null) {

            String browserType = ConfigurationReader.getProperty("browser");
                /*
                Depending on the browser type our switch statement will determine to open specific type of browser/driver
                 */
            switch (browserType){
                case "chrome":

                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    driver.manage().window().maximize();
                    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver.manage().window().maximize();
                    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
                    break;


            }

        }
        return driver;

    }



    public static void closeDriver(){
        if(driver!=null){
            driver.quit();
            driver = null;

        }
    }


}
