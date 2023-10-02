import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchForLocatorsInYourPersonalAccountTests {

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

    private By element1 = By.cssSelector("div.footer__wrapper.baseContainer > div");
    private By element2 = By.cssSelector("main>*");
    private By element3 = By.cssSelector(".form-wrapper>h3.form-title + *");
    private By element4 = By.cssSelector(".footer__contacts>.footer__contactItem.descriptionText + *");


    @Test
    public void CheckElements(){

        driver.navigate().to("https://qajava.skillbox.ru/module05/auth/index.html/");
        driver.findElement(element1);
        driver.findElement(element2);
        driver.findElement(element3);
        driver.findElement(element4);



    }

}
