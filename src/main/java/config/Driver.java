package config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;


public class Driver {
    public static WebDriver firefoxdriver() {
        WebDriver firefoxDriver = new FirefoxDriver();
        return firefoxDriver;
    }

    public static   WebDriver chromedriver() {
        WebDriver chromeDriver = new ChromeDriver();
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

    public static WebDriver htmlUnitDriver() {
        WebDriver htmlUnitDriver = new HtmlUnitDriver(true);
        return htmlUnitDriver;
    }

    public static WebDriver phantomJSDriver() {
        WebDriver phantomJSDriver = new PhantomJSDriver();
        return phantomJSDriver;
    }
}
