package cucumber.testSteps;

import cucumber.TestContext;
import cucumber.pageObjects.ConfirmationPage;
import cucumber.pageObjects.ProductPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

import java.util.concurrent.TimeUnit;

public class ProductPageSteps {
    private TestContext testContext;
    private ProductPage productPage;

    public ProductPageSteps(TestContext context) {
        this.testContext = context;
        this.productPage = testContext.getPageObjectManager().getProductPage();
    }

    @And("adds that product to the cart")
    public void addsThatProductToTheCart() {
        productPage.addToCart();
        productPage.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        ConfirmationPage confirmationPage = testContext.getPageObjectManager().getConfirmationPage();
        confirmationPage.goToCart();
    }
}

