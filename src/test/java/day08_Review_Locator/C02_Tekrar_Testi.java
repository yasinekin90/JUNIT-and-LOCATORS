package day08_Review_Locator;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_Tekrar_Testi {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //todo
        // 1- https://www.facebook.com/ adresine gidin
        driver.get("https://www.facebook.com/");

        //  2- cookies cikarsa kabul et butonuna basin
        // 3- e-posta kutusuna rastgele bir mail girin
        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("abcabc123@gmail.com");
        // 4- sifre kismina rastgele bir sifre girin
        driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("123456789");
        // 5- giris yap butonuna basin
           driver.findElement(By.xpath("//*[text()=\"Giriş Yap\"][1]")).click();
        // 6- uyari olarak "The email or mobile number you entered isn’t connected to an account.
        WebElement text=driver.findElement(By.xpath("//div[@class=\"_9ay7\"]"));
        System.out.println(text.getText());
        if(text.isDisplayed()){
            System.out.println("TEST PASSED");
        }else{
            System.out.println("TEST FAILED");
        }
        // Find your account and log in. “ mesajinin ciktigini test edin

        // 7- sayfayi kapatin
        driver.close();
    }
}
