package cucumber;

import cucumber.pageObjects.*;
import org.openqa.selenium.WebDriver;

public class PageObjectManager {
    private final WebDriver driver;
    private CartPage cartPage;
    private ConfirmationPage confirmationPage;
    private HomePage homePage;
    private ProductPage productPage;
    private ProductListPage productListPage;

    public PageObjectManager(WebDriver driver){
        this.driver = driver;
    }

    public HomePage getHomePage(){
        return (homePage == null) ? homePage = new HomePage(driver) : homePage;
    }

    public ProductListPage getProductListPage() {
        return (productListPage == null) ? productListPage = new ProductListPage(driver) : productListPage;
    }

    public CartPage getCartPage() {
        return (cartPage == null) ? cartPage = new CartPage(driver) : cartPage;
    }

    public ProductPage getProductPage() {
        return (productPage == null) ? productPage = new ProductPage(driver) : productPage;
    }

    public ConfirmationPage getConfirmationPage() {
        return (confirmationPage == null) ? confirmationPage = new ConfirmationPage(driver) : confirmationPage;
    }
}
