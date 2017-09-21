import com.migos.DelayedButton;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class DelayedClick {
    @Test
    public void pageOpening() {
        WebDriver driver = new ChromeDriver();
        driver.get("file:///D:/Downloads/kos.html");
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//body//button[@class='hide']"))).click();
        DelayedButton b = new DelayedButton(driver);
        Assert.assertEquals(b.getTextOfButton(),"Clicked 1");
    }
}