package classwork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class verifyorder {
    //WebDriver wd;
    @Test

    public void verify() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
      WebDriver Driver = new ChromeDriver();
        Driver.get("http://automationpractice.com/index.php");
        Driver.manage().window().maximize();


        List<String> ExpectedOrder = new ArrayList<String>(Arrays.asList("My orders","My credit slips", "My addresses", "My personal info"));
        List<WebElement> rows = Driver.findElements(By.xpath("//*[@id=\"footer\"]/div/section[5]/div/ul/li/a"));
         //System.out.println(rows);
        List<String> lstSelectedItem = new ArrayList<String>();
        for (WebElement row:rows){
            lstSelectedItem.add(row.getText());
            //Assert.assertEquals(ExpectedOrder,lstSelectedItem);
        }
        System.out.println(rows.toString());
        Assert.assertEquals(ExpectedOrder,lstSelectedItem);
    }


}
