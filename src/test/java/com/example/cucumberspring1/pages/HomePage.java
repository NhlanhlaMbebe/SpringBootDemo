package com.example.cucumberspring1.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class HomePage extends BasePage{

    @FindBy(how = How.LINK_TEXT, using = "Login")
    public WebElement lnkLogin;

    @FindBy(how = How.LINK_TEXT, using = "Employee List")
    public WebElement lnkEmployeeList;

    @FindBy(how = How.LINK_TEXT, using = "Employee Details")
    private WebElement lnkEmployeeDetails;

    public LoginPage clickLogin() {
        lnkLogin.click();
        //System.out.println("Click the login page");
        return new LoginPage();
    }

    public LoginPage clickEmployeeList() {
        lnkEmployeeList.click();
        return new LoginPage();
    }

    public boolean isEmployeeDetailsExist() {
        return lnkEmployeeList.isDisplayed();
    }
}
