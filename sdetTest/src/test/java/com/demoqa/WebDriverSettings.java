package com.demoqa;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverSettings {
    public ChromeDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chrome-win64\\chromedriver.exe");
        driver = new ChromeDriver();
    }
    @After
    public void close(){
        driver.quit();
    }
}
