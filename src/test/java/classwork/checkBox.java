package classwork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class checkBox {
    WebDriver wd;
    @Before
    public void    setup() {
        WebDriverManager.chromedriver().setup();
        wd = new ChromeDriver();
        wd.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");
        wd.manage().window().maximize();
    }
    @Test
    public void  check() {
        String expected = "Uncheck All";
        List<WebElement> alls = wd.findElements(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/div/label/input"));
        for (WebElement all:alls){
            all.click();
        }
            WebElement G= wd.findElement(By.xpath("//input[@value='Uncheck All']"));
           // System.out.println(G.getAttribute({"value"));
          //String  text = G.getText();
        Assert.assertEquals(expected,(G.getAttribute("value")));
        System.out.println(G.getAttribute("value"));

    }
    @Test
    public void  checkSome() throws InterruptedException{
        //JavascriptException js = (JavascriptExecutor) driver;
       //js.executeScript("window.scrollBy(0,400")
        String expected = "Uncheck All";
       List<WebElement> some = wd.findElements(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/div/label/input"));
        for(int i =0; i< some.size(); i++){
            some.get(1).click();
            some.get(3).click();
        }
        Thread.sleep(5000);





        WebElement G= wd.findElement(By.xpath("//input[@value='Check All']"));
        // System.out.println(G.getAttribute({"value"));
        //String  text = G.getText();
        Assert.assertEquals(expected,(G.getAttribute("value")));
        System.out.println(G.getAttribute("value"));


    }
    @After
    public void exit() {wd.quit();}
}
