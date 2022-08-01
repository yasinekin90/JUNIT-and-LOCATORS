package day10_Junit_assertions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C05_BestBuyAssertion_Tekrar {
    static WebDriver driver;
    @BeforeClass
    public static void setup(){
        WebDriverManager.chromedriver().setup();
         driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.bestbuy.com/");
    }
      @Test
    public void UrlTest(){
        String actualUrl=driver.getCurrentUrl();
        String expectedUrl="https://www.bestbuy.com/";
        String title=driver.getTitle();
        Assert.assertEquals(expectedUrl,actualUrl);
    }

    @Test
    public void titleTest(){
        String title=driver.getTitle();
        Assert.assertFalse(title.contains("Rest"));
    }

    @Test
    public void logoTest(){
        Assert.assertTrue("logo göründü",driver.findElement(By.xpath("(//img[@alt=\"Best Buy Logo\"])[1]")).isDisplayed());
    }

    @Test
    public void franceLink(){
        Assert.assertTrue(driver.findElement(By.xpath("//button[@lang=\"fr\"]")).isDisplayed());
    }
    @AfterClass
    public static void tearDown() throws InterruptedException {
        Thread.sleep(5000);
        driver.close();
    }

}
