package co.platform.selenium.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Driver {
    protected WebDriver webDriver;

    public Driver(String browser, String url) {
        switch(browser) {
            case "safari":
                System.out.println("Need to configure safari driver");
            case "firefox":
                System.out.println("Need to configure firefox driver");
            default:
                //Defaults to chrome
                System.setProperty("webdriver.chrome.driver",System.getenv("CHROMEDRIVER_PATH"));
                ChromeOptions options = new ChromeOptions();
                options.addArguments("disable-blink-features=AutomationControlled");
                options.addArguments("--remote-allow-origins=*");
                options.addArguments("--disable-extensions");
                options.addArguments("disable-infobars");
                webDriver = new ChromeDriver(options);
        }

        webDriver.get(url);
    }

    public WebDriver getWebDriver() {
        return webDriver;
    }

    public void cleanUp() {
            webDriver.close();
        }
}

