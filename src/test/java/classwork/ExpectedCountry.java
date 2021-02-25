import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;
import java.util.List;

import static org.junit.Assert.*;
class ExpectedCountry {
WebDriver wd;
    @Test
    public void country() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        wd = new ChromeDriver();
        wd = new ChromeDriver();
        wd.get("https://www.w3schools.com/html/html_tables.asp");
        Thread.sleep(7000);
        wd.manage().window().maximize();
        String expectedCountry = "Nepal";
        byte found = 0;
        //Print all countries
        List<WebElement> rows = wd.findElements(By.xpath("//*[@id=\"customers\"]/tbody/tr/td[3]")); //no of rowsin a table
        for (WebElement row : rows) {
            System.out.println(row.getText());
            if (row.getText().equals(expectedCountry)) {
                found++;
                break;
            }
        }
        Assert.assertEquals(found,1);
    }
}