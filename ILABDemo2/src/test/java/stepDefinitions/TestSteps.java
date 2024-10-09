package stepDefinitions;

import PageObjects.HomePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.concurrent.TimeUnit;

public class TestSteps {

    WebDriver driver;
    HomePage home;

    @Given("^user navigate to the home page")
    public void user_navigate_to_the_home_page()
    {
        System.setProperty("webdriver.edge.driver","C:\\Users\\nb333343\\driver\\msedgedriver.exe"); //Will read the path and save driver inside the project itself  - Nkosinathi Jiyane
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        try
        {
            home.navigateTo_HomePage(); //invoking method from HomePage Object
            wait(2);
        }
        catch(Exception error)
        {
            System.out.print("Error " + error);
        }
    }
    @When("^click on the location dropdown$")
    public void click_on_the_location_dropdown()
    {
        try
        {
            home.selectAndClickLocation();
            wait(2);
        }
        catch(Exception error)
        {
            System.out.print("Error " + error);
        }
    }
    @Then("^click search button$")
    public void click_search_button()
    {
        try
        {
            home.clickSearchButton();
            wait(2);
        }
        catch(Exception error)
        {
            System.out.print("Error " + error);
        }

    }
    @And("^check if the selected and search location if found$")
    public void check_if_the_selected_and_search_location_if_found()
    {
        try
        {
            home.verifyValue();
            wait(2);
            home.closeBrowser();
        }
        catch(Exception error)
        {
            System.out.print("Error " + error);
        }
    }
}
