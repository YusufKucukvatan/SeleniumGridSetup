import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class RemoteTest {
    public static void main(String[] args) throws MalformedURLException {
        //1.Desired Capabilities
        DesiredCapabilities cap=new DesiredCapabilities();
        cap.setBrowserName("chrome");
        cap.setPlatform(Platform.MAC); //==> We can not use WINDOWS in this computer. We can ask support team in company to provide all kinds of OC...
        //cap.setVersion("ChromeDriver 77.0.3865.40");

        //WebDriver driver=new ChromeDriver(); ==> instead of this we use RemoteWebDriver...
        String hubUrl = "http://192.168.1.94:4444/wd/hub";
        WebDriver driver=new RemoteWebDriver(new URL(hubUrl), cap);
        driver.get("http://google.com");
    }
}
