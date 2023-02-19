package com.sophos.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class signInPage  extends base{

    By userLocator = By.name("userName");
    By passLocator = By.name("password");
    By signInBtnLocator = By.name("submit");

    By homePageLocator = By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[1]/td/h3");
    public signInPage(WebDriver driver) {
        super(driver);
    }

    public void signIn(){
        if (isDisplayed(userLocator)){
            type("albadmin1",userLocator);
            type("123456",passLocator);
            click(signInBtnLocator);
        }else {
            System.out.println("username textbox was not present");
        }
    }

    public boolean isHomePageDisplayed(){
        return isDisplayed(homePageLocator);
    }

}
