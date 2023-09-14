import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTests {


    @Test
    public void testHelloVasya(){

        System.setProperty("webdriver.chrom.driver","drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://lm.skillbox.cc/qa_tester/module01/");
        driver.findElement(By.name("name")).sendKeys("Вася");
        driver.findElement(By.className("button")).click();
        String resalt = driver.findElement(By.className("start-screen__res")).getText();
        Assert.assertEquals("Привет, Вася!",resalt);
        driver.quit();

    }

    @Test
    public void emptyInput(){

        System.setProperty("webdriver.chrom.driver","drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://lm.skillbox.cc/qa_tester/module01/");
        driver.findElement(By.className("button")).click();
        String resalt = driver.findElement(By.className("start-screen__res")).getText();
        Assert.assertEquals("Привет!",resalt);
        driver.quit();

    }

    @Test
    public void testModule2HelloNastya(){

        System.setProperty("webdriver.chrom.driver","drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://lm.skillbox.cc/qa_tester/module02/homework1/");
        driver.findElement(By.name("name")).sendKeys("Настя");
        driver.findElement(By.className("button")).click();
        String resalt = driver.findElement(By.className("start-screen__res")).getText();
        Assert.assertEquals("Здравствуйте,Настя.Введите пожалуйста Ваш E-mail и телефон",resalt);
        driver.quit();

    }

    @Test
    public void testModule2EnteredEmailAddress(){

        System.setProperty("webdriver.chrom.driver","drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://lm.skillbox.cc/qa_tester/module02/homework1/");
        driver.findElement(By.name("email")).sendKeys("nastya1615325@gmail.com");
        driver.findElement(By.className("button")).click();
        String resalt = driver.findElement(By.className("start-screen__res")).getText();
        Assert.assertEquals("Здравствуйте,на вашу почту (nastya1615325@gmail.com) отправлено письмо.",resalt);
        driver.quit();

    }

    @Test
    public void testModule2EnteredTelephone(){

        System.setProperty("webdriver.chrom.driver","drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://lm.skillbox.cc/qa_tester/module02/homework1/");
        driver.findElement(By.name("phone")).sendKeys("89371615325");
        driver.findElement(By.className("button")).click();
        String resalt = driver.findElement(By.className("start-screen__res")).getText();
        Assert.assertEquals("Здравствуйте,наш сотрудник свяжется с вами по телефону: 89371615325",resalt);
        driver.quit();

    }

    @Test
    public void testModule2AllData(){

        System.setProperty("webdriver.chrom.driver","drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://lm.skillbox.cc/qa_tester/module02/homework1/");
        driver.findElement(By.name("name")).sendKeys("Настя");
        driver.findElement(By.name("email")).sendKeys("nastya1615325@gmail.com");
        driver.findElement(By.name("phone")).sendKeys("89371615325");
        driver.findElement(By.className("button")).click();
        String resalt = driver.findElement(By.className("start-screen__res")).getText();
        Assert.assertEquals("Здравствуйте, Настя.\n" +
                "На вашу почту (nastya1615325@gmail.com) отправлено письмо.\n" +
                "Наш сотрудник свяжется с вами по телефону: 89371615325.",resalt);
        driver.quit();

    }

    @Test
    public void testModule2NameAndEmail(){

        System.setProperty("webdriver.chrom.driver","drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://lm.skillbox.cc/qa_tester/module02/homework1/");
        driver.findElement(By.name("name")).sendKeys("Настя");
        driver.findElement(By.name("email")).sendKeys("nastya1615325@gmail.com");
        driver.findElement(By.className("button")).click();
        String resalt = driver.findElement(By.className("start-screen__res")).getText();
        Assert.assertEquals("Здравствуйте, Настя.\n" +
                "На вашу почту (nastya1615325@gmail.com) отправлено письмо.",resalt);
        driver.quit();

    }


    @Test
    public void testModule2NamePhone(){

        System.setProperty("webdriver.chrom.driver","drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://lm.skillbox.cc/qa_tester/module02/homework1/");
        driver.findElement(By.name("name")).sendKeys("Настя");
        driver.findElement(By.name("phone")).sendKeys("89371615325");
        driver.findElement(By.className("button")).click();
        String resalt = driver.findElement(By.className("start-screen__res")).getText();
        Assert.assertEquals("Здравствуйте, Настя.\n" +
                "Наш сотрудник свяжется с вами по телефону: 89371615325.",resalt);
        driver.quit();

    }


    @Test
    public void testModule2EmailPhone(){

        System.setProperty("webdriver.chrom.driver","drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://lm.skillbox.cc/qa_tester/module02/homework1/");
        driver.findElement(By.name("email")).sendKeys("nastya1615325@gmail.com");
        driver.findElement(By.name("phone")).sendKeys("89371615325");
        driver.findElement(By.className("button")).click();
        String resalt = driver.findElement(By.className("start-screen__res")).getText();
        Assert.assertEquals("Здравствуйте" +
                "На вашу почту (nastya1615325@gmail.com) отправлено письмо.\n" +
                "Наш сотрудник свяжется с вами по телефону: 89371615325.",resalt);
        driver.quit();

    }

}
