package com.example.cucumberspring1.pages;

import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//I need the component created with a specific condition eg production, QA
//@ConditionalOnProperty(name = "env", havingValue = "qa")
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class MainPage extends BasePage{

    @Autowired
    private LoginPage loginPage;

    @Autowired
    private HomePage homePage;

    /*@Autowired
    private WebDriver webDriver;

    @Value("${app.url}")
    private String environment;
*/
   // public MainPage() {
     //   System.out.println("In main page");
   // }

   /* public void navigate() {
        navigatePage(environment);
    }*/

    public void performLogin() {
        homePage.clickLogin();
        loginPage.login("admin", "password");
        loginPage.clickLogin();
    }
}
