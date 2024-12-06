package org.zone24x7.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.zone24x7.base.BasePage;

public class LoginPage extends BasePage {

    private final By usernameTxtbox = By.xpath("//*[@id=\"identifier\"]");
    private final By nextButton = By.xpath("//*[@id=\"okta-sign-in\"]/div/div/div/div[2]/form/div/div[3]/button");
    private final By passwordTxtbox = By.xpath("//div/div/div/div/input[@id=\"credentials.passcode\"]");
    private final By verifyButton = By.xpath("//*[@id=\"okta-sign-in\"]/div/div/div/div[2]/form/div/div[5]/button");
    private final By HomepageText = By.xpath("//*[@id=\"root\"]/section/section/section/div[2]/div[1]/h2");

    public LoginPage(WebDriver driver){
           super(driver);
    }

    public void enterUsername(String username){
            uiDriver.findElement(usernameTxtbox).sendKeys(username);

    }
    public DashboardPage clickNextButton(){
        uiDriver.findElement(nextButton).click();
        return new DashboardPage(uiDriver);
    }

    public void enterPassword(String password){
        uiDriver.findElement(passwordTxtbox).sendKeys(password);

    }

    public DashboardPage clickVerifyButton(){
        uiDriver.findElement(verifyButton).click();
        return new DashboardPage(uiDriver);
    }

    public String getHomePageText(){
        String a = uiDriver.findElement(HomepageText).getText();
        return a;
    }

}
