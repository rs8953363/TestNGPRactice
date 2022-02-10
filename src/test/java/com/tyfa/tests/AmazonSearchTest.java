package com.tyfa.tests;

import com.tyfa.pages.*;
import com.tyfa.utilities.*;
import org.openqa.selenium.*;
import org.testng.annotations.*;

public class AmazonSearchTest {

    AmazonPage page = new AmazonPage();

    @Test
    public void searchTest(){
        Driver.getDriver().get("https://amazon.com");
        page.searchBox.sendKeys("ipone"+ Keys.ENTER);
    }
}
