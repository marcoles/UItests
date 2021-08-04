package cucumber.testSteps;

import cucumber.TestContext;
import cucumber.pageObjects.ProductPage;
import io.cucumber.java.en.When;

public class ProductPageSteps {
    private TestContext testContext;
    private ProductPage productPage;

    public ProductPageSteps(TestContext context) {
        this.testContext = context;
        this.productPage = testContext.getPageObjectManager().getProductPage();
    }
    @When("adds the product to the cart")
    public void adds_the_product_to_the_cart() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
