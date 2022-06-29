package autoIT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

public class FileUpload {

    //Example to how run AutoIT Script into Selenium Automation


    /**
     *
     * ControlFocus("Open","","Edit1")
     *
     * ControlSetText("Open","","Edit1","C:\Users\user\Documents\check\visit.pdf")
     *
     * ControlClick("Open","","Button1")
     * */

    public static void main(String[] args) throws InterruptedException, IOException {
        String path = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver","src/test/java/resources/chromedriver.exe");

        HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
        chromePrefs.put("profile.default_content_settings.popups",0);
        chromePrefs.put("download.default_directory",path);

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setExperimentalOption("prefs",chromePrefs);

        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://pdftoimage.com/");
        driver.findElement(By.cssSelector("label[aria-label='Upload Files'] span[class='button__text']")).click();
        Thread.sleep(3000);
        Runtime.getRuntime().exec("colocar o script do autoIT\\fileupload.exe");
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button[aria-label='Download All'] span[class='button__text']"))).click();

        File file = new File(path + "convert.zip");
        System.out.println(file.exists()? "File exists in you system" + file.delete(): "File not found!");

    }
}
