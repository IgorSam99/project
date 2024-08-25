package com.demoqa;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest extends WebDriverSettings{

    @Test
public void  firstTest() {
        //проверка открытия нужной страницы
            driver.get("https://demoqa.com/automation-practice-form");
            String title = driver.getTitle();
        Assert.assertTrue(title.equals("DEMOQA"));

    }

}
