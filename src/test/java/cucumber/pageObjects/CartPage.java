package cucumber.pageObjects;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage {
    WebDriver driver;

    public CartPage(WebDriver driver){
        this.driver = driver;
    }

    public void checkIfProductIsInTheCart(String productName) {
        WebElement productText = driver.findElement(By.xpath(String.format("//a[contains(text(), \"%s\")]", productName)));
        Assert.assertTrue(productText.isDisplayed());
    }
}
