package core;

import org.openqa.selenium.WebDriver;

public abstract class BaseSileniumPage {
    protected static WebDriver driver;
     public static void setDriver(WebDriver webdriver){
          driver = webdriver;
     }
}
