package HelpDesK;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import core.BaseTest;
import org.checkerframework.checker.units.qual.A;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HelpDeskTest extends BaseTest {

    @Test
    public void checkTest() throws InterruptedException {
    MainPage mainPage = new MainPage();
        mainPage.createForm(TestValues.TEST_FIRSTNAME,
        TestValues.TEST_SECONDNAME,
        TestValues.TEST_EMAIL,
        TestValues.TEST_USERNUMBER,
        TestValues.TEST_ADRESS,
        TestValues.TEST_IMAGE);
        WebElement name = driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div/table/tbody/tr[1]/td[2]"));
        Assert.assertEquals(name.getText(), TestValues.TEST_NAME);
        WebElement email = driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div/table/tbody/tr[2]/td[2]"));
        Assert.assertEquals(email.getText(), TestValues.TEST_EMAIL);
        WebElement gender = driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div/table/tbody/tr[3]/td[2]"));
        Assert.assertEquals(gender.getText(), TestValues.TEST_GENDER);
        WebElement mobile = driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div/table/tbody/tr[4]/td[2]"));
        Assert.assertEquals(mobile.getText(), TestValues.TEST_USERNUMBER);
        WebElement subject = driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div/table/tbody/tr[6]/td[2]"));
        Assert.assertEquals(subject.getText(), TestValues.TEST_SUBJECT);
        WebElement dateOfBirth = driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div/table/tbody/tr[5]/td[2]"));
        Assert.assertEquals(dateOfBirth.getText(), TestValues.TEST_DATEOFBIRTHDAY);
        WebElement hobies = driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div/table/tbody/tr[7]/td[2]"));
        Assert.assertEquals(hobies.getText(),TestValues.TEST_HOBBIES);
        WebElement pictures = driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div/table/tbody/tr[8]/td[2]"));
        Assert.assertEquals(pictures.getText(), TestValues.TEST_PICTURE);
        WebElement address = driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div/table/tbody/tr[9]/td[2]"));
        Assert.assertEquals(address.getText(), TestValues.TEST_ADRESS);
        WebElement stateAndCity = driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div/table/tbody/tr[10]/td[2]"));
        Assert.assertEquals(stateAndCity.getText(), TestValues.TEST_STATEANDCITY);


    }
}