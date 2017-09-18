import com.migos.TopRatedPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Movies {
    @Test
    public void selectTopRatedMovie() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.imdb.com/?ref_=nv_home");
        TopRatedPage panel = new TopRatedPage(driver);
        panel.selectMovies();
        Thread.sleep(1000);
        panel.setTopRatedMovies();
        panel.printAllTopRatedMovies();
    }
}