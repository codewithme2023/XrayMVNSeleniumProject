package featureSteps;

import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import utility.BrowserDriver;


public class LoginSteps {

    private WebDriver driver;

    public LoginSteps() {
        driver = BrowserDriver.getDriver();
    }


    @Given("User is on the login page")
    public void User_is_on_the_login_page() {

        driver.get("http://the-internet.herokuapp.com/login");
        System.out.println("Hello World");
    }
}




