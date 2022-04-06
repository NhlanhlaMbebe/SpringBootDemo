package com.example.cucumberspring1.steps;

import com.example.cucumberspring1.pages.HomePage;
import com.example.cucumberspring1.pages.LoginPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.Assert;

public class LoginSteps {

    @Autowired
    public HomePage homePage;

    @Autowired
    public LoginPage loginPage;

    @Given("I click login Home Page")
    public void iClickLoginHomePage() {
        homePage.clickLogin();
    }

    @And("I enter the following for Login")
    public void iEnterTheFollowingForLogin(DataTable dataTable) {

        loginPage.login("admin", "password");
    }

    @And("I click login button")
    public void iClickLoginButton() {
        loginPage.clickLogin();
    }

    @Then("I should see the userform page")
    public void iShouldSeeTheUserformPage() {
        Assert.assertEquals(homePage.isEmployeeDetailsExist(), true);
    }
}
