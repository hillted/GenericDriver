package com.hillt.webpages;

import com.hillt.webpages.HomePage;
import com.hillt.webpages.ApproachPage;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.net.URL;
import java.util.concurrent.TimeUnit;
/**
 * Created by thill on 5/8/16.
 */
public class TestPages {

    WebDriver driver;

    @Before
    public void setup(){
        //use FF Driver
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void getApproachPage() {
        System.out.println("Starting test " + new Object(){}.getClass().getEnclosingMethod().getName());

        //HomePage
        HomePage homePage = new HomePage(driver);

        //Check HomePage title
        Assert.assertEquals("Uptake – Analytics for the Industrial Internet",homePage.getTitle());

        //Click on Approach Link
        homePage.clickOnApproachLink();

        //ApproachPage
        ApproachPage approachPage =new ApproachPage(driver);

        //Check ApproachPage title
        Assert.assertEquals("Approach – Uptake", approachPage.getTitle());

        System.out.println("Ending test " + new Object(){}.getClass().getEnclosingMethod().getName());
    }

    @After
    public void close(){
        driver.close();
    }
}