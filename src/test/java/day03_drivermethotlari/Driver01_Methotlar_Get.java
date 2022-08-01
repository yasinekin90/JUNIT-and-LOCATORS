package day03_drivermethotlari;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver01_Methotlar_Get {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        /*
        driver.get("url");=> istedgimiz web sitesine gitmeye yarar
        driver.getTitle();=>içinde bulunan sayfanın baslık bilgisini veriyor
        driver.getCurrentUrl();=> içinde bulunulan sayfanın urlsini bize string olarak verir
        driver.getPageSource();=>sayfanın kaynak kodunu verir
        driver.getWindowHandle();=>içinde bulundugumuz sayfanın tc numarasını bize verir
        driver.getWindowHandles();=>içinde bulundugumuz sayfanın handle degerlerini bize verir
         driver.close();=>içinde bulundugumuz browserı kapatır.
         driver.quit();=>içinde bulundugumuz browserların hepsini kapatır.
        */
        driver.get("https://www.paypal.com");
       // System.out.println("driver.getTitle() = " + driver.getTitle());
        //System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());
        //System.out.println("driver.getPageSource() = " + driver.getPageSource());
        //System.out.println("driver.getWindowHandle() = " + driver.getWindowHandle());
        System.out.println("driver.getWindowHandles() = " + driver.getWindowHandles());
        Thread.sleep(4000);
        driver.close();

    }
}
