package classwork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.hc.core5.util.Asserts;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class highestSalary {
    WebDriver wd;

    @Before
    public void setup() {
        WebDriverManager.chromedriver().setup();
        wd = new ChromeDriver();
        wd.get("https://datatables.net/examples/data_sources/dom");
        wd.manage().window().maximize();
    }
    @Test
    public void submissionType()
    {
        WebDriverWait wait = new WebDriverWait(wd, 10);
        By nextButtonLocator = By.cssSelector("a.next_btn:not(.inactive)");
        List<WebElement> nextButton = wd.findElements(By.xpath("//*[@id=\"example_next\"]"));
        while (!nextButton.isEmpty())
        {
            double sum = 0.00;
           // processPage();
            List<WebElement> rows = wd.findElements(By.xpath("//*[@id=\"example\"]/tbody/tr/td[6]"));
            for (WebElement row:rows)

            {
               // for(int i = 0; )
                double no = Double.parseDouble(row.getText());
                sum = sum + no;
                //System.out.print(sum);

            }
          // System.out.print(rows.toString());
            System.out.print(sum);
            nextButton.get(0).click();
           // wait.until(.stalenessOf(nextButton.get(0))); // wait until the page transitions
            nextButton = wd.findElements(By.xpath("//*[@id=\"example_next\"]"));
        }
    }

    private void processPage()
    {
        for (WebElement checkbox : wd.findElements(By.xpath("//td[@class='gridDetail'][2]")))
        {
            Asserts.notNull(checkbox.getText(), "File");
        }
    }


    @After
    public void exit() {
        wd.quit();
    }
}