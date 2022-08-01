package day03_drivermethotlari;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver02_Methotlar_Get_Ornek {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.netflix.com");
        System.out.println("driver.getTitle() = " + driver.getTitle());
        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());
        System.out.println("driver.getWindowHandle() = " + driver.getWindowHandle());
        //System.out.println("driver.getPageSource() = " + driver.getPageSource());
        Thread.sleep(4000);
        driver.close();
    }
}
