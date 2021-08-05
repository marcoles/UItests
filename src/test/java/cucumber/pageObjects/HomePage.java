package cucumber.pageObjects;

import lombok.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

@Getter
public class HomePage {
    WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public void searchForItem(String itemName) {
        WebElement searchBox = driver.findElement(By.xpath("//input[@data-role=\"search-input\"]"));
        searchBox.sendKeys(itemName + Keys.ENTER);
    }

    public void acceptCookies() {
        WebElement acceptButton = driver.findElement(By.xpath("//button[contains(text(), \"Ok,\")]"));
        acceptButton.click();
    }
}
