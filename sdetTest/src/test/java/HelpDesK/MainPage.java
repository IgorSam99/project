package HelpDesK;
import core.BaseSileniumPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import javax.xml.xpath.XPath;

public class MainPage extends BaseSileniumPage {
    @FindBy(xpath = "//*[@id=\"firstName\"]")
    private  WebElement firstName;

    @FindBy(xpath = "//*[@id=\"lastName\"]")
    private WebElement lastName;

    @FindBy(xpath = "//*[@id=\"userEmail\"]")
    private WebElement eMail;

    @FindBy(xpath = "//*[@id=\"genterWrapper\"]/div[2]/div[1]/label")
    private WebElement genteRwrapper;

    @FindBy(xpath = "//*[@id=\"userNumber\"]")
    private WebElement userNumber;

    @FindBy(xpath = "//*[@id=\"dateOfBirthInput\"]")
    private WebElement dateOfBirthInput;

    @FindBy(xpath = "//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[2]/div[3]/div[4]")
    private WebElement dateOfBirthValue;

   @FindBy(xpath = "//*[@id=\"subjectsContainer\"]/div/div[1]")
   private WebElement sub;

   @FindBy(xpath = "//*[@id=\"subjectsContainer\"]/div/div[1]/div[1]/div[1]")
   private  WebElement subClick;

   @FindBy(xpath = "//*[@id=\"hobbiesWrapper\"]/div[2]/div[2]/label")
   private WebElement reading;

   @FindBy(xpath = "//*[@id=\"hobbiesWrapper\"]/div[2]/div[1]/label")
   private WebElement sport;

  @FindBy(xpath = "//*[@id=\"uploadPicture\"]")
   private WebElement uploadPicture;
  @FindBy(xpath = "//*[@id=\"currentAddress\"]")
  private WebElement cerrentAdres;

  @FindBy(xpath = "//*[@id=\"stateCity-wrapper\"]/div[3]")
  private WebElement city;

  @FindBy(xpath = "//*[@id=\"uploadPicture\"]")
  private WebElement image;

  @FindBy(xpath = "//*[@id=\"submit\"]")
  private WebElement button;

  @FindBy(id = "state")
  private WebElement state;

  @FindBy(id = "react-select-3-option-1")
  private WebElement stateValue;

  @FindBy(id = "city")
  private WebElement sity;

  @FindBy(id = "react-select-4-option-2")
  private  WebElement cityValue;

  @FindBy(id = "subjectsInput")
  private  WebElement subject;

  @FindBy(id = "react-select-2-option-0")
  private WebElement maths;


    public MainPage() {
        driver.get("https://demoqa.com/automation-practice-form");
        PageFactory.initElements(driver, this);
    }
public MainPage createForm (String firstNameValue, String lastNameValue, String eMailValue, String userNumberValue,
        String currentAdresValue,String imageValue){
    firstName.sendKeys(firstNameValue);
    lastName.sendKeys(lastNameValue);
    eMail.sendKeys(eMailValue);
    genteRwrapper.click();
    userNumber.sendKeys(userNumberValue);
    dateOfBirthInput.click();
    dateOfBirthValue.click();
    reading.click();
    sport.click();
    image.sendKeys(imageValue);
    cerrentAdres.sendKeys(currentAdresValue);
    state.click();
    stateValue.click();
    sity.click();
    cityValue.click();
    subject.click();
    subject.sendKeys("Maths");
    maths.click();
    button.click();

    return this;
}

}
