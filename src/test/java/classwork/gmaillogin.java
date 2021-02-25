package classwork;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class gmaillogin {
    @Test()
    public void InputEmailInGmailLogin() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver wd = new ChromeDriver();
        wd.get("https://www.gmail.com");
        wd.manage().window().maximize();
        WebElement emailElement = wd.findElement(By.name("identifier"));
        String email = "qatesting00567@gmail.com";
        emailElement.sendKeys(email);
        WebElement nextElement = wd.findElement(By.className("VfPpkd-RLmnJb"));
        nextElement.click();
       //WebDriverWait wait = new WebDriverWait(wd,30);
       WebElement passwordElement = wd.findElement(By.className("whsOnd zHQkB" ));
        WebDriverWait wait = new WebDriverWait(wd,3);
      //  wait.until(ExpectedConditions.elementToBeClickable(passwordButton));
       //WebElement passwordElements = wd.findElement(By.xpath("//input[@type='password']"));
       //String jogen = "Test@123";//"Test@123";
       // Thread.sleep(1000);
      // passwordElements.sendKeys(jogen);
        WebElement passwordButton = wd.findElement(By.xpath("//input[@type='password']"));
       WebDriverWait wwait = new WebDriverWait(wd,3);
        wait.until(ExpectedConditions.elementToBeClickable(passwordButton));
      passwordButton.sendKeys("Test@123");
        WebElement NextElement = wd.findElement(By.className("whsOnd zHQkBf"));
        NextElement.click();
        Thread.sleep(1000);
        wd.close();

    }
}
