package com.tyfa.tests;

import com.tyfa.utilities.*;
import org.openqa.selenium.*;
import org.testng.annotations.*;

public class AlertTest {
    //Alerts are usually created by JavaScript. If it can be reached by inspect it means it was created by HTML.
     /* Alert methods from Selenium library
        dismiss() --> cancel
        accept() --> accept the alert, like clicking OK buttoon.
        getText() --> brings the content of the alert
        sendKAys(String var1) --> to send text to the alert
        */

    @Test
    public void test(){
        //You can add the following two lines to reusable methods, as well.
//        WebElement acceptLink = Driver.getDriver().findElement(By.xpath("//a[@onclick= 'removeCookiePolicy()']"));
//        acceptLink.click();

        Driver.getDriver().get("https://www.tutorialsteacher.com/codeeditor?cid=js-1");
        ReusableMethods.sleep(2000);

        Alert alert1 = Driver.getDriver().switchTo().alert();
        String AlertContent1 = alert1.getText();
        alert1.accept();

//        2nd way of writing
//        String AlertContent1 = Driver.getDriver().switchTo().alert().getText();
//        System.out.println(AlertContent1);
//        Driver.getDriver().switchTo().alert().accept();//S`witch to the alert

        Alert alert2 = Driver.getDriver().switchTo().alert();
        String AlertContent2 = alert2.getText();
        alert2.accept();

//        String AlertContent2 = Driver.getDriver().switchTo().alert().getText();
//        System.out.println(AlertContent2);
//        Driver.getDriver().switchTo().alert().accept();

        Alert alert3 = Driver.getDriver().switchTo().alert();
        String AlertContent3 = alert3.getText();
        alert3.accept();

//        String AlertContent3 = Driver.getDriver().switchTo().alert().getText();
//        System.out.println(AlertContent3);
//        Driver.getDriver().switchTo().alert().accept();

        System.out.println(AlertContent1);
        System.out.println(AlertContent2);
        System.out.println(AlertContent3);



        WebElement homeLink = Driver.getDriver().findElement(By.xpath("//a[@title='TutorialsTeacher.com Home']"));

        homeLink.click();
    }
}
