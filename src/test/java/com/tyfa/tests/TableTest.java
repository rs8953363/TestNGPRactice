package com.tyfa.tests;

import com.tyfa.pages.*;
import com.tyfa.utilities.*;
import org.openqa.selenium.*;
import org.testng.annotations.*;

import java.util.*;

public class TableTest {

    W3Schools schools = new W3Schools();

    @Test
    public void allTitles(){
        String url = "https://www.w3schools.com/html/html_tables.asp";
        Driver.getDriver().get(url);

        //List<WebElement>

        for (WebElement element: schools.titles){
            System.out.println(element.getText());
        }
    }
    @Test
    public void allCells(){
        String url = "https://www.w3schools.com/html/html_tables.asp";
        Driver.getDriver().get(url);

        for (WebElement element: schools.cells){
            System.out.println(element.getText());
        }
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
            String url = "https://www.w3schools.com/html/html_tables.asp";
            Driver.getDriver().get(url);

            WebElement element = ReusableMethods.getRowAndColumn(5,3);
            System.out.println(element.getText());
    }
}
