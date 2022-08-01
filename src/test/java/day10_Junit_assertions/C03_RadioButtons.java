package day10_Junit_assertions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class C03_RadioButtons {
    //todo
    // //https://www.facebook.com/ adresine gidin
    // //-“Create an Account” button’una basin
    //  //-“radio buttons” elementlerini locate edin
    //  //Secili degilse cinsiyet butonundan size uygun olani secin
    WebDriver driver;
    @Before
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://www.facebook.com/");

    }
    @After
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.close();
    }

    @Test
    public void test01(){
        driver.findElement(By.linkText("Yeni Hesap Oluştur")).click();
       WebElement female= driver.findElement(By.xpath("(//input[@type=\"radio\"])[1]"));
        WebElement male= driver.findElement(By.xpath("(//input[@type=\"radio\"])[2]"));
        WebElement custom= driver.findElement(By.xpath("(//input[@type=\"radio\"])[3]"));

       if(!male.isSelected())
           male.click();
        System.out.println("Male butonuna tıklandı");
    }

}
