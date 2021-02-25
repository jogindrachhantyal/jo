package classwork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class openBrowser {
    @Test
    public void opensafari() throws InterruptedException{
        WebDriverManager.chromedriver().setup();
        WebDriver wd = new ChromeDriver();
        wd.get("http://www.facebook.com");
        wd.manage().window().maximize();
       // wd.findElement(By.name("identified"));
        Thread.sleep(1000);
        wd.close();
    }
}
