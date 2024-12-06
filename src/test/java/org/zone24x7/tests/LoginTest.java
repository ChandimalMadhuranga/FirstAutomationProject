package org.zone24x7.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.w3c.dom.Text;
import org.zone24x7.base.BaseTest;
import org.zone24x7.pages.DashboardPage;
import org.zone24x7.pages.LoginPage;

import java.time.Duration;

public class LoginTest extends BaseTest {
    LoginPage loginPage;
    DashboardPage dashboardPage;

    @Test
    public void DMSDashboardPageLoad(){
        loginPage = new LoginPage(driver);
        loginPage.enterUsername("dinesh.priyankara+uatstgn1@iris.co.uk");
        dashboardPage = loginPage.clickNextButton();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        loginPage.enterPassword("Zone@12345");
        dashboardPage = loginPage.clickVerifyButton();
        dashboardPage.isPageLoaded();
        Assert.assertEquals(loginPage.getHomePageText(),"File Areas");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        //Hello
        //Hello2
    }

    /*@Test
    public void DMSDashboardPageLoad(){
        loginPage = new LoginPage(driver);
        loginPage.enterUsername("dinesh.priyankara+uatstgn1@iris.co.uk");
        loginPage.clickNextButton();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        loginPage.enterPassword("Zone@12345");
        loginPage.clickVerifyButton();
        //dashboardPage.isPageLoaded();
        Assert.assertEquals(loginPage.getHomePageText(),"File Areas");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }*/
}
