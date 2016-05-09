package com.hillt.webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by thill on 5/8/16.
 */

public class HomePage {

    private WebDriver driver;
    private static String PAGE_URL="http://www.uptake.com";

    @FindBy(how = How.LINK_TEXT, using = "Approach")
    private WebElement approachLink;

    public HomePage(WebDriver driver){
        this.driver=driver;
        driver.get(PAGE_URL);
        PageFactory.initElements(driver, this);
    }

    public String getTitle(){
        String title = driver.getTitle();
        System.out.println("Page title is: " + title);
        return title;
    }

    public void clickOnApproachLink(){
        approachLink.click();
    }
}
