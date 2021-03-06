package config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.File;
import java.net.URL;
import java.util.concurrent.TimeUnit;


public class Driver {
    public static WebDriver firefoxdriver() {
        WebDriver firefoxDriver = new FirefoxDriver();

        return firefoxDriver;
    }

    public static WebDriver chromedriver() {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addExtensions(new File("C:\\Block-image_v1.0.crx"));
//        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
//        capabilities.setCapability(ChromeDriverService.CHROME_DRIVER_EXE_PROPERTY, true);
//        capabilities.setCapability(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, true);
//        capabilities.setCapability(ChromeOptions.CAPABILITY, options);
        WebDriver chromeDriver;
        chromeDriver = new ChromeDriver(options);
        chromeDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        chromeDriver.manage().window().maximize();
        return chromeDriver;
    }

    public static WebDriver internetExplorerDriver() {
        WebDriver internetExplorerDriver = new InternetExplorerDriver();
        return internetExplorerDriver;
    }

    public static WebDriver edgeDriver() {
        WebDriver edgeDriver = new EdgeDriver();
        return edgeDriver;
    }

    public static WebDriver operaDriver() {
        WebDriver operaDriver = new OperaDriver();
        return operaDriver;
    }

    public static WebDriver htmlUnitDriver(boolean sa) {
        sa = false;
        WebDriver htmlUnitDriver = new HtmlUnitDriver(sa);
        return htmlUnitDriver;
    }

    public static WebDriver phantomJSDriver() {
        WebDriver phantomJSDriver = new PhantomJSDriver();
        return phantomJSDriver;
    }
}
