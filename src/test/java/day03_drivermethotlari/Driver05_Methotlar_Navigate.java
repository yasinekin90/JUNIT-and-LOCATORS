package day03_drivermethotlari;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver05_Methotlar_Navigate {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        //driver.navigate().forward=>browserda bir sayfa ileri gitmye yarar
        //driver.navigate().refresh=>browserda sayfayı yeniler

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        //driver.get("https://www.amazon.com");  get ve navigate aynı işlevi görür
        driver.navigate().to("https://www.amazon.com");
        Thread.sleep(4000);
        driver.navigate().to("https://www.netflix.com");
        Thread.sleep(4000);
        driver.navigate().back();
        Thread.sleep(4000);
        driver.navigate().forward();
        Thread.sleep(4000);
        driver.navigate().refresh();
        driver.close();



    }
}
