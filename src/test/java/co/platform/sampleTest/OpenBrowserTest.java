package co.platform.sampleTest;

import co.platform.selenium.driver.Driver;
import com.google.common.base.Verify;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class OpenBrowserTest {
    private Driver webDriver;

    @BeforeClass
    public void initBrowser() {
        webDriver = new Driver("chrome","http://www.google.com");
    }

    //Adding `priority` since default order is alphabetical, and we want the failed assertion to be executed first
    @Test(priority = 0)
    public void verifyTypeAssertionTest() {
        String actualTitle = webDriver.getWebDriver().getTitle();
        Verify.verify(actualTitle.equals("Wrong String"),
                "The test will continue although test failed with this `verify` assertion");
    }

    @Test(priority = 1)
    public void assertTypeAssertionPassTest() {
        String actualTitle = webDriver.getWebDriver().getTitle();
        Assert.assertEquals(actualTitle,"Google");
    }

    @AfterClass
    public void tearDown() {
        webDriver.cleanUp();
    }
}
