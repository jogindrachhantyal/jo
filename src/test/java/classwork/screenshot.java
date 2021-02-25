package classwork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.util.Random;

public class screenshot {

    WebDriver wd;
    @Before
    public void    setup() {
        WebDriverManager.chromedriver().setup();
        wd = new ChromeDriver();
        wd.get("https://www.gmail.com");
        wd.manage().window().maximize();

    }
    @Test
            public void screen() throws Exception {
        WebElement emailElement = wd.findElement(By.name("identifier"));
        String email = "qatesting00567@gmail.com";
        String pass = "Test@123";
        emailElement.sendKeys(email);
        WebElement nextElement = wd.findElement(By.className("VfPpkd-RLmnJb"));
        nextElement.click();
        WebDriverWait wait = new WebDriverWait(wd, 30);
        WebElement txtpsd = wd.findElement(By.xpath("//input[@name='password']"));
        txtpsd.sendKeys(pass);
        WebElement btnsmt = wd.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input"));
        btnsmt.click();
        Thread.sleep(2000);
        takeSnapShot(wd);
        Thread.sleep(3000);

    }

public static void takeSnapShot(WebDriver wd) throws IOException {
    TakesScreenshot scrShot =((TakesScreenshot)wd);
    File ScrFile = scrShot.getScreenshotAs(OutputType.FILE);
    Random r = new Random();
    int rand = r.nextInt(1000);
    String filePath = System.getProperty("user.dir") + "\\screen";
    File file = new File(filePath + "\\" +rand+"_shot.jpeg");
    FileUtils.copyFile(ScrFile, file);
}
@After
public void exit() {wd.quit();}
}