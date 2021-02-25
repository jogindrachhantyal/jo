package classwork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class alert {
    WebDriver wd;
    @Before
    public void    setup() {
        WebDriverManager.chromedriver().setup();
        wd = new ChromeDriver();
        wd.get("http://demo.guru99.com/test/delete_customer.php");
        wd.manage().window().maximize();
    }
    @Test
    public void handleAlert() throws InterruptedException {
        wd.findElement(By.name("cusid")).sendKeys("50");
        wd.findElement(By.name("submit")).submit();
        WebDriverWait wait = new WebDriverWait(wd,30);
                wait.until(ExpectedConditions.alertIsPresent());
                Alert alert = wd.switchTo().alert();
                String alertMsg= wd.switchTo().alert().getText();
                System.out.println(alertMsg);
                alert.dismiss();


    }
}
