package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class LoginTest extends BaseTest {
    @Test(description = "Login should work")
    public void validLogin() {
        loginPage.open();
        loginPage.login("kuznikit-lwbx@force.com", "Qazxcv123");
        //WebDriverWait wait = new WebDriverWait(driver, 10);
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@title='Search...']")));
        String search = driver.findElement(By.xpath("//span[@class='assistiveText']")).getText();
        assertEquals(search, "Search...", "page didn't open ");

    }
}

