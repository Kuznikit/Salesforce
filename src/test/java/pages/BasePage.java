package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BasePage {
    public static final String BASE_URL = "https://knn.my.salesforce.com/";
    public static final String ACCOUNT_URL = BASE_URL + "lightning/o/Account/list?filterName=Recent";
    WebDriver driver;
    WebDriverWait wait;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 10);
    }

    public abstract BasePage open();

}
