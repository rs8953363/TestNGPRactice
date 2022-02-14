package com.tyfa.utilities;

import org.openqa.selenium.*;

import java.util.*;

public class ReusableMethods {
    public static void sleep (int miliseconds){
        try {
            Thread.sleep(miliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static List<WebElement> getTitles(){
        return Driver.getDriver().findElements(By.xpath("(//table)["+table+"]//th"));
    }

    public static List<WebElement> getRows(int table){
        return Driver.getDriver().findElements(By.xpath("(//table)["+table+"]/tbody/tr"));
    }

    public static List<WebElement> getAllCells(){
        return Driver.getDriver().findElements(By.xpath("(//table)[1]/tbody/td"));
    }

    public static List<WebElement> getCellsInRows(int row){
        return Driver.getDriver().findElements(By.xpath("((//table)[1]/tbody/tr)["+row+"]"));
    }

    public static List<WebElement> getColumns(int column){
        return Driver.getDriver().findElements(By.xpath("(//table)[1]//tr/td["+column+"]"));
    }

    public static WebElement getRowsAndColumns(int row, int column){
        return Driver.getDriver().findElement(By.xpath("(//table)[1]//tr[" +row+ "]/td[" +column+ "]"));
    }
}
