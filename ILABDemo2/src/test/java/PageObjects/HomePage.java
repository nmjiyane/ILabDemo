package PageObjects;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void selectAndClickLocation() {
        driver.findElement(By.id("location")).click(); //find and click location dropdown item
    }
    public void clickSearchButton() {
        driver.findElement(By.id("searchBtn")).click(); //find and click on the button search
    }
    public boolean verifyValue() {

        boolean checkLocation = driver.findElement(By.id("searchBtn")).isDisplayed(); //check if the search location is present / visible. If present return true else false
        if(checkLocation == true)
        {
            Assert.assertTrue("Searched location is visible",checkLocation);
        }
        else
        {
            Assert.assertFalse("Searched location is visible",checkLocation);
        }
        return checkLocation;
    }
    public void navigateTo_HomePage() {
        driver.get("https://adactinhotelapp.com/index.php"); // here I naviget to the URL and will also call this method on TestSteps class. OOP concept
    }
    public void closeBrowser() {
        driver.quit(); //close your driver instance here
    }
}
