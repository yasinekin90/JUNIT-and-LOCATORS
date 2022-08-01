package HomeWorks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class HomeWork02 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.get("https://www.facebook.com");
        Thread.sleep(5000);

        String actualTitle= driver.getTitle();
        String expectedTitle="facebook";

        if(actualTitle.equals(expectedTitle)){
            System.out.println("başlık dogru");
        }else {
            System.out.println("başlık yanlış");
            System.out.println("actualTitle = " + actualTitle);
        }

        String actualUrl= driver.getCurrentUrl();

        if (actualUrl.contains("facebooK")){
            System.out.println("url içeriginde facebook var");
        }else {
            System.out.println("url içeriginde facebook yok");
            System.out.println("actualUrl = " + actualUrl);
        }

        driver.navigate().to("https://www.walmart.com/");

        String walmartTitle= driver.getTitle();

        if(walmartTitle.contains("Walmart.com")){
            System.out.println("başlık Walmart.com içeriyor");
        }else {
            System.out.println("başlık Walmart.com içermiyor");
        }
        Thread.sleep(5000);

        driver.navigate().back();

        Thread.sleep(5000);

        driver.close();

    }
}
