package HelpDesK;

import core.BaseSileniumPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FormPage extends BaseSileniumPage {
  //  @FindBy(xpath = "/html/body/div[5]/div/div/div[2]/div/table/tbody/tr[1]/td[2]")
  //  private static WebElement name;

    @FindBy(xpath = "/html/body/div[5]/div/div/div[2]/div/table/tbody/tr[2]/td[2]")
    private WebElement email;

    @FindBy(xpath = "/html/body/div[5]/div/div/div[2]/div/table/tbody/tr[3]/td[2]")
    private WebElement gender;

    @FindBy(xpath = "/html/body/div[5]/div/div/div[2]/div/table/tbody/tr[4]/td[2]")
    private WebElement number;

    @FindBy(xpath = "/html/body/div[5]/div/div/div[2]/div/table/tbody/tr[5]/td[2]")
    private WebElement subject;

    @FindBy(xpath = "/html/body/div[5]/div/div/div[2]/div/table/tbody/tr[7]/td[2]")
    private WebElement hobbies;

    @FindBy(xpath = "/html/body/div[5]/div/div/div[2]/div/table/tbody/tr[8]/td[2]")
    private WebElement picture;

    @FindBy(xpath = "/html/body/div[5]/div/div/div[2]/div/table/tbody/tr[9]/td[2]")
    private WebElement adress;

    @FindBy(xpath = "/html/body/div[5]/div/div/div[2]/div/table/tbody/tr[10]/td[2]")
    private WebElement satateCity;

    public  FormPage() {
        PageFactory.initElements(driver, this);
    }

    public String getEmail(){
        return email.getText();
    }
    public String getGender(){
        return gender.getText();
    }
    public String getNumber(){
        return number.getText();
    }
    public String getSubject(){
        return subject.getText();
    }
    public String getHobbies(){
        return hobbies.getText();
    }
    public String getPicture(){
        return picture.getText();
    }
    public String getAdress(){
        return adress.getText();
    }
    public String getStateCity(){
        return satateCity.getText();
    }

}
