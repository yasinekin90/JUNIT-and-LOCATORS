package day07_RelativeLocator_2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Arrays;

public class C04_TekrarTesti {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // https://www.google.com/ adresine gidin
        driver.get("https://www.google.com/");
        //Sayfa basliginin “Google” ifadesi icerdigini test edin
        if(driver.getTitle().contains("Google")){
            System.out.println("TEST PASSED");
        }else {
            System.out.println("TEST FAILED");
        }
        //Arama cubuguna “Nutella” yazip aratin
        driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("Nutella");
        driver.findElement(By.xpath("(//input[@class=\"gNO89b\"])[1]")).click();
        //Bulunan sonuc sayisini yazdirin
        WebElement text=driver.findElement(By.id("result-stats"));

        String[] text1= text.getText().split(" ");
        String number=text1[1];
        String noktasizSayi=number.replace(".","");
        int realNumber= Integer.parseInt(noktasizSayi);

        //sonuc sayisinin 10 milyon’dan fazla oldugunu test edin
        if(realNumber>10000000){
            System.out.println("sayı 10 milyondan büyük");
        }else {
            System.out.println("SAYI 10 MİLYONDAN KÜÇÜK");
        }
        driver.close();

        //Sayfayi kapatin
    }
}
