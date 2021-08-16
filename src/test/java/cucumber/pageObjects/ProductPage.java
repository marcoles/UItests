package cucumber.pageObjects;

import lombok.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

@Getter
public class ProductPage {
    WebDriver driver;

    public ProductPage(WebDriver driver){
        this.driver = driver;
    }

    public void addToCart() {
        WebElement addToCartButton = driver.findElement(By.xpath("//button[@id=\"add-to-cart-button\"]"));
        addToCartButton.click();
    }
}
