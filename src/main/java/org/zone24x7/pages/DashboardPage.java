package org.zone24x7.pages;

import org.openqa.selenium.WebDriver;
import org.zone24x7.base.BasePage;

public class DashboardPage extends BasePage {

    public DashboardPage(WebDriver driver){
        super(driver);
    }

    public void isPageLoaded(){
        System.out.println("HomePage is loaded successfully");
    }
}
