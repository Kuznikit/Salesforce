package tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pages.AccountPage;

import static org.testng.Assert.assertEquals;

public class AccountTest extends BaseTest {
    @Test(description = "Login should work")
    public void validLogin() {
        loginPage.open();
        loginPage.login("kuznikit-lwbx@force.com", "Qazxcv123");
        accountPage.open();
        driver.findElement(By.cssSelector("[title=New]")).click();
        new AccountPage(driver).createAccount(
                "Mikita Kuzminich",
                "+375444444444",
                "80174444444",
                "https://knn.lightning.force.com/",
                "10",
                "1",
                "Minsk",
                "Minsk",
                "Minsk",
                "Province",
                "12345",
                "54321",
                "123123",
                "Belarus");
        new AccountPage(driver).createTextArea(
                "description",
                "Street2",
                "Street1");
        accountPage.save();
        String addNewAccount = driver.findElement(By.xpath("//span[@class='custom-truncate uiOutputText']")).getText();
        assertEquals(addNewAccount, "Mikita Kuzminich", "Account didn't add");
    }

}
