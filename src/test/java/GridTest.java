import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class GridTest {
    public static void main(String[] args) throws MalformedURLException {

        //1. Defining desired caps
        DesiredCapabilities cap=new DesiredCapabilities();
        cap.setBrowserName("chrome");
        cap.setPlatform(Platform.MAC);

        //2. Chrome options definition
        ChromeOptions options=new ChromeOptions();
        options.merge(cap);

        String hubUrl = "http://192.168.1.94:4444/wd/hub";
        WebDriver driver=new RemoteWebDriver(new URL(hubUrl), options);

        driver.get("http://freecrm.com");
        System.out.println(driver.getTitle());
        driver.quit();
    }
}