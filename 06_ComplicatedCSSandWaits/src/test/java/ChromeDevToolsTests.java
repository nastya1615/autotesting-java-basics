import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ChromeDevToolsTests {

    /* В этом классе можете описать тесты для домашнего задания */

    private WebDriver driver;
    private WebDriverWait wait;
    Duration seconds = Duration.ofSeconds(3);


    @Before
    public void setUp()
    {
        System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver,seconds);
    }

//    @After
//    public void tearDown()
//    {
//
//        driver.quit();
//    }

    private By plus = By.cssSelector(".pageCreate__sidebarHeaderAdd");
    private By lightbox = By.cssSelector(".popup__content");
    private By title = By.cssSelector(".baseInput.popup__baseInput > .baseInput__field");
    private By mainText = By.cssSelector("div.baseTextarea.popup__textarea");
    private By add = By.cssSelector(".baseButton.popup__baseButton");

    @Test
    public void checkSite(){

        driver.navigate().to("http://qa.skillbox.ru/module15/bignotes/#/");
//        driver.findElement(plus).click();
//        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(lightbox));
//        driver.findElement(title).sendKeys("Домашние животные");
//        driver.findElement(mainText).click();
//        driver.findElement(add).click();
//        wait.until(ExpectedConditions.invisibilityOfElementLocated(lightbox));

    }

}
