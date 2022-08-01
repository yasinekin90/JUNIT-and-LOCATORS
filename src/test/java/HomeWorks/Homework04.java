package HomeWorks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Homework04 {
    WebDriver driver;
    //todo
    // amazona gidilsin
    // arama butonuna nutella yazılsın
    // title nutelle var mı kontrol edilsin
    @Test
    public void test01(){
        driver.get("https://www.amazon.com");
        driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]")).sendKeys("nutella", Keys.ENTER);
        String title= driver.getTitle();
        if(title.contains("nutella")){
            System.out.println("The title includes \"nutella\".TEST PASSED ");
        }else {
            System.out.println("The title does not include \"nutella\".TEST FAILED");
        }
    }

    //todo
    // amazona gidilsin
    // arama butonuna java yazılsın
    // title da java var mı kontrol edilsin
    @Test
    public void test02(){
        driver.get("https://www.amazon.com");
        driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]")).sendKeys("java", Keys.ENTER);
        String title= driver.getTitle();
        if(title.contains("java")){
            System.out.println("The title includes \"java\".TEST PASSED ");
        }else {
            System.out.println("The title does not include \"java\".TEST FAILED");
        }
    }
    //todo
    // amazona gidilsin
    // arama butonuna ali yazılsın
    // title da ali var mı kontrol edilsin
    @Test
    public void test03(){
        driver.get("https://www.amazon.com");
        driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]")).sendKeys("ali", Keys.ENTER);
        String title= driver.getTitle();
        if(title.contains("ali")){
            System.out.println("The title includes \"ali\".TEST PASSED ");
        }else {
            System.out.println("The title does not include \"ali\".TEST FAILED");
        }
    }
    @Before
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

    }
    @After
    public void endProcess() throws InterruptedException {
        Thread.sleep(3000);
        driver.close();
    }
}
