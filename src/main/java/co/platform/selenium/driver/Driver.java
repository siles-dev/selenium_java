package co.platform.selenium.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Driver {

    public static void main( String [] args) {
        WebDriver webDriver;

        System.setProperty("webdriver.chrome.driver",System.getenv("CHROMEDRIVER_PATH"));
        ChromeOptions options = new ChromeOptions();
        options.addArguments("disable-blink-features=AutomationControlled");
        options.addArguments("--remote-allow-origins=*");
        webDriver = new ChromeDriver(options);
        webDriver.get("http://www.google.com");
        String actualTitle = webDriver.getTitle();
        if (actualTitle.contentEquals("Google")){
            System.out.println("Test Passed! title matches \"Google\"");
        } else {
            System.out.println("Test Failed with " + actualTitle);
        }
        webDriver.close();
    }
}
