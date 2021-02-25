package classwork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class sumTable {
    WebDriver wd;
    @Before
    public void    setup() {
        WebDriverManager.chromedriver().setup();
        wd = new ChromeDriver();
        wd.get("https://www.w3schools.com/sql/sql_count_avg_sum.asp");
        wd.manage().window().maximize();
    }
    @Test
    //public void setup(){
    public void sumTable() {
        double expectedSum = 90.35;
    double  sum = 0.00;
        List<WebElement> rows = wd.findElements(By.xpath("//*[@id='main']/div[6]/table/tbody/tr/td[6]"));
        for (WebElement row:rows)
        {
            double no = Double.parseDouble(row.getText());
            sum = sum + no;
           // System.out.print(sum);

        }
        System.out.print(sum);
        Assert.assertEquals(expectedSum, sum, .00);

    }
    @After
    public void exit() {wd.quit();}
}
