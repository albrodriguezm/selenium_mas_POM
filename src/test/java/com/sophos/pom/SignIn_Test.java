package com.sophos.pom;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SignIn_Test {

    private WebDriver driver;
    signInPage SingInPage;


    @Before
    public void setUp() throws Exception {
    SingInPage = new signInPage(driver);
    driver = SingInPage.chromeDriverConnection();
    SingInPage.visit("https://demo.guru99.com/test/newtours/");

    }
    @After
    public void tearDown() throws Exception{
    //driver.quit();
    }

    @Test
    public void test() throws InterruptedException {
        SingInPage.signIn();
        Thread.sleep(2000);
        assertEquals(true, SingInPage.isHomePageDisplayed());
        //assertTrue(SingInPage.isHomePageDisplayed());

    }



}
