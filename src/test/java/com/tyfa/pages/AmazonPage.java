package com.tyfa.pages;

import com.tyfa.utilities.*;
import org.openqa.selenium.*;
import org.openqa.selenium.support.*;

public class AmazonPage {
    //First step: Create a constructor
    public AmazonPage(){
        //In Page Object Model, you create pages and search WebElements in these pages. PageFactory is used for page
        // object model to reach a pages class and find a WebElement with the help of Constructor
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(id="twotabsearchtextbox")
    public WebElement searchBox;

    @FindBy (linkText = "Gift Cards")
    public WebElement giftCardLink;


}
