package day05_XPath_CssSelector;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_Xpath_Text {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin

        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
        //Add Element butonuna basin
        WebElement addElementButton= driver.findElement(By.xpath("//*[@id=\"content\"]/div/button"));
        addElementButton.click();
        addElementButton.click();
        addElementButton.click();
        //Delete butonu’nun ikincisinin  gorunur oldugunu test edin
        WebElement deleteButton=driver.findElement(By.xpath("//*[@id=\"elements\"]/button[2]"));
        if(deleteButton.isDisplayed()){
            System.out.println(" delete buton görünür");
        }else {
            System.out.println(" delete Buton görünmez");
        }
        //Delete tusuna basin
        driver.findElement(By.xpath("//*[@id=\"elements\"]/button[3]")).click();

        //*“Add/Remove Elements” yazisinin gorunur oldugunu test edin

        WebElement text=driver.findElement(By.xpath("//*[@id=\"content\"]/h3"));

        if(text.isDisplayed()){
            System.out.println("ADD/REMOVE ELEMENT görünür");
        }else {
            System.out.println("ADD/REMOVE ELEMENT görünmez");
        }

        driver.close();
    }
}
