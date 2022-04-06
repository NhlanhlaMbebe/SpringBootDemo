package com.example.cucumberspring1;

import com.example.cucumberspring1.pages.MainPage;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

@SpringBootTest
public class SpringTestNGTest_Dup extends AbstractTestNGSpringContextTests {

    @Autowired
    private WebDriver driver;

    @Value("${app.url}")
    private String url;

    @Autowired
    private MainPage mainPage;

    @BeforeClass(alwaysRun = true)
    @BeforeSuite
    @Override
    protected void springTestContextPrepareTestInstance() throws Exception {
        super.springTestContextPrepareTestInstance();
    }

    @BeforeTest
    protected void setUpWebDriver() {
        driver.navigate().to(url);
    }

    @Test
    public void testLogin() {
        mainPage.performLogin();
    }
}
