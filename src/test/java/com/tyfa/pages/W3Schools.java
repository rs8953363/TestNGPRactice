package com.tyfa.pages;

import com.tyfa.utilities.*;
import org.openqa.selenium.*;
import org.openqa.selenium.support.*;

import java.util.*;

public class W3Schools {
    public W3Schools(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath="//table//th")
    public List<WebElement> basliklar;
}
