package com.tyfa.tests;

import com.tyfa.pages.*;
import com.tyfa.utilities.*;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;
import org.testng.annotations.*;

public class AmazonSearchTest {

    AmazonPage page = new AmazonPage();

    @Test
    public void searchTest(){
        Driver.getDriver().get("https://amazon.com");

        Select select = new Select(page.categoryList);
        select.selectByVisibleText("Automotive");
        select.selectByIndex(8);
        select.selectByValue("search-alias=electronics-intl-ship");

        page.searchBox.sendKeys("ipone"+ Keys.ENTER);
    }
}
