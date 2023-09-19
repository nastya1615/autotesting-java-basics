import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OnlineCinemaTwo {
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
}
