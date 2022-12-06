package com.orangehrmlive.demo.opensource.testsuite;

import com.orangehrmlive.demo.opensource.pages.ForgotPasswordPage;
import com.orangehrmlive.demo.opensource.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ForgotPasswordPageTest extends BaseTest {
    ForgotPasswordPage forgotPasswordPage = new ForgotPasswordPage();

    @Test
    public void userShouldNavigateToForgotPasswordPageSuccessfully(){
        forgotPasswordPage.clickOnForgotPasswordLink();
        String expectedMessage = "Reset Password";
        Assert.assertEquals(forgotPasswordPage.getResetPasswordText(),expectedMessage,"Page is not displayed");
    }
}
