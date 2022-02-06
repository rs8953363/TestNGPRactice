package com.tyfa.tests;

import com.tyfa.utilities.*;
import org.openqa.selenium.*;
import org.testng.annotations.*;

import java.lang.ref.*;

public class GoogleSearchTest {
    //Tests should be in methods. You can write as many methods as you want

    @Test
    public void searchTest() {
        Driver.getDriver().get("https://www.google.com");//This line is to start the tarayici
//Instead of using try-catch method all the time, you can put it in Reusable Methods file
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Driver.getDriver().get("https://www.amazon.com");

        ReusableMethods.sleep(2000);//Helps to wait 5 seconds

        //Get title of the opened tab
        String title = Driver.getDriver().getTitle();
        System.out.println(title);

        ReusableMethods.sleep(2000);
        //This method calls the closeDriver method of the Driver class. It closes the current window

        Driver.getDriver().navigate().to("https://www.etsy.com/");//Helps to go back, forward or refresh the page
        String title2 = Driver.getDriver().getTitle();
        System.out.println(title2);

        Driver.getDriver().navigate().back();//Takes us back o the Amazon website
        ReusableMethods.sleep(2000);
        Driver.getDriver().navigate().forward();//Takes us to Etsy website
        ReusableMethods.sleep(2000);
        Driver.closeDriver();

        //close() closes only the current window on which Selenium is running automated tests. The WebDriver session remains active.
        //quit() method closes all browser windows and ends the WebDriver session

        //get() is used to navigate particular website and wait till page load. driver. It doesn't have browser history
        // navigate() is used to navigate to particular URL and does not wait to page load. It maintains browser history
        // or cookies to navigate back or forward.

//        Driver.getDriver().findElement(By.locatorKind) only one
//        Driver.getDriver().findElements(By.locatorKind) lists all the elements



    }
    }
