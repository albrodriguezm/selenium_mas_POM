package com.sophos.pom;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;


public class registerTest {

    private WebDriver driver;
    registerPage registerInPage;
    @Before
    public void setUp() throws Exception{
        registerInPage = new registerPage(driver);
        driver = registerInPage.chromeDriverConnection();
        registerInPage.visit("https://demo.guru99.com/test/newtours/");

    }
    @After
    public void tearDown() throws Exception{
        driver.quit();
    }
    @Test
    public void test() throws InterruptedException {
        registerInPage.registerUser();
        assertEquals("Note: Your user name is albadmin1.",registerInPage.registeredMessage());
        //assertEquals(registerInPage.registeredMessage(),"Note: Your user name is albadmin.");
    }
}
