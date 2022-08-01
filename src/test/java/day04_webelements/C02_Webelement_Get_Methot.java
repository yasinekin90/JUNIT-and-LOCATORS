package day04_webelements;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_Webelement_Get_Methot {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //http://a.testaddressbook.com/ adresine gidiniz.
       /* driver.get("http://a.testaddressbook.com/");
        //Sign in linkini locate edelim
        WebElement signIn=driver.findElement(By.id("sign-in"));
        System.out.println("signIn = " + signIn.getText());//Buton üzerindeki yazıyı aldık
        System.out.println("signIn.getAriaRole() = " + signIn.getAriaRole());//Butonun özelliğini gösterir .ÖRN; LİNK
        System.out.println("signIn.getAttribute() = " + signIn.getAttribute("id"));
        System.out.println("signIn.getTagName() = " + signIn.getTagName());//WEBelementin tag ini verir
        System.out.println("signIn.getRect() = " + signIn.getRect().height);//butonun yüksekliği
        System.out.println("signIn.getRect() = " + signIn.getRect().width);//butonun genişligi
        System.out.println("signIn.getCssValue() = " + signIn.getCssValue("color"));//webelementin yazı rengi*/

        driver.get("http://edabit.com/");
        WebElement signIn= driver.findElement(By.tagName("a"));
        System.out.println("signIn = " + signIn.getText());//Buton üzerindeki yazıyı aldık
        System.out.println("signIn.getAttribute() = " + signIn.getAttribute("tagname"));
        System.out.println("signIn.getRect() = " + signIn.getRect().height);//butonun yüksekliği
        System.out.println("signIn.getRect() = " + signIn.getRect().width);//butonun genişligi
        System.out.println("signIn.getCssValue() = " + signIn.getCssValue("color"));//webelementin yazı rengi*/

        //!WebElement Is Method’lari
        //? webElement.isEnable( ); Web Element erisilebilir ise true yoksa false doner
        System.out.println("signIn.isEnabled() = " + signIn.isEnabled());
        //? webElement.isDisplayed( ); Web Element gorunur ise true yoksa false doner
        System.out.println("signIn.isDisplayed() = " + signIn.isDisplayed());
        //? webElement.isSelected( ); Web Element secili ise true yoksa false doner
        System.out.println("signIn.isSelected() = " + signIn.isSelected());
    }
}
