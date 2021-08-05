package cucumber.testSteps;

import cucumber.TestContext;
import cucumber.pageObjects.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.hamcrest.MatcherAssert;

public class HomePageSteps {
    private TestContext testContext;
    private HomePage homePage;

    public HomePageSteps(TestContext context) {
        this.testContext = context;
        this.homePage = testContext.getPageObjectManager().getHomePage();
    }

    @Given("User is on the home page {string}")
    public void userIsOnTheHomePage(String string) {
        homePage.getDriver().get(string);
    }

    @Given("has cookies accepted")
    public void has_cookies_accepted() {
        homePage.acceptCookies();
    }

    @When("User searches for a {string}")
    public void userSearchesForAPS(String string) {
        homePage.searchForItem(string);
    }
}

