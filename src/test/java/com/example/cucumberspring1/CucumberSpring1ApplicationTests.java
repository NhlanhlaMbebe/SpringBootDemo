package com.example.cucumberspring1;

import com.example.cucumberspring1.pages.MainPage;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Profile;

import java.util.List;

@SpringBootTest
@Profile("qa")
class CucumberSpring1ApplicationTests {

    @Autowired
    private MainPage mainPage;

    @Value("${app.url}")
    private String environment;

    @Value("chrome,firefox,edge")
    private List<String> browsers;

    @Test
    void contextLoads() {


        browsers.stream().forEach(s -> System.out.println(s));
        System.out.println(environment);
        //mainPage.navigate();
        mainPage.performLogin();
    }

}
