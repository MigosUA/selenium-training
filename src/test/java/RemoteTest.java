import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.URL;

public class RemoteTest {
    @Test
    public void remoteTest1() throws MalformedURLException {
        DesiredCapabilities capability = DesiredCapabilities.chrome();
        WebDriver driver = new RemoteWebDriver(new URL("http://172.22.90.64:4444/wd/hub"), capability);
        driver.get("http://www.facebook.com");
    }
}
