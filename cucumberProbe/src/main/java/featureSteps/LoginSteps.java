package featureSteps;

import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginSteps {
    @Given("User is on the login page")
    public void User_is_on_the_login_page() {
        WebDriver driver;
        System.setProperty("webdriver.gecko.driver","drivers/geckodriver.exe");
        driver = new FirefoxDriver();
        driver.get("http://the-internet.herokuapp.com/login");
        System.out.println("Hello World");
    }
}
