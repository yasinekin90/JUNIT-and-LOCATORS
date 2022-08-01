package HomeWorks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class HomeWork01 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://id.heroku.com/login");
        WebElement eMail= driver.findElement(By.xpath("//*[@id=\"email\"]"));
        WebElement passWord= driver.findElement(By.xpath("//*[@id=\"password\"]"));
        WebElement loginButton= driver.findElement(By.xpath("//*[@id=\"login\"]/form/button"));


        //GECERSİZ KULLANICI ADI VE SİFRE
       /* eMail.sendKeys("ekinyasin90@gmail.com");
        passWord.sendKeys("1234567890");
        loginButton.click();*/

        //GECERLİ KULLANICI ADI VE SİFRE
        eMail.sendKeys("mahmutekin5734@gmail.com");
        passWord.sendKeys("19901990a.");
        loginButton.click();

        WebElement warning= driver.findElement(By.xpath("//*[@id=\"login\"]/form/div[1]"));



        if(warning.isDisplayed()){
            System.out.println("KAYIT YAPILAMADI");
        }else {
            System.out.println("KAYIT YAPILDI");

        }


         Thread.sleep(5000);



        driver.quit();

    }
}
