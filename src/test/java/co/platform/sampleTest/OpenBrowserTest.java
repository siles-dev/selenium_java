package co.platform.sampleTest;

import co.platform.pages.GoogleHomePage;
import co.platform.selenium.driver.Driver;
import com.google.common.base.Verify;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class OpenBrowserTest {
    private Driver webDriver;
    private GoogleHomePage googleHomePage;

    @BeforeClass
    public void initBrowser() {
        webDriver = new Driver("chrome","http://www.google.com");
        googleHomePage = new GoogleHomePage(webDriver.getWebDriver());
    }

    //Adding `priority` since default order is alphabetical, and we want the failed assertion to be executed first
    @Test(priority = 0)
    public void verifyTypeAssertionTest() {
        Verify.verify(googleHomePage.getPageTitle().equals("Wrong String"),
                "The test will continue although test failed with this `verify` assertion");
    }

    @Test(priority = 1)
    public void assertTypeAssertionPassTest() {
        Assert.assertEquals(googleHomePage.getPageTitle(),"Puppies - Google Search");
    }

    @Test
    public void searchContent(){
        googleHomePage.enterTextToSearch("Puppies");
        googleHomePage.clickSearchButton();
        Verify.verify(googleHomePage.isResultsVisible());
    }

    @AfterClass
    public void tearDown() {
        webDriver.cleanUp();
    }
}
