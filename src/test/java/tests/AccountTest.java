package tests;

import models.Account;
import models.AccountFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import pages.AccountPage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class AccountTest extends BaseTest {
    @Test(description = "Login should work")
    public void validLogin() {
        boolean isOpened = loginPage
                .open()
                .login("kuznikit-lwbx@force.com", "Qazxcv123")
                .isOpened();
        assertTrue(isOpened, "Home page wasn't opened");

        accountPage
                .open()
                .clickNew();
        Account account = AccountFactory.get();
        accountPage.createAccount(account);

        new AccountPage(driver).createTextArea(
                "description",
                "Street2",
                "Street1");
        new AccountPage(driver).createDropDown(
                "Analyst",
                "Banking");

        accountPage.clickSave();
        String addNewAccount = driver.findElement(By.xpath("//a[@aria-controls='tab-3']")).getText();
        assertEquals(addNewAccount, "Details", "Account didn't add");

    }

}
