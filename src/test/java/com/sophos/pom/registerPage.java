package com.sophos.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class registerPage  extends base{

    By registerLinkLocator = By.linkText("REGISTER");
    By registerPageLocator = By.xpath("//img[@src='/images/masts/mast_register.gif']");

    By usernameLocator = By.id("email");
    By passwordLocator = By.name("password");
    By confirmPassworLocator = By.cssSelector("input[name='confirmPassword']");
    By registerBtnLocator = By.name("submit");
    By registeredMessage = By.tagName("font");
    public registerPage(WebDriver driver) {
        super(driver);
    }

    public void registerUser() throws InterruptedException {
        click(registerLinkLocator);
        Thread.sleep(2000);
        if (isDisplayed(registerBtnLocator)){
            type("albadmin1", usernameLocator);
            type("123456", passwordLocator);
            type("123456", confirmPassworLocator);

            click(registerBtnLocator);
        }else {
            System.out.println("Register pages was no found...!");
        }

    }

    public String registeredMessage(){
        List<WebElement> fonts = finWebElements(registeredMessage);
        return getText(fonts.get(5));
    }
}
