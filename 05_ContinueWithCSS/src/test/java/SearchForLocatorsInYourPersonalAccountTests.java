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
    /*все теги div, которые являются дочерними элементами первого уровня у элемента <div class="footer__wrapper baseContainer">;*/
    private By element1 = By.cssSelector("div.footer__wrapper.baseContainer > div");
    /*любой тег, который расположен сразу после <main>;*/
    private By element2 = By.cssSelector("main>*");
    /*любой тег, который расположен после <h3 class="form-title">Вход в личный кабинет</h3> (необязательно ближайший сосед);*/
    private By element3 = By.cssSelector(".form-wrapper>h3.form-title + *");
    /*любой тег, который расположен сразу после <div class="footer__contactItem descriptionText">*/
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
