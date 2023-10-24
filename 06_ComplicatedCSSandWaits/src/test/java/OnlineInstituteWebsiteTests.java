import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OnlineInstituteWebsite {


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

    /*Найдите все теги div, которые являются дочерними элементами любого уровня для элемента <div class="pageCreate__cards">. Подсказка для самоконтроля: их 72.*/
    private By element1 = By.cssSelector("div.pageCreate__cards div");

    /*Найдите все элементы, которые находятся на первом уровне вложенности для элемента <div class="baseFooter">. Подсказка для самоконтроля: их 2.*/
    private By element2 = By.cssSelector("div.baseFooter > *");

    /*Сначала укажите, что ищете <div class="pageCreate">, внутри которого на первом уровне вложенности ищете <div class="pageCreate__cards">, внутри которого ищете на любом уровне вложенности теги <img>. Подсказка для самоконтроля: их 8.*/
    private By element3 = By.cssSelector("div.pageCreate div.pageCreate__cards img");

    /*Найдите первый <div class="baseCard pageCreate__card">, внутри которого на любом уровне вложенности найдите теги <p>. Подсказка для самоконтроля: их 3.*/
    private By element4 = By.cssSelector("div.pageCreate__cards > div.baseCard.pageCreate__card:nth-of-type(1) p");

    /*Найдите все теги span на странице, у которых нет класса baseCard__title. Подсказка для самоконтроля: их 1.*/
    private By element5 = By.cssSelector("span:not(.baseCard__title)");

    /*Найдите все теги button, у которых нет атрибута disabled..*/
    private By element6 = By.cssSelector("button:not([disabled])");

    /*У четвёртого по счёту курса (то есть четвёртого элемента типа <div class="baseCard pageCreate__card">) найдите все дочерние элементы любого уровня с классом baseButton и без класса baseButton--noBorder одновременно. Подсказка для самоконтроля: всего 1 такой элемент.*/
    private By element7 = By.cssSelector("div.baseCard.pageCreate__card:nth-of-type(4)  .baseButton:not(.baseButton--noBorder)");



    @Test
    public void CheckElements(){

        driver.navigate().to("http://qa.skillbox.ru/module16/maincatalog/");
        driver.findElement(element1);
        driver.findElement(element2);
        driver.findElement(element3);
        driver.findElement(element4);
        driver.findElement(element5);
        driver.findElement(element6);
        driver.findElement(element7);

    }


}
