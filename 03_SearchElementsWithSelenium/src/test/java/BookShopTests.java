import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class BookShopTests {


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
    @Test
    public void bookShopFindTheFeedbackLink(){

        driver.navigate().to("https://qajava.skillbox.ru/");
        driver.findElement(By.linkText("Обратная связь"));

    }

    @Test
    public void bookShopFindPreOrders(){

        driver.navigate().to("https://qajava.skillbox.ru/");
        driver.findElement(By.linkText("Предзаказы"));

    }

    @Test
    public void bookShopFindAddToCart(){

        driver.navigate().to("https://qajava.skillbox.ru/");
        driver.findElement(By.className("book-add"));

    }

    @Test
    public void bookShopFindNumberWithTheNumberOfGoods(){

        driver.navigate().to("https://qajava.skillbox.ru/");
        driver.findElement(By.id("cart_count"));

    }

    @Test
    public void bookShopFindMenuItem(){

        driver.navigate().to("https://qajava.skillbox.ru/");
        driver.findElement(By.id("genres"));

    }

    @Test
    public void bookShopFindSearchField(){

        driver.navigate().to("https://qajava.skillbox.ru/");
        driver.findElement(By.name("search-input-form"));

    }


    @Test
    public void bookShopFindAllElementsBookInfo(){

        driver.navigate().to("https://qajava.skillbox.ru/");
        List<WebElement> allElement = driver.findElements(By.className("book-info"));
        Assert.assertEquals("Неверное количество элементов",15,allElement.size());


    }

}
