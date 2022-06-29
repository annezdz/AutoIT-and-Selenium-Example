package autoIT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowPopUpHandle {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/test/java/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://admin:admin@the-internet.herokuapp.com/");
        driver.findElement(By.cssSelector("a[href='/basic_auth']")).click();

    }
}
