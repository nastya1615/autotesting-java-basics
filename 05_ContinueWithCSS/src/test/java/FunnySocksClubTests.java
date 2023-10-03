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

    /*Первый тег h1, находящийся сразу на первом уровне вложенности внутри <section class="important-section-block" for="main-header-page">. Используйте поиск по первому child.*/
    private By element1 = By.cssSelector(".important-section-block > h1:first-child");
    /*Последний тег p, находящийся сразу на первом уровне вложенности внутри <form class="form" id="login-form">. Используйте поиск по child.*/
    private By element2 = By.cssSelector("form#login-form > *:last-child");
    /*Любой тег, который является третьим дочерним элементом первого уровня тега <body>. Используйте поиск по child.*/
    private By element3 = By.cssSelector("body > *:nth-of-type(3)");
    /*Все элементы с тегом <a>, которые являются первым элементом своего родителя <div class="footer__menuList">. Используйте поиск по type.*/
    private By element4 = By.cssSelector(".footer__menuList > a:nth-of-type(1)");
    /*По желанию: найдите элемент с тегом <a>, который является первым дочерним элементом данного типа у своего родителя <div class="footer__menuList">, при этом <div class="footer__menuList"> является первым дочерним элементом у своего родителя <div class="footer__menu">. Составленный поиск должен вернуть ровно один найденный элемент.*/
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
