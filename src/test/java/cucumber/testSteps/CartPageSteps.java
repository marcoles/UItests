package cucumber.testSteps;

import cucumber.TestContext;
import io.cucumber.java.en.Then;
import cucumber.pageObjects.CartPage;

public class CartPageSteps {
    private TestContext testContext;
    private CartPage cartPage;

    public CartPageSteps(TestContext context){
        this.testContext = context;
        this.cartPage = testContext.getPageObjectManager().getCartPage();
    }
    @Then("the product should be in the cart")
    public void the_product_should_be_in_the_cart() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
