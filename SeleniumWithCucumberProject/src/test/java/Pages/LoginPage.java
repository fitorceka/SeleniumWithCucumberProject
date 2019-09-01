package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

//The class for all WebElements

public class LoginPage {
    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }
    public LoginPage() {
    }

    @FindBy(how = How.XPATH,using = "//ul[@id='menu-top']/li/a")
    public WebElement table;
    @FindBy(how = How.XPATH,using = "//ul[@id='menu-top']/li[3]/a")
    public WebElement widgets;
    @FindBy(how = How.XPATH,using = "//div[@id='content']/div[2]/ul/li[1]/a")
    public WebElement htmlContact;
    @FindBy(how = How.CLASS_NAME,using = "firstname")
    public WebElement firstName;
    @FindBy(how = How.ID,using = "lname")
    public WebElement lastName;
    @FindBy(how = How.NAME,using = "country")
    public WebElement country;
    @FindBy(how = How.ID,using = "subject")
    public WebElement subject;
    @FindBy(how = How.XPATH,using = "//textarea/following-sibling::input")
    public WebElement submit;
    @FindBy(how = How.XPATH,using = "//main/div/header/h1")
    public WebElement text;

    public void clickWidget() {
        widgets.click();
    }
    public void clickHtml() {
        htmlContact.click();
    }
    public WebElement getFistName() {
        return firstName;
    }
    public WebElement getLastName() {
        return lastName;
    }
    public WebElement getCountry() {
        return country;
    }
    public WebElement getSubject() {
        return subject;
    }
    public void clickSubmit() {
        submit.click();
    }
    public String Text() {
        return text.getText();
    }
}
