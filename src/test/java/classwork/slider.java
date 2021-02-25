package classwork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class slider {
    WebDriver wd;
    Actions move;

    @Before
    public void    setup() {
        WebDriverManager.chromedriver().setup();
        wd = new ChromeDriver();
        wd.get("http://automationpractice.com/index.php");
        wd.manage().window().maximize();

         }
@Test
public void verifyFooterList() throws InterruptedException {
    int target = 53;
    wd.findElement(By.xpath("//a[@title='Women']")).click();
    JavascriptExecutor js = (JavascriptExecutor) wd;
    js.executeScript("Window.ScrollBy(0,1500)");
    WebElement slider = wd.findElement(By.cssSelector(".ui-slider-range.ui-widget-header.ui-corner-all"));
    Thread.sleep(5000);
    int method =2;
           if(method==1) {
                  for (int i = 1; i <= target; i = i + 10) {
                      //slider.sendKeys(Keys.ARROW_RIGHT);
                      Action action = move.dragAndDropBy(slider, i, 0).build();
                      action.perform();
                  }
              }

    if(method == 2){
        move.dragAndDropBy(slider,150,0).build().perform();
    }
    Thread.sleep(3000);
    Assert.assertEquals(wd.findElement(By.id("layered_price_range")).getText(), "$53.00 - $53.00");
    }
    @After
    public void exit() {wd.quit();}
}