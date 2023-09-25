import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ComputerRepairTests {

    /* В этом классе можете описать тесты для домашнего задания */

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

    private By nameLocator = By.cssSelector(".form-input.fio");
    private By streetNameLocator = By.cssSelector(".data.form-input.street");
    private By houseNumber = By.cssSelector(".form-input.house");
    private By flat = By.cssSelector(".form-input.flat");
    private By date = By.cssSelector(".form-input.date");
    private By callATechnician = By.className("form-submit");
    private By result = By.className("form-result-description");

    @Test
    public void ComputerRepair(){

        driver.navigate().to("https://qajava.skillbox.ru/module04/lesson3/index.html");
        driver.findElement(nameLocator).sendKeys("Белова Анастасия Николаевна");
        driver.findElement(streetNameLocator).sendKeys("Проспект Карла Маркса");
        driver.findElement(houseNumber).sendKeys("30");
        driver.findElement(flat).sendKeys("40");
        driver.findElement(date).sendKeys("сегодня");
        driver.findElement(callATechnician).click();
        Assert.assertTrue("Данные не отобразились на странице",driver.findElement(result).isDisplayed());



    }

}
