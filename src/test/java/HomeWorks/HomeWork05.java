package HomeWorks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.lang3.builder.ToStringExclude;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class HomeWork05 {
    //todo
    // amazona gidilsin
    // arama butonuna nutella yazılsın
    // title nutelle var mı kontrol edilsin
    // amazona gidilsin
    // arama butonuna java yazılsın
    // title da java var mı kontrol edilsin
    // amazona gidilsin
    // arama butonuna ali yazılsın
    // title da ali var mı kontrol edilsin
   //  Assert ile yapılacak
   static WebDriver driver;

    @BeforeClass
    public static void setup(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.amazon.com");
        WebElement search=driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]"));

    }
    @AfterClass
    public static void tearDown() throws InterruptedException {
        Thread.sleep(5000);
        driver.close();
    }

    @Test
    public void nutellaTest(){

        WebElement search= driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]"));
        search.clear();
        search.sendKeys("nutella", Keys.ENTER);
        Assert.assertTrue(driver.getTitle().contains("nutella"));
    }
    @Test
    public void javaTest(){

        WebElement search=driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]"));
        search.clear();

        search.sendKeys("java", Keys.ENTER);
        Assert.assertTrue(driver.getTitle().contains("java"));
    }
    @Test
    public void aliTest(){
        WebElement search=driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]"));
        search.clear();
        search.sendKeys("ali", Keys.ENTER);
        Assert.assertTrue(driver.getTitle().contains("ali"));
    }


}
