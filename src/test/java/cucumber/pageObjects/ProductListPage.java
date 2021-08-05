package cucumber.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductListPage {
    WebDriver driver;

    public ProductListPage(WebDriver driver){
        this.driver = driver;
    }

    public void selectProduct(String productName) {
        WebElement product = driver.findElement(By.xpath(String.format("//a[contains(text(), \"%s\")]", productName)));
        product.click();
    }
}
