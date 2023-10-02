import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePageTests {


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

    private By element1 = By.cssSelector("[test-info='about-us']");
    private By element2 = By.cssSelector("a[href='']");
    private By element3 = By.cssSelector("div[Class='book-price']");
    private By element4 = By.cssSelector("button[class^='book']");
    private By element5 = By.cssSelector("[class$='main']");
    private By element6= By.cssSelector("a[class*='menu']");
    private By element7 = By.cssSelector("footer#footer> div");
    private By element8 = By.cssSelector("li#genres>*");



    @Test
    public void CheckElements(){

        driver.navigate().to("https://qajava.skillbox.ru/index.html");
        driver.findElement(element1);
        driver.findElement(element2);
        driver.findElement(element3);
        driver.findElement(element4);
        driver.findElement(element5);
        driver.findElement(element6);
        driver.findElement(element7);
        driver.findElement(element8);



    }
}
