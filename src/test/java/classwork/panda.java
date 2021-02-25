package classwork;

import io.github.bonigarcia.wdm.WebDriverManager;
import okhttp3.WebSocketListener;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class panda {



    WebDriver wd;
    @Before
    public void    setup() {
        WebDriverManager.chromedriver().setup();
        wd = new ChromeDriver();
        wd.get("https://www.google.com");
        wd.manage().window().maximize();
    }
    @Test
    public void pipepanda() throws InterruptedException {
        String p = "panda";
        WebElement panda = wd.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[2]/div[1]/div[1]/div/div[2]/input"));
        panda.sendKeys(p);
        panda.submit();
        Thread.sleep(7000);

        List<WebElement> array = wd.findElements(By.xpath("//*[@id=\"rso\"]//a/h3"));
        List<String> jogen = new ArrayList<String>();
        //String filter = loop.getText();
        int size =0;
        for (WebElement loop : array) {
            String filter = loop.getText();
            if (filter.contains("|")) {

                System.out.println(filter);
                jogen.add(filter);
            }

        }

        int found = 0;
        for (int i = 1; i < jogen.size(); i++) {
            if (jogen.get(i).contains("zoo")) {
                found++;
                System.out.println(jogen);
            }
        }


        Assert.assertEquals(2, found);
    }
    @After
    public void exit() {wd.quit();}
}
