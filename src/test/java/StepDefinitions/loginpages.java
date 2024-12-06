package StepDefinitions;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginpages {
    WebDriver driver;

    @Given("lanching the chrome browser and land on swag Lags")
    public void lanching_the_chrome_browser_and_land_on_swag_lags() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        Thread.sleep(2000);
    }

    @When("^enter the (.*) and (.*)$")
    public void enter_the_standard_user_and_secret_sauce(String username, String password) throws InterruptedException {
        driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(username);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
    }

    @When("click on the login button")
    public void click_on_the_login_button() throws InterruptedException {
        driver.findElement(By.xpath("//input[@id='login-button']")).click();
        Thread.sleep(2000);
    }

    @Then("close the browser")
    public void close_the_browser() {
        driver.quit();
    }
}
