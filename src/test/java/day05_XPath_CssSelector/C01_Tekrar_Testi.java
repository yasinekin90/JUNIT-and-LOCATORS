package day05_XPath_CssSelector;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_Tekrar_Testi {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //amazon web sayfasına git

        driver.get("https://www.amazon.com/");

        //Search(ara) “santoku victorinox”
        WebElement search= driver.findElement(By.id("twotabsearchtextbox"));
       // WebElement find= driver.findElement(By.id("nav-search-submit-button"));
       // search.sendKeys("santoku victorinox", Keys.ENTER); //entera basma
        search.sendKeys("santoku victorinox");
        search.submit();//entera benzer
        //find.click();// mercege tıklama
        //Amazon'da göruntulenen ilgili sonuçların sayısını yazdırın
       WebElement result=driver.findElement(By.className("sg-col-inner"));
        System.out.println("result.getText() = " + result.getText());

        //Sonra karşınıza çıkan ilk sonucun resmine tıklayın
       // WebElement firsImage= driver.findElement(By.className("s-image"));
        //firsImage.click();
        WebElement firstProduct= driver.findElement(By.xpath("//span[@class=\"a-size-base-plus a-color-base a-text-normal\"]"));
        firstProduct.click();
    }
}
