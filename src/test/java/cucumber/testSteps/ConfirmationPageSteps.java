package cucumber.testSteps;

import cucumber.TestContext;
import cucumber.pageObjects.ConfirmationPage;

public class ConfirmationPageSteps {
    private TestContext testContext;
    private ConfirmationPage confirmationPage;

    public ConfirmationPageSteps(TestContext context){
        this.testContext = context;
        this.confirmationPage = testContext.getPageObjectManager().getConfirmationPage();
    }
}
