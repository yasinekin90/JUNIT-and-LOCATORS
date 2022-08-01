package day10_Junit_assertions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class C01_Checkbox {
    WebDriver driver;
    //todo
    // a. Verilen web sayfasına gidin.
    // https://the-internet.herokuapp.com/checkboxes
    // b. Checkbox1 ve checkbox2 elementlerini locate edin.
    // c. Checkbox1 seçili değilse onay kutusunu tıklayın
    // d. Checkbox2 seçili değilse onay kutusunu tıklayın
    @Before
    public void setup(){
        WebDriverManager.firefoxdriver().setup();
        driver=new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://the-internet.herokuapp.com/checkboxes");

    }
    @After
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.close();
    }
    @Test
    public void checkbox01(){
   WebElement checkbox01= driver.findElement(By.xpath("(//input[@type=\"checkbox\"])[1]"));
  // checkbox01.click();
    if(checkbox01.isSelected()){
        System.out.println("Checkbox01 is selected");
    }else{
        System.out.println("Checkbox01 is not selected");
        checkbox01.click();
    }



    }
    @Test
    public void checkbox02(){
        WebElement checkbox02= driver.findElement(By.xpath("(//input[@type=\"checkbox\"])[2]"));
       // checkbox02.click();
        if(checkbox02.isSelected()){
            System.out.println("Checkbox02 is selected.");
        }else{
            System.out.println("Checkbox02 is not selected.");
            checkbox02.click();
        }
    }
}
