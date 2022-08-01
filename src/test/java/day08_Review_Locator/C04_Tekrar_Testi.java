package day08_Review_Locator;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_Tekrar_Testi {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        // TODO: 7/20/2022
        //* 1. Sayfaya gidiniz http://automationexercise.com/
        driver.get("http://automationexercise.com/");
        //* 2. Site logosunu test ediniz
        if(driver.findElement(By.xpath("//img[@alt=\"Website for automation practice\"]")).isDisplayed()){
            System.out.println("Logo is displayed.TEST PASSED");
        }else {
            System.out.println("TEST FAILED.logo is not displayed");
        }
        //* 3.'Signup / Login' button tıklayınız
        driver.findElement(By.xpath("//a[@href=\"/login\"]")).click();

        //* 4. email adres ve parola giriniz
        driver.findElement(By.xpath("(//input[@type=\"email\"])[1]")).sendKeys("guidersoft@merhaba.com");
        driver.findElement(By.xpath("(//input[@type=\"password\"])[1]")).sendKeys("12345", Keys.ENTER);
        //* 5. Click 'login' yapınız
        //* 6. Delete Account yazısını doğrulayınız
        WebElement linktext=driver.findElement(By.linkText("Delete Account"));

        if(linktext.getText().contains("Delete Account")){
            System.out.println("yazı dogrulandı.TEST PASSED");
        }else {
            System.out.println("yazı yanlış.TEST FAILED");
            System.out.println("linktext.getText() = " + linktext.getText());
        }
        //* 7. Sayfadan 'Logout yapınız
        driver.findElement(By.linkText("Logout")).click();
        //* 8. lOGİN SAYFASINA GİDİLDİĞİNİ KONTROL EDİNİZ.
        if (driver.getCurrentUrl().equals("http://automationexercise.com/login")) {
            System.out.println("anasayfaya gidildi.test passed");
        }else {
            System.out.println("TEST FAILED");
        }
        //* 9. Close driver
        driver.close();
    }
}
