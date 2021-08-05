package cucumber.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ConfirmationPage {
    WebDriver driver;

    public ConfirmationPage(WebDriver driver){
        this.driver = driver;
    }

    public void goToCart() {
        WebElement goToCartButton = driver.findElement(By.xpath("//a[@data-analytics-click-label=\"goToCart\"]"));
        goToCartButton.click();
    }
}
