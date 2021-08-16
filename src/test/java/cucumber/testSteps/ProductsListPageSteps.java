package cucumber.testSteps;

import cucumber.TestContext;
import cucumber.pageObjects.ProductListPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class ProductsListPageSteps {
    private TestContext testContext;
    private ProductListPage productListPage;

    public ProductsListPageSteps(TestContext context) {
        this.testContext = context;
        this.productListPage = testContext.getPageObjectManager().getProductListPage();
    }

    @And("selects the first product with {string} in its name")
    public void selectsTheFirstProductWithInItsName(String product) {
        productListPage.selectProduct(product);
    }
}

