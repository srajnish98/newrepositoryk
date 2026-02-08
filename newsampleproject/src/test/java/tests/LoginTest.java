package tests;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.URL;

public class LoginTest {

    @Test
    public void openGoogle() throws Exception {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setBrowserName("chrome");

        WebDriver driver = new RemoteWebDriver(
                new URL("http://selenium-hub:4444/wd/hub"), caps);

        driver.get("https://www.google.com");
        System.out.println(driver.getTitle());
        driver.quit();
    }
}

