package tests;

import helper.Browser;
import helper.TestHelper;
import org.testng.annotations.*;

/**
 * Created by opantsjoha on 02/07/2017.
 */
public class HomePageTests extends TestHelper {

    Browser browser;

    @BeforeClass(groups = {"web"})
    public void setUp(@Optional("chrome") @Parameters({"browserName"}) String browserName, @Optional("http://www.bbc.co.uk/") @Parameters({"baseUrl"}) String baseUrl) {
        browser = new Browser(browserName, baseUrl);
        browser.navigateToBaseUrl();
    }

    @Test(groups = {"web"})
    public void searchTest() throws InterruptedException {
        browser.HomePage().HeaderSection().setSearchField("Cooking");
        browser.HomePage().HeaderSection().clickOnSearchButton();
        // todo: add assert
    }

    @AfterClass(groups = {"web"})
    public void tearDown() {
        browser._driver.quit();
    }
}
