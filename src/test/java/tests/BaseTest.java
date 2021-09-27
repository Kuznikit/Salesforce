package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.ITestListener;
import org.testng.annotations.*;
import pages.AccountPage;
import pages.LoginPage;

import java.util.concurrent.TimeUnit;

//@Listeners(ITestListener.class)
public class BaseTest {
    protected WebDriver driver;
    LoginPage loginPage;
    AccountPage accountPage;

    @Parameters("browser")
    @BeforeMethod
    public void setup(@Optional("chrome") String browser) {
        if (browser.equals("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if (browser.equals("opera")) {
            WebDriverManager.operadriver().setup();
            driver = new OperaDriver();
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        loginPage = new LoginPage(driver);
        accountPage = new AccountPage(driver);
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        // driver.quit();
    }


}
