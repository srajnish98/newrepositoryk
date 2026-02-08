package tests;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.URL;

public class LoginTest {

    @Test
    public void openGoogle() throws Exception {
    	ChromeOptions options = new ChromeOptions();
    	options.addArguments("--no-sandbox");
    	options.addArguments("--disable-dev-shm-usage");   	

    	// Connect to the port-forwarded Hub
    	
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setBrowserName("chrome");
        options.merge(caps);
        WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), options);

        driver.get("https://www.google.com");
        System.out.println(driver.getTitle());
        driver.quit();
    }
}

