package day09_Junit;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C02_Odev {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //todo
        // 1- https://www.amazon.com/ sayfasina gidelim
        driver.get("https://www.amazon.com");
        // 2- arama kutusunu locate edelim
        // 3- “iphone ” ile arama yapalim
        driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]")).sendKeys("iphone", Keys.ENTER);
        // 4 - Bulunan sonuc sayisini yazdiralim
        WebElement result= driver.findElement(By.xpath("(//div[@class=\"sg-col-inner\"])[1]"));
        System.out.println("result = " + result.getText());
        // 5- Ilk urunu tiklayalim
        driver.findElement(By.xpath("(//span[@class=\"a-size-medium a-color-base a-text-normal\"])[1]")).click();
        Thread.sleep(3000);
        // 6- Bir onceki sayfaya donup,sayfadaki tum basliklari  yazdiralim
        driver.navigate().back();

        basliklar(driver);

        //2. sayfaya gecildi
       WebElement next= driver.findElement(By.linkText("Next"));
        next.click();
        basliklar(driver);
        Thread.sleep(3000);
        next.click();
        Thread.sleep(3000);
        basliklar(driver);


        // 7 3. sayfaya kadar yazdıralım.


    }
    public static void basliklar(WebDriver driver){
        List<WebElement> tabledata= driver.findElements(By.xpath("//span[@class=\"a-size-medium a-color-base a-text-normal\"]"));

        for (WebElement data:tabledata) {
            System.out.println("data.getText() = " + data.getText());
        }
    }
}
