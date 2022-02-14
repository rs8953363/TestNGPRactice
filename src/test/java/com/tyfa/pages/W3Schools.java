package com.tyfa.pages;

import com.tyfa.utilities.*;
import org.openqa.selenium.*;
import org.openqa.selenium.support.*;

import java.util.*;

public class W3Schools {
    public W3Schools(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath="//table[1]//th")
    public List<WebElement> titles;

    @FindBy (xpath = "(//table)[1]/tbody//td")
    public List<WebElement> cells;

}
