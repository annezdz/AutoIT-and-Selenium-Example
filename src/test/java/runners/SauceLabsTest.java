package runners;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class SauceLabsTest {

    public static final String USERNAME = "annezdz@hotmail.com";
    public static final String ACCESS_KEY = "c38cc18c-7f58-4517-8a11-945b4681e7fe";
    public static final String URL = "http://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:80/wd/hub";


    public static void main(String[] args) throws MalformedURLException {


        ChromeOptions browserOptions = new ChromeOptions();
        browserOptions.setCapability("platformName", "Windows 10");
        browserOptions.setCapability("browserVersion", "latest");
        Map<String, Object> sauceOptions = new HashMap<>();

        browserOptions.setCapability("sauce:options", sauceOptions);

        URL url = new URL("https://oauth-annezdz-54eff:c38cc18c-7f58-4517-8a11-945b4681e7fe@ondemand.us-west-1.saucelabs.com:443/wd/hub");
        RemoteWebDriver driver = new RemoteWebDriver(url, browserOptions);

        driver.get("http://www.google.com");
        System.out.println(driver.getTitle());
    }
}
