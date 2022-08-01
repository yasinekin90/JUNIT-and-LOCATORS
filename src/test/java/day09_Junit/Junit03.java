package day09_Junit;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Junit03 {
    WebDriver driver;
    @Test
    public  void test01(){
       //amazona git
        //title al,dogrulama yap

        driver.get("https://www.amazon.com");
        String title= driver.getTitle();
        String arananTitle="amazon";
        if (title.contains(arananTitle)) {
            System.out.println("Amazon TESTİ PASS");
        }else {
            System.out.println("Amazon TEST FAIL");
        }

    }

    @Test
    public  void test02(){
        //google git
        //title al,dogrulama yap
        driver.get("https://www.google.com");
        String title= driver.getTitle();
        String arananTitle="google";

        if (title.contains(arananTitle)) {
            System.out.println("Google TEST PASS");
        }else {
            System.out.println("Google TEST FAIL");
        }





    }

    @Before
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        System.out.println("sistem çalışmaya başladı");
    }

    @After
    public void duzelt() throws InterruptedException {
        Thread.sleep(4000);
        driver.close();
        System.out.println("sistem ortaliği düzeltmeyi bitirdi");
    }


}
