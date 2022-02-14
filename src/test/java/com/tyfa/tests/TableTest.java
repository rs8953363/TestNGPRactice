package com.tyfa.tests;

import com.tyfa.pages.*;
import com.tyfa.utilities.*;
import org.openqa.selenium.*;
import org.testng.annotations.*;

import java.util.*;

public class TableTest {

    W3Schools school = new W3Schools();

    @Test
    public void allTitles(){
        String url = "https://www.w3schools.com/html/html_tables.asp";
        Driver.getDriver().get(url);

        //List<WebElement>

        for (WebElement element: school.titles){
            System.out.println(element.getText());
        }
    }
    @Test
    public void allCells(){

    }

    @Test
    public void allTitlesReusableMethods(){
        String url = "https://www.w3schools.com/html/html_tables.asp";
        Driver.getDriver().get(url);
        List<WebElement> list = ReusableMethods.getTitles();

        for (WebElement element : list){
            System.out.println(element.getText());
        }
    }

    @Test
    public void rowColumnTest(){
        Test
        public void allTitlesReusableMethods(){
            String url = "https://www.w3schools.com/html/html_tables.asp";
            Driver.getDriver().get(url);

    }
}
