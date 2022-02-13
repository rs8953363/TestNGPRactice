package com.tyfa.tests;

import com.tyfa.pages.*;
import com.tyfa.utilities.*;
import org.openqa.selenium.*;
import org.testng.annotations.*;

public class TableTest {

    W3Schools school = new W3Schools();
    @Test
    public void allTitles(){
        String url = "https//www.w3schools.com/html_tables.asp";
        Driver.getDriver().get(url);

        //List<WebElement>

        for (WebElement element: school.basliklar){
            element
        }

    }
}
