package cucumber;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@Getter
public class WebDriverManager {
    private WebDriver driver;

    public WebDriverManager() {
        System.setProperty("webdriver.chrome.driver", "/Users/moles/Desktop/chromedriver/chromedriver");
        driver = new ChromeDriver();
    }
}
