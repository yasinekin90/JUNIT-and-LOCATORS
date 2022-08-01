package HomeWorks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class HomeWork06 {

    //todo
   //  https://www.youtube.com/ adresine gidin
    // ○ titleTest   => Sayfa başlığının “YouTube” oldugunu test edin
    // imageTest   => YouTube resminin görüntülendiğini (isDisplayed()) test edin
    // Search Box 'in erisilebilir oldugunu test edin (isEnabled())
//      ○ wrongTitleTest  => Sayfa basliginin “youtube” olmadigini dogrulayin
   //  3 adet test metodu oluşturun tek sayfada
   static WebDriver driver;
    @BeforeClass
    public static void setup(){
        WebDriverManager.chromedriver().setup();
         driver=new ChromeDriver();
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
         driver.get("https://www.youtube.com");
    }
    @AfterClass
    public static void tearDown() throws InterruptedException {
        Thread.sleep(5000);
        //driver.close();
    }
    @Test
    public  void titleTest(){
        String title= driver.getTitle();
        Assert.assertEquals("YouTube",title);
        Assert.assertNotEquals("youtube",title);
    }
    @Test
    public  void imageTest(){
     WebElement image= driver.findElement(By.xpath("(//yt-icon[@id=\"logo-icon\"])[1]"));
     Assert.assertTrue(image.isDisplayed());
    }
    @Test
    public void searchBoxTest(){
        WebElement search= driver.findElement(By.xpath("//input[@id=\"search\"]"));
        Assert.assertTrue(search.isEnabled());
    }

}
