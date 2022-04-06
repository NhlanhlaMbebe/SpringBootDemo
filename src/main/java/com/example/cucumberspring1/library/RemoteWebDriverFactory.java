package com.example.cucumberspring1.library;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.Scope;

import java.net.MalformedURLException;
import java.net.URL;

@Configuration
@Profile("remote")
public class RemoteWebDriverFactory {

    @Value("${grid.url}")
    private String gridUrl;

    @Bean
    @ConditionalOnProperty(name = "browser", havingValue = "chrome")
    @Scope("driverscope")
    public WebDriver getRemoteWebDriverForChrome() throws MalformedURLException {
        return new RemoteWebDriver(new URL(gridUrl), DesiredCapabilities.chrome());
    }

    @Bean
    @ConditionalOnProperty(name = "browser", havingValue = "firefox")
    @Scope("driverscope")
    public WebDriver getRemoteWebDriverForFireFox() throws MalformedURLException {
        return new RemoteWebDriver(new URL(gridUrl), DesiredCapabilities.firefox());
    }
}
