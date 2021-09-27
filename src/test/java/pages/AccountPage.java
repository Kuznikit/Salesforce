package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class AccountPage extends BasePage {

    public AccountPage(WebDriver driver) {
        super(driver);

    }

    public void open() {
        driver.get(ACCOUNT_URL);

    }

    public void createAccount(String accountName, String phone, String fax, String webSite, String employees,
                              String annualRevenue, String billingCity, String billingStateProvince,
                              String shippingCity, String shippingStateProvince, String billingZipPostalCode,
                              String billingCountry, String shippingZipPostalCode, String shippingCountry) {
        new Input(driver, "Account Name").write(accountName);
        new Input(driver, "Phone").write(phone);
        new Input(driver, "Fax").write(fax);
        new Input(driver, "Website").write(webSite);
        new Input(driver, "Employees").write(employees);
        new Input(driver, "Annual Revenue").write(annualRevenue);
        new Input(driver, "Billing State/Province").write(billingStateProvince);
        new Input(driver, "Billing City").write(billingCity);
        new Input(driver, "Shipping City").write(shippingCity);
        new Input(driver, "Shipping State/Province").write(shippingStateProvince);
        new Input(driver, "Billing Zip/Postal Code").write(billingZipPostalCode);
        new Input(driver, "Billing Country").write(billingCountry);
        new Input(driver, "Shipping Zip/Postal Code").write(shippingZipPostalCode);
        new Input(driver, "Shipping Country").write(shippingCountry);

    }

    public void createTextArea(String description, String shippingStreet, String billingStreet) {
        new TextArea(driver, "Description").write(description);
        new TextArea(driver, "Shipping Street").write(shippingStreet);
        new TextArea(driver, "Billing Street").write(billingStreet);

    }

    public void save() {
        driver.findElement(By.xpath("//button[@title='Save']")).click();

    }
}
