package com.tyfa.tests;

import com.tyfa.utilities.*;
import org.openqa.selenium.*;
import org.testng.annotations.*;

import java.util.*;
/*Locators
1. id
2. name
3. className
4. tagName
5. linkText (only for elements with "a" tagname)
6. PartialLinkText (only for elements with "a" tagname)
7. xpath: You use it if there is a text in the element all elements
8. cssSelector: For CSS values (usually for class and id) (#id) (.className) (tagname#id)
*/
public class AmazonTestLocators {
    @Test
    public void SearchTest2(){
        Driver.getDriver().get("https://www.amazon.com");
        WebElement searchBox = Driver.getDriver().findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("telephone");//sendKeys is to add a text

        WebElement searchbox2 = Driver.getDriver().findElement(By.xpath("//input[@id='twotabsearchtextbox']"));

        Driver.getDriver().navigate().to("https://www.amazon.com/s?k=headphone&crid=2YGI7VLEZE7JG&sprefix=headphone%2Caps%2C210&ref=nb_sb_noss_2");

        WebElement title = Driver.getDriver().findElement(By.tagName("h1"));
        String titleString = title.getText();//getText is to get the text that WebElement contains. In this case the text is "50 answered questions"
        System.out.println(titleString);

        WebElement answeredQuestions = Driver.getDriver().findElement(By.partialLinkText("50 answered questions"));
        //You could have used LinkText locator, as well
        String answeredQuestionsString = answeredQuestions.getText();
        System.out.println(answeredQuestionsString);


        WebElement numberOfQuestions = Driver.getDriver().findElement(By.className("base"));
        WebElement numberOfQuestions2 = Driver.getDriver().findElement(By.cssSelector(".base"));//cssSelector(.classname)

        List<WebElement> links = Driver.getDriver().findElements(By.tagName("a"));
        for (WebElement element: links) {
            System.out.println(element.getText());
        }
        Driver.getDriver().findElement(By.id("box"));
        Driver.getDriver().findElements(By.cssSelector("#box"));//cssSelector(#id)

    }
}
