package day10_Junit_assertions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C05_BestBuyAssertion {
     //todo
    //  https://www.bestbuy.com/ A dresine gidin farkli test method’lari olusturarak asagidaki
    //  testleri yapin
    //  ○Sayfa URL’inin https://www.bestbuy.com/ com/‘a esit oldugunu test edin
    //  ○titleTest => Sayfa başlığının “ Rest” içer me diğini(contains) test edin
    //  ○logoTest => BestBuy logosunun görüntülen digini test edin
    //  ○Francais LinkTest => Fransizca Linkin görüntüle n diğini test edin

    WebDriver driver;
    @Before
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://www.bestbuy.com/");

    }
    @After
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.close();
    }
    @Test
    public void test(){

        String actualUrl=driver.getCurrentUrl();
        String expectedUrl="https://www.bestbuy.com/";
        String title=driver.getTitle();
        Assert.assertEquals(expectedUrl,actualUrl);
        Assert.assertFalse(title.contains("Rest"));
        Assert.assertTrue("logo göründü",driver.findElement(By.xpath("(//img[@alt=\"Best Buy Logo\"])[1]")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath("//button[@lang=\"fr\"]")).isDisplayed());
    }
}
