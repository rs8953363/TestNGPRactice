package com.tyfa.utilities;

import io.github.bonigarcia.wdm.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class Driver {
    static WebDriver driver;

    public static WebDriver getDriver(){
        if (driver == null) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
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
