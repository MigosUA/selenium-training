import com.migos.SearchPanel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FindSearchInput {
    @Test
    public void showAndCountElements() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.imdb.com/?ref_=nv_home");
        SearchPanel page = new SearchPanel(driver);
        page.SetSearch("game of");
        Thread.sleep(1000);
        Assert.assertEquals(page.elementCount(), 8, "Size of elements is not 8");
        for (String text2 : page.getText())
            Assert.assertTrue(text2.toLowerCase().contains("game of"), "Item: " + text2 + " does not contain 'game of'");
    }

    @Test
    public void SearchPage() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.imdb.com/?ref_=nv_home");
        SearchPanel page = new SearchPanel(driver);
        page.SetSearch("");
        page.selectSearchType("All");
        page.selectSearchType("TV Episodes");
        page.SetSearch("game of");
        page.setSubmitButton();
        Assert.assertEquals(page.findSectionElements(), 200, "Number of titles in search is not 200");
    }
}