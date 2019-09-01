package Steps;

import Driver.DriverUtils;
import Pages.LoginPage;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.List;

//The class for step implementations

public class MySteps extends DriverUtils {

    private DriverUtils driver;

    public MySteps(DriverUtils driver) {
        this.driver=driver;
    }

    @Given("^Navigate to the main address$")
    public void navigateToAddress() {
        driver.Driver.navigate().to("http://www.demoqa.com/");
    }

    @Then("^I check if we see the following$")
    public void checkTable() {
        LoginPage page = new LoginPage(driver.Driver);
    }

    @And("^I click on the button Widgets$")
    public void clickWidgets() {
        LoginPage page = new LoginPage(driver.Driver);
        page.clickWidget();
    }

    @And("^I click on the Html contact form$")
    public void clickHtmlcontact() {
        LoginPage page = new LoginPage(driver.Driver);
        page.clickHtml();
    }

    @And("^I enter the following information$")
    public void enterInformation(DataTable table) {
        LoginPage page = new LoginPage(driver.Driver);
        List<List<String>> data = table.raw();
        page.getFistName().sendKeys(data.get(0).get(0));
        page.getLastName().sendKeys(data.get(0).get(1));
        page.getCountry().sendKeys(data.get(0).get(2));
        page.getSubject().sendKeys(data.get(0).get(3));
    }

    @And("^I click on the submit button$")
    public void clickSubmit() {
        LoginPage page = new LoginPage(driver.Driver);
        page.clickSubmit();
    }

    @Then("^I check for the displayed message$")
    public void messageDisplay() {
        LoginPage page = new LoginPage(driver.Driver);
        String msg = "Oops! That page can’t be found.";
        Assert.assertEquals(msg,page.Text());
    }
}
