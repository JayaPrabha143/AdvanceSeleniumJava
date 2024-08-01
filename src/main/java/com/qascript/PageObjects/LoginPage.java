package com.qascript.PageObjects;

import com.qascript.BaseClass;
import org.openqa.selenium.By;

public class LoginPage extends BaseClass {

    private static String txtEmail = "//input[@id='input-email']";
    private static String txtPassword = "(//input[@id='input-password'])[1]";
    private static String btnLogin = "(//input[@value='Login'])[1]";
    private static String linkForgotten = "(//a[normalize-space()='Forgotten Password'])[1]";

    public static void enterUserName(String username){
        driver.findElement(By.xpath(txtEmail)).sendKeys(username);

    }

    public static void enterPassword(String password){
        driver.findElement(By.xpath(txtPassword)).sendKeys(password);

    }

    public static void clickLoginBtn(){
        driver.findElement(By.xpath(btnLogin)).click();

    }

    public static void forgottenpassword(){
        driver.findElement(By.xpath(linkForgotten)).click();

    }

}
