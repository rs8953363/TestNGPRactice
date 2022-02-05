package com.tyfa.utilities;

import io.github.bonigarcia.wdm.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.ie.*;
import org.openqa.selenium.opera.*;
import org.openqa.selenium.safari.*;

public class Driver {
    static WebDriver driver;

    public static WebDriver getDriver(){
        if (driver == null) {

            //The following line is to access the browser value of ConfiguraationReader class. It will return the browser
            // which is chrome. ConfigurationReader is used to get the information in the configuraation.properties class.
            String browser = ConfigurationReader.getProperty("browser");
            String muhendis = ConfigurationReader. getProperty("engineer");

            switch(browser){
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;
                case "ie":
                    WebDriverManager.iedriver().setup();
                    driver = new InternetExplorerDriver();
                    break;
                case "safari":
                    WebDriverManager.getInstance(SafariDriver.class).setup();
                    driver = new SafariDriver();
                    break;
                case "opera":
                    WebDriverManager.operadriver().setup();
                    driver = new OperaDriver();
                    break;
            }

        }
        return driver;
    }

    public static void closeDriver(){
        if(driver != null){
            driver.quit();//Close driver
            driver = null;//Delete driver from memory
        }
    }
}
