import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchPageTests {


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

    private By element1 = By.cssSelector("[selected]");
    private By element2 = By.cssSelector(".filter-container >*");



    @Test
    public void CheckElements(){

        driver.navigate().to("https://qajava.skillbox.ru/search.html");
        driver.findElement(element1);
        driver.findElement(element2);


    }
}
