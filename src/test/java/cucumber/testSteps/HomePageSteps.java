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
    public void user_is_on_the_home_page(String string) {
        MatcherAssert.assertThat(homePage);
    }
    @Given("has cookies accepted")
    public void has_cookies_accepted() {

    }
    @When("User searches for a PS5")
    public void user_searches_for_a_ps5() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
