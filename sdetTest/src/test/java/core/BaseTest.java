package core;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public abstract class BaseTest {
protected WebDriver driver;

    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(360, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(360, TimeUnit.SECONDS);
        BaseSileniumPage.setDriver(driver);

    }
    @After
    public void close(){

       driver.close(); //закрытие вебдрайвера
        driver.quit(); //закрытие браузера
    }
}
