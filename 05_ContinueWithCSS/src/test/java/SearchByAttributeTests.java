import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchByAttributeTests {


    private WebDriver driver;

    @Before
    public void setUp()
    {
        System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @After
    public void tearDown()
    {

        driver.quit();
    }
    private By email = By.cssSelector("[data ='email']");
    private By password = By.cssSelector("[data ='password one']");
    private By entrance = By.cssSelector("button#submit.form-submit");
    private By result = By.cssSelector("pre#error.form-error-password-email");
    private By mainHeaderPage = By.cssSelector("[for ='main-header-page']");
    private By requiredImportant = By.cssSelector("[important = '']");
    private By loginToYourPersonalAccount = By.cssSelector("h3[class*='title']");
    private By mailto = By.cssSelector("[href*='mailto']");
    private By header = By.cssSelector("[class^='header']");


    @Test
    public void CheckElements(){

        driver.navigate().to("https://qajava.skillbox.ru/module05/auth/index.html/");
        driver.findElement(email).sendKeys("@");
        driver.findElement(password).sendKeys("123");
        driver.findElement(entrance).click();
        Assert.assertTrue("Данные не отобразились на странице",driver.findElement(result).isDisplayed());
        Assert.assertEquals("Данные выведены некорректно","Некорректный email или пароль",driver.findElement(result).getText());
        driver.findElement(mainHeaderPage);
        driver.findElement(requiredImportant);
        driver.findElement(loginToYourPersonalAccount);
        driver.findElement(mailto);
        driver.findElement(header);





    }
}
