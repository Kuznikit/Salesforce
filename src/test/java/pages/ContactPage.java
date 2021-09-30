package pages;

import org.openqa.selenium.WebDriver;

public class ContactPage extends BasePage {

    public ContactPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public ContactPage open() {
        driver.get(BASE_URL + "/lightning/o/Contact/list?filterName=Recent");
        return this;
    }
}
