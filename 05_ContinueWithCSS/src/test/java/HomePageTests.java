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

    /*Локаторы на главной странице для элемента <a href="" test-info="about-us">О магазине</a>. Осуществите поиск только по атрибуту test-info, равному about-us.*/
    private By element1 = By.cssSelector("[test-info='about-us']");
    /*Локатор на главной странице для всех элементов с тегом a и с атрибутом href с пустым значением, то есть равным «».*/
    private By element2 = By.cssSelector("a[href='']");
    /*Локатор на главной странице для элемента <div class="book-price">. Осуществите поиск одновременно по тегу и классу, равному book-price.*/
    private By element3 = By.cssSelector("div[Class='book-price']");
    /*Локатор на главной странице  для всех элементов с тегом button и с атрибутом class, начинающимся на book.*/
    private By element4 = By.cssSelector("button[class^='book']");
    /*Локатор на главной странице для всех элементов, у которых атрибут class заканчивается на main.*/
    private By element5 = By.cssSelector("[class$='main']");
    /*Локатор на главной странице для всех элементов с тегом a и с атрибутом class, содержащим в себе слово menu.*/
    private By element6= By.cssSelector("a[class*='menu']");
    /*На главной странице найдите все теги div, которые являются дочерними элементами первого уровня у элемента <footer id="footer">.*/
    private By element7 = By.cssSelector("footer#footer> div");
    /*На главной странице найдите любой тег, который расположен сразу после <li id="genres">.*/
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
