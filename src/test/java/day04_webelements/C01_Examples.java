package day04_webelements;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_Examples {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.navigate().to("https://www.youtube.com");
        String actualTitle= driver.getTitle();
        String expectedTitle="YouTube";
        String actualURL=driver.getCurrentUrl();
        String expectedURL="youtube";
        if(actualTitle.equals(expectedTitle)){
            System.out.println("Test Pass");

        }else {
            System.out.println("test failed");
            System.out.println("actualTitle = " + actualTitle);
        }

        if(actualURL.contains(expectedURL)){
            System.out.println("TEST PASS");
            System.out.println("expectedURL = " + expectedURL);
        }else {
            System.out.println("TEST FAİLED");
        }

        driver.navigate().to("https://www.amazon.com");
        driver.navigate().back();
        driver.navigate().refresh();
        driver.navigate().forward();
        driver.manage().window().fullscreen();
        if(driver.getTitle().contains("amazon")){
            System.out.println("PASSED");

        }else {
            System.out.println("FAİLED");
            System.out.println("driver.getTitle() = " + driver.getTitle());
        }

        String actualUrlAmazon=driver.getCurrentUrl();
        String expectedUrlAmazon="https://www.amazon.com";

        if(expectedUrlAmazon.equals(actualUrlAmazon)){
            System.out.println("TEST PASSED");
        }else{
            System.out.println("TEST FAILED");
            System.out.println("actualUrlAmazon = " + actualUrlAmazon);
        }


        driver.close();
    }
}
