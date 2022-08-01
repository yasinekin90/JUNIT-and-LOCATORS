package day03_drivermethotlari;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver04_Methotlar_Manage_Ornek {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        WebDriver driver=new ChromeDriver();
        driver.get("https://www.guidersoft.com");
        driver.manage().window().setPosition(new Point(80,12));
        System.out.println("driver.manage().window().getPosition() = " + driver.manage().window().getPosition());
        driver.manage().window().setSize(new Dimension(580,990));
        System.out.println("driver.manage().window().getSize() = " + driver.manage().window().getSize());
        driver.close();



    }
}
