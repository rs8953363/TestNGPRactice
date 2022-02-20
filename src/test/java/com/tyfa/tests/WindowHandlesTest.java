package com.tyfa.tests;

import com.tyfa.utilities.*;
import org.openqa.selenium.*;
import org.testng.annotations.*;

import java.util.*;

public class WindowHandlesTest {

    @Test
    public void setTest(){
        Set<String> list = new HashSet<>();
        list.add("Chicago");
        list.add("Texas");
        list.add("Seattle");

        System.out.println(list.toString());//It doesn't list according to order you put
        }

    @Test
    public void test(){
        Driver.getDriver().get("https://www.w3schools.com/html/default.asp");
        String w3schoolsHandle = Driver.getDriver().getWindowHandle();

        WebElement facebookLink = Driver.getDriver().findElement(By.xpath("//a[@title='Facebook']"));

        facebookLink.click();
        String facebookHandle = Driver.getDriver().getWindowHandle();//Brings the handle value of the current window

//        Set<String> list = Driver.getDriver().getWindowHandles();//Brings the handle values of the all opened windows.

        ReusableMethods.sleep(3000);
        Driver.getDriver().switchTo().window(w3schoolsHandle);

        ReusableMethods.sleep(3000);
        Driver.getDriver().switchTo().window(facebookHandle);

        ReusableMethods.sleep(3000);
        Driver.getDriver().switchTo().window(w3schoolsHandle);

    }
}
