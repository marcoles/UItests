package cucumber.testSteps;

import cucumber.TestContext;
import io.cucumber.java.After;

public class Hooks {
    TestContext testContext;

    public Hooks(TestContext context) {
        this.testContext = context;
    }

    @After
    public void closeDriver() {
        testContext.getWebDriverManager().getDriver().close();
    }
}
