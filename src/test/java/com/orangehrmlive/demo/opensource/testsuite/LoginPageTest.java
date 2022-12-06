package com.orangehrmlive.demo.opensource.testsuite;

import com.orangehrmlive.demo.opensource.pages.LoginPage;
import com.orangehrmlive.demo.opensource.testbase.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest {

    LoginPage loginPage = new LoginPage();

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials(){
        loginPage.enterUsername("Admin");
        loginPage.enterPassword("admin123");
        loginPage.clickOnLoginButton();
        String expectedText = "Dashboard";
        Assert.assertEquals(loginPage.getDashboardText(),expectedText,"Messsage not displayed");
    }

}
