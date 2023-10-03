import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchByAttributeTests {


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

    /*Повторите действия из урока для формы входа в личный кабинет на обновлённой версии сайта клуба любителей весёлых носков: обновите локаторы для элементов,
    как показано в уроке, не забудьте указать новый адрес сайта.  */
    private By email = By.cssSelector("[data ='email']");
    private By password = By.cssSelector("[data ='password one']");
    private By entrance = By.cssSelector("button#submit.form-submit");
    private By result = By.cssSelector("pre#error.form-error-password-email");

    /*локаторы для элемента <section class="important-section-block" for="main-header-page">.
    Осуществите поиск только по атрибуту for, равному "main-header-page";*/
    private By mainHeaderPage = By.cssSelector("[for ='main-header-page']");
    /*локаторы для элемента <input type="text" data="email" placeholder="E-mail" required important>.
    Осуществите поиск только по атрибуту important;*/
    private By requiredImportant = By.cssSelector("[important = '']");
    /*локаторы для элемента <h3 class="form-title">Вход в личный кабинет</h3>. Осуществите поиск одновременно по тегу и классу, содержащему текст title;*/
    private By loginToYourPersonalAccount = By.cssSelector("h3[class*='title']");
    /*локатор для всех элементов с тегом a и с атрибутом href, начинающихся на «mailto:»;*/
    private By mailto = By.cssSelector("[href*='mailto']");
    /*локатор для всех элементов, у которых атрибут class заканчивается на header.*/
    private By header = By.cssSelector("[class^='header']");


    @Test
    public void CheckElements(){

        driver.navigate().to("https://qajava.skillbox.ru/module05/auth/index.html/");
        driver.findElement(email).sendKeys("@");
        driver.findElement(password).sendKeys("123");
        driver.findElement(entrance).click();
        Assert.assertTrue("Данные не отобразились на странице",driver.findElement(result).isDisplayed());
        Assert.assertEquals("Данные выведены некорректно","Некорректный email или пароль",driver.findElement(result).getText());
        driver.findElement(mainHeaderPage);
        driver.findElement(requiredImportant);
        driver.findElement(loginToYourPersonalAccount);
        driver.findElement(mailto);
        driver.findElement(header);





    }
}
