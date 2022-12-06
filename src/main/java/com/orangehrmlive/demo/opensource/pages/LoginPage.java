package com.orangehrmlive.demo.opensource.pages;

import com.orangehrmlive.demo.opensource.utility.Utility;
import org.openqa.selenium.By;
import org.testng.Assert;

public class LoginPage extends Utility {

    By userNameField = By.name("username");
    By passwordField = By.name("password");
    By loginButton = By.xpath("//button[@type='submit']");
    By dashboardText = By.xpath("//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']");

    public void enterUsername(String username){
        sendTextToElement(userNameField,username);

    }
    public void enterPassword(String password){
        sendTextToElement(passwordField,password);
    }
    public void clickOnLoginButton(){
        clickOnElement(loginButton);
    }
    public String getDashboardText(){
        return getTextFromElement(dashboardText);
    }


}
