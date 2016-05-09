package com.hillt.webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by thill on 5/8/16.
 */
public class ApproachPage {

    private WebDriver driver;

    public ApproachPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    public String getTitle(){
        String title = driver.getTitle();
        System.out.println("Page title is: " + title);
        return title;
    }
}
