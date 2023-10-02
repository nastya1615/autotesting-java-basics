import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FunnySocksClubTests {


    /* В этом классе можете описать тесты для домашнего задания */

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

    private By element1 = By.cssSelector(".important-section-block > h1:first-child");
    private By element2 = By.cssSelector("form#login-form > *:last-child");
    private By element3 = By.cssSelector("body > *:nth-of-type(3)");
    private By element4 = By.cssSelector(".footer__menuList > a:nth-of-type(1)");
    private By element5 = By.cssSelector("a.footer__menuItem.descriptionText");


    @Test
    public void CheckElements(){

        driver.navigate().to("https://qajava.skillbox.ru/module05/auth/index.html/");
        driver.findElement(element1);
        driver.findElement(element2);
        driver.findElement(element3);
        driver.findElement(element4);
        driver.findElement(element5);


    }
}
