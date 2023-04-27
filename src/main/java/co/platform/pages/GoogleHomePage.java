package co.platform.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GoogleHomePage extends BasePage {

    public GoogleHomePage(WebDriver webDriver) {
        super(webDriver);
    }

    //Page elements
    @FindBy(name = "q")
    private WebElement searchTextBox;

    @FindBy(xpath = "/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]")
    private WebElement googleSearchButton;

    @FindBy(id = "result-stats")
    private WebElement resultStats;

    //Page actions
    public void enterTextToSearch(String query) {
        searchTextBox.sendKeys(query);
    }

    public void clickSearchButton() {
        googleSearchButton.click();
    }

    public String getPageTitle() {
        return webDriver.getTitle();
    }

    //Page validations
    public boolean isResultsVisible() {
        return resultStats.isDisplayed();
    }

    public boolean isTitleCorrectPass(String pageTitle) {
        return pageTitle.equals("Google");
    }
    public boolean isTitleCorrectFail(String pageTitle) {
        return pageTitle.equals("Wrong String");
    }
}
