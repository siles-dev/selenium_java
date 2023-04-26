package co.platform.sampleTest;

import co.platform.selenium.driver.Driver;
import org.openqa.selenium.WebDriver;

public class OpenBrowserTest {
    public static void main(String [] args) {
        //Use the driver class to set up testing browser
        Driver webDriver = new Driver("chrome","http://www.google.com");

        String actualTitle = webDriver.getWebDriver().getTitle();
        if (actualTitle.contentEquals("Google")){
            System.out.println("Test Passed! title matches \"Google\"");
        } else {
            System.out.println("Test Failed with " + actualTitle);
        }
        webDriver.cleanUp();
    }
}
