package cucumber.testSteps;

import cucumber.TestContext;
import io.cucumber.java.en.Then;
import cucumber.pageObjects.CartPage;
import org.openqa.selenium.WebElement;

public class CartPageSteps {
    private TestContext testContext;
    private CartPage cartPage;

    public CartPageSteps(TestContext context){
        this.testContext = context;
        this.cartPage = testContext.getPageObjectManager().getCartPage();
    }

    @Then("the {string} should be in the cart")
    public void theShouldBeInTheCart(String product) {
        cartPage.checkIfProductIsInTheCart(product);
    }
}
