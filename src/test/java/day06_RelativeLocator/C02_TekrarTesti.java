package day06_RelativeLocator;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_TekrarTesti {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));


        //https://www.amazon.com/ adresine gidin
        driver.get("https://www.amazon.com/");
        //Browseri tam sayfa yapin

        //Sayfayi “refresh” yapin
        driver.navigate().refresh();
        //Sayfa basliginin “Spend less” ifadesi icerdigini test edin
        String title=driver.getTitle();
        if(title.contains("Spend less")){
            System.out.println("TITLE TESTI==>TEST PASSED");
        }else {
            System.out.println("TITLE TESTI==>TEST FAILED");

        }

        //Gift Cards sekmesine basin
        driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[4]")).click();
        //Birthday butonuna basin
        Thread.sleep(2000);
        driver.findElement(By.xpath("//img[@alt=\"Birthday gift cards\"]")).click();
        //Best Seller bolumunden ilk urunu tiklayin
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//img[@alt=\"Amazon.com eGift Card\"])[1]")).click();

        //Gift card details’den 25 $’i secin
        driver.findElement(By.xpath("//*[@id=\"gc-mini-picker-amount-1\"]")).click();
        //Urun ucretinin 25$ oldugunu test edin
        WebElement price= driver.findElement(By.cssSelector("span[class=\"a-color-price a-text-bold\"]"));

        if(price.getText().equals("$25.00")){
            System.out.println("FIYAT TESTI==>TEST PASSED");
        }else {
            System.out.println("FIYAT TESTI==>TEST FAILED");
            System.out.println("price.getText() = " + price.getText());
        }

        driver.close();



        //Sayfayi kapatin
    }
}
