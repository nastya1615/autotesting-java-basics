import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class MyHomeworkTests {
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
    public void registrationАorAnOnlineCinemaWithFullData(){

        driver.navigate().to("https://lm.skillbox.cc/qa_tester/module06/register/");
        driver.findElement(By.name("name")).sendKeys("Анастасия");
        driver.findElement(By.name("email")).sendKeys("skillbox@test.ru");
        driver.findElement(By.name("password")).sendKeys("qwerty!123");
        driver.findElement(By.className("form-submit")).click();
        String resalt = driver.findElement(By.className("form-result")).getText();
        Assert.assertEquals("Неверный вывод сообщения после регистрации","Вам на почту skillbox@test.ru отправлено письмо",resalt);

    }

    @Test
    public void registrationАorAnOnlineCinemaNoData(){

        driver.navigate().to("https://lm.skillbox.cc/qa_tester/module06/register/");
        driver.findElement(By.className("form-submit")).click();
        String resalt = driver.findElement(By.className("form-error")).getText();
        Assert.assertEquals("Неверное название поля","Введите имя",resalt);

    }

    @Test
    public void findEmail(){

        driver.navigate().to("https://lm.skillbox.cc/qa_tester/module05/practice1/");
        driver.findElement(By.className("form-input")).click();

    }

    @Test
    public void findPassword(){

        driver.navigate().to("https://lm.skillbox.cc/qa_tester/module05/practice1/");
        driver.findElement(By.id("password")).click();

    }

    @Test
    public void findConfirmPassword(){

        driver.navigate().to("https://lm.skillbox.cc/qa_tester/module05/practice1/");
        driver.findElement(By.name("confirm_password")).click();

    }

    @Test
    public void shoeStorePositiveScenario(){

        driver.navigate().to("https://lm.skillbox.cc/qa_tester/module03/practice1/");
        driver.findElement(By.name("check")).sendKeys("38");
        driver.findElement(By.tagName("button")).click();
        String resalt = driver.findElement(By.id("size-success")).getText();
        Assert.assertEquals("Неверный текст при положительном результате поиска","В нашем магазине есть обувь вашего размера",resalt);

    }

    @Test
    public void shoeStoreNegativeScenario(){

        driver.navigate().to("https://lm.skillbox.cc/qa_tester/module03/practice1/");
        String resalt = driver.findElement(By.className("subtitle")).getText();
        Assert.assertEquals("Неверный текст в поле сайта","В нашем магазине есть обувь c 34 по 44 размер",resalt);

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

    @Test
    public void cinemaOnlineTestOne(){

        driver.navigate().to("https://lm.skillbox.cc/qa_tester/module07/practice3/");
        driver.findElement(By.name("films")).sendKeys("Человек дождя");
        driver.findElement(By.name("serials")).sendKeys("Доктор Хаус");
        driver.findElement(By.id("save")).click();
        driver.findElement(By.id("two")).click();
        driver.findElement(By.id("save")).click();
        driver.findElement(By.id("ok")).click();
        String bestFilm = driver.findElement(By.id("best_films")).getText();
        Assert.assertEquals("Неверное название фильма","Человек дождя",bestFilm);
        String bestSerial = driver.findElement(By.id("best_serials")).getText();
        Assert.assertEquals("Неверное название сериала","Доктор Хаус",bestSerial);


    }

    @Test
    public void cinemaOnlineTestTwo(){

        driver.navigate().to("https://lm.skillbox.cc/qa_tester/module07/practice3/");
        driver.findElement(By.id("save")).click();
        driver.findElement(By.id("two")).click();
        driver.findElement(By.className("fake-checkbox")).click();
        driver.findElement(By.id("save")).click();
        driver.findElement(By.id("ok")).click();
        String var = driver.findElement(By.id("language")).getText();
        Assert.assertEquals("Неверный язык","С русскими субтитрами",var);



    }

    @Test
    public void cinemaOnlineTestThree(){

        driver.navigate().to("https://lm.skillbox.cc/qa_tester/module07/practice3/");
        driver.findElement(By.id("save")).click();
        driver.findElement(By.id("two")).click();
        driver.findElement(By.className("fake-radiobutton")).click();
        driver.findElement(By.id("save")).click();
        driver.findElement(By.id("ok")).click();
        String var = driver.findElement(By.id("age")).getText();
        Assert.assertEquals("Неверный возраст","10-17",var);



    }



}
