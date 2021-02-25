package classwork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class More  {
    @Test

    public void InputEmailInGmailLogin() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver wd = new ChromeDriver();
        wd.get("https://www.w3schools.com/html/html_tables.asp");
        //wd.get("https://www.gmail.com");
        WebElement ram = wd.findElement(By.xpath("//*[@id='\"topnavbtn_tutorials\"]"));
        ram.click();

        wd.manage().window().maximize();

    }
}
