package day09_Junit;

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
//todo
        // 1.https://www.saucedemo.com/ Adresine gidin
        driver.get("https://www.saucedemo.com/");
        // 2. Username kutusuna “standard_user” yazdirin+
        driver.findElement(By.xpath("//input[@placeholder=\"Username\"]")).sendKeys("standard_user");
        // 3. Password kutusuna “secret_sauce” yazdirin
        driver.findElement(By.xpath("//input[@placeholder=\"Password\"]")).sendKeys("secret_sauce", Keys.ENTER);
        // 4 . Login tusuna basin
        // 5. Ilk urunun ismini kaydedin ve bu urunun sayfasina gidin
        WebElement ilkUrun= driver.findElement(By.xpath("(//div[@class=\"inventory_item_name\"])[1]"));
        String urun=ilkUrun.getText();
        System.out.println("ilkUrun.getText() = " + ilkUrun.getText());
        // 6. Add to Cart butonuna basin
        driver.findElement(By.xpath("(//button[text()=\"Add to cart\"])[1]")).click();
        // 7. Alisveris sepetine tiklayin
        driver.findElement(By.xpath("//a[@class=\"shopping_cart_link\"]")).click();
        // 8. Sectiginiz urunun basarili olarak sepete eklendigini control edin
        WebElement sepettekiUrun= driver.findElement(By.xpath("//div[@class=\"inventory_item_name\"]"));
        String sepetUrun=sepettekiUrun.getText();
        if (urun.equals(sepetUrun)) {
            System.out.println("ürünler eşit test passed");
            System.out.println("sepetUrun = " + sepetUrun);
        }else{
            System.out.println("test failed");
        }

        // 9. Sayfayi kapatin
        driver.close();
    }
}
