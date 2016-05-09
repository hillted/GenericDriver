package com.hillt;

import java.util.concurrent.TimeUnit;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by thill on 5/6/16.
 */
public class OldSchoolSeleniumTest {
    private static FirefoxDriver driver;
    WebElement element;

    @BeforeClass
    public static void openBrowser(){
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void getApproachPage()
    {
        System.out.println("Starting test " + new Object(){}.getClass().getEnclosingMethod().getName());
        driver.get("http://www.uptake.com");
        String title = driver.getTitle();
        System.out.println("Page title is: " + title);
        Assert.assertEquals("Uptake – Analytics for the Industrial Internet", title);
        WebElement element = driver.findElement(By.id("menu-item-4164"));
        String platformText = element.getText();
        System.out.println("Text is: " + platformText);
        Assert.assertEquals("Approach", platformText);
        element.click();
        title = driver.getTitle();
        System.out.println("Page title is: " + title);
        Assert.assertEquals("Approach – Uptake", title);
        System.out.println("Ending test " + new Object(){}.getClass().getEnclosingMethod().getName());
    }

    @AfterClass
    public static void closeBrowser(){
        driver.quit();
    }
}
