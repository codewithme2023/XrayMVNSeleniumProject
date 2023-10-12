package allsteps;

import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class test1 {
    @Given("Gehe zur demoqa Website")
    public void gehe_zur_demoqa_website() {
        WebDriver driver;
        System.setProperty("webdriver.gecko.driver","drivers/geckodriver.exe");
        driver = new FirefoxDriver();
        driver.get("https://www.google.com/");
    }
}
