package day03_drivermethotlari;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver03_Methotlar_Manage {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        /*
        driver.manage().window().maximize();=>browserı tam sayfa maximize eder
         driver.manage().window().minimize();=>browserı simge durumuna küçültür
          driver.manage().window().fullscreen();=>browserı fullscreen yapar
           driver.manage().window().getPosition();=>browserın koordinatlarını verir
           driver.manage().window().getSize() =>browserın ölçülerini verir
             driver.manage().window().setPosition(new Point());=>pencerenin pozisyonunu değiştirmeye yarar*/

        driver.get("https://www.amazon.com");
        /*driver.manage().window().maximize();
        Thread.sleep(4000);
        driver.manage().window().minimize();
        driver.manage().window().fullscreen();*/
        System.out.println("driver.manage().window().getPosition() = " + driver.manage().window().getPosition());
        System.out.println("driver.manage().window().getSize() = " + driver.manage().window().getSize());
        driver.manage().window().setPosition(new Point(250,450));
        System.out.println("driver.manage().window().getPosition() = " + driver.manage().window().getPosition());
        driver.manage().window().setSize(new Dimension(400,400));
        System.out.println("driver.manage().window().getSize() = " + driver.manage().window().getSize());

    }
}
