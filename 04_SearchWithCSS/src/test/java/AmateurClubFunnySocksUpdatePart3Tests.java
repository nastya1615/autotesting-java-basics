import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmateurClubFunnySocksUpdatePart3Tests {


    /* В этом классе можете описать тесты для домашнего задания */

    private static WebDriver driver;

    @BeforeClass
    static public void setUp(){

        System.setProperty("webdriver.chrom.driver","drivers\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @AfterClass
    static public void tearDown(){

        driver.quit();
    }

    private By email = By.cssSelector("input.form-input.input-data");
    private By password = By.cssSelector("input.form-input.password");
    private By entrance = By.cssSelector("button.form-submit");
    private By result = By.cssSelector("pre.form-error-password-email");

    @Test
    public void bookShopFindTheFeedbackLink(){

        driver.navigate().to("https://qajava.skillbox.ru/module04/homework/auth/changed.html");
        driver.findElement(email).sendKeys("@");
        driver.findElement(password).sendKeys("123");
        driver.findElement(entrance).click();
        Assert.assertTrue("Данные не отобразились на странице",driver.findElement(result).isDisplayed());
        Assert.assertEquals("Данные выведены некорректно","Некорректный email или пароль",driver.findElement(result).getText());



    }
}
