package service;


import com.fasterxml.jackson.annotation.JsonProperty;
import config.Driver;
import config.XiaowawaConfiguration;
import domain.dxcsass;
import domain.element;

import lombok.Getter;
import lombok.Setter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Objects;
import java.util.concurrent.TimeUnit;


/**
 * Created by IntelliJ IDEA.
 * User: Xiaowawa
 * Date: 2017/11/28
 * Time: 10:15
 */
public class LoginPage {

    WebDriver webDriver = Driver.chromedriver();
    dxcsass dxcsass = new dxcsass();
    XiaowawaConfiguration xiaowawaConfiguration;
    element element;
    WebDriverWait wait = new WebDriverWait(webDriver, 30);

    {
        element = PageFactory.initElements(webDriver, domain.element.class);
    }


    public boolean gettitle() throws MalformedURLException {
        boolean rel;
        element.getweburl(webDriver);
        rel = checkmsg(webDriver.getTitle(), dxcsass.getWebtitle());
        if (!rel) {
            setErr("与期望结果不一致 :" + " we need : " + dxcsass.getWebtitle() + " but found:  " + webDriver.getTitle());
            webDriver.quit();
        }
        return rel;
    }

    public boolean Login(String usrname, String password) throws InterruptedException {
        boolean rel = true;
        try {
            element.getweburl(webDriver);
            rel = checkmsg(webDriver.getTitle(), dxcsass.getWebtitle());
            if (!rel) {
                setErr("与期望结果不一致 :" + "need : " + dxcsass.getWebtitle() + " but found:  " + webDriver.getTitle());
                webDriver.quit();
            } else {
                element.setLogin();
                rel = checkmsg(webDriver.getTitle(), dxcsass.getLogintitle());
                if (!rel) {
                    setErr("与期望结果不一致 :" + "need : " + dxcsass.getLogintitle() + " but found:  " + webDriver.getTitle());
                    webDriver.quit();
                } else {
                    element.setLoginusrname(usrname);
                    element.setLoginpassword(password);
                    element.setLoginbtnid();
                    wait.until(ExpectedConditions.presenceOfElementLocated(By.id("topSearch")));
                    rel = checkmsg(element.getexittext(), dxcsass.getExittxt());
                    if (!rel) {
                        setErr("与期望结果不一致 :" + "need : " + dxcsass.getExittxt() + " but found:  " + element.getexittext());
                        webDriver.quit();
                    } else {
                        webDriver.quit();
                    }
                }
            }
        } catch (Exception e) {
            xiaowawaConfiguration.getscreen("C://sad.jpg", webDriver);
        }
        return rel;
    }


    public boolean mLogin(String Usrname,String password) throws InterruptedException{
        boolean rel = true;

        return rel;
    }

    public boolean checkmsg(String str1, String str2) {
        boolean rel = true;
        if (!Objects.equals(str1, str2)) {
            rel = false;
        }
        return rel;
    }

    @Getter
    @Setter
    @JsonProperty(value = "err")
    private String err;
}
