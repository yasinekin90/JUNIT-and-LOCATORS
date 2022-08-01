package day08_Review_Locator;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import java.time.Duration;
import java.util.List;

public class C03_Tekrar_Testi {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().deleteAllCookies();

        //todo
        // 1- https://www.bestbuy.com/ adresine gidin
        driver.get("https://www.bestbuy.com/");
        // 2- cookies cikarsa kabul et butonuna basin

        // 3- sayfada kac adet button bulundugunu yazdirin
      List <WebElement> buttonNumber=driver.findElements(By.tagName("button"));

        System.out.println("button sayısı= "+buttonNumber.size());



        // 4- sayfadaki herbir button uzerindeki yazilari yazdirin
        //yontem1
        for (WebElement button:buttonNumber) {
            System.out.println("button.getText() = " + button.getText());
        }

      /*  System.out.println("buttonNumber.get(0).getText() = " + buttonNumber.get(0).getText());
        System.out.println("buttonNumber.get(1).getText() = " + buttonNumber.get(1).getText());
        System.out.println("buttonNumber.get(2).getText() = " + buttonNumber.get(2).getText());*/

        // 5- sayfadaki herbir Bayrak altındaki  yazilari yazdirin

        WebElement canada= driver.findElement(By.xpath("(//h4)[1]"));
        System.out.println(canada.getText());
        WebElement  USA=driver.findElement(By.xpath("(//h4)[2]"));
        System.out.println(USA.getText());
        WebElement  mexico=driver.findElement(By.xpath("(//h4)[3]"));
        System.out.println(mexico.getText());

        // 6- sayfadakiUnidetb Statesin yerini Realtive locater ile belirleyiniz.

        WebElement usaLocation=driver.findElement(RelativeLocator.with(By.tagName("h4")).toRightOf(canada).toLeftOf(mexico));

        System.out.println("usaLocation.getText() = " + usaLocation.getText());


    }
}
