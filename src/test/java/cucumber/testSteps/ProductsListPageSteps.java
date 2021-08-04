package cucumber.testSteps;

import cucumber.TestContext;
import cucumber.pageObjects.ProductListPage;
import io.cucumber.java.en.When;

public class ProductsListPageSteps {
    private TestContext testContext;
    private ProductListPage productListPage;

    public ProductsListPageSteps(TestContext context) {
        this.testContext = context;
        this.productListPage = testContext.getPageObjectManager().getProductListPage();
    }
    @When("selects one of the listed products")
    public void selects_one_of_the_listed_products() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
