import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OnlineCinema {

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
}
