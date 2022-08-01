package day07_RelativeLocator_2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_Tekrar {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //*  1. https://trytestingthis.netlify.app/ sayfasina gidin
        driver.get("https://trytestingthis.netlify.app/");

        //*  2. Kullanıcı adı "test" giriniz
            WebElement userName=driver.findElement(By.xpath("//*[@id=\"uname\"]"));
            userName.sendKeys("test");

        //*  3.  Password olarak "test" giriniz
        WebElement password=driver.findElement(By.xpath("//*[@id=\"pwd\"]"));
        password.sendKeys("test");
        //*  4.  Login butonuna tiklayiniz
       WebElement login= driver.findElement(By.xpath("//*[@type=\"submit\"]"));
       login.click();
       Thread.sleep(3000);
        //*  5.  "Login Successful :)" texti gorunur ise Pass yazdırın
        WebElement logintext=driver.findElement(By.tagName("h2"));
       if(logintext.isDisplayed()) {
           System.out.println("YAZI GÖRÜNÜR");
       }else{
           System.out.println("YAZI GÖRÜNMÜYOR");
       }
       Thread.sleep(2000);
        //*  6. Textin içindeki "Click here to go back to the home page" !<"here">! tiklayın
        driver.findElement(By.xpath("//a[text()=\"here\"]")).click();
        //*  7.  Ana sayfadaki "This is your layout two" görünürlüğünü test edin.
       ;

        if ( driver.findElement(By.xpath("(//h2)[2]")).isDisplayed()){
            System.out.println("This is your layout two is displayed");
        }else {
            System.out.println("This is your layout two is not displayed");
        }
        //*  8.  Tum sayfalari kapatiniz
        driver.close();
    }
}
