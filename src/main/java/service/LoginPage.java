package service;


import com.fasterxml.jackson.annotation.JsonProperty;
import config.Driver;
import config.XiaowawaConfiguration;
import domain.Element;
import domain.dxcsass;

import lombok.Getter;
import lombok.Setter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.net.MalformedURLException;
import java.util.Objects;


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
    Element Element;
    WebDriverWait wait = new WebDriverWait(webDriver, 30);

    {
        Element = PageFactory.initElements(webDriver, Element.class);
    }


    public boolean gettitle() throws MalformedURLException {
        boolean rel;
        Element.getweburl(webDriver);
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
            Element.getweburl(webDriver);
            rel = checkmsg(webDriver.getTitle(), dxcsass.getWebtitle());
            if (!rel) {
                setErr("与期望结果不一致 :" + "need : " + dxcsass.getWebtitle() + " but found:  " + webDriver.getTitle());
                webDriver.quit();
            } else {
                Element.setLogin();
                rel = checkmsg(webDriver.getTitle(), dxcsass.getLogintitle());
                if (!rel) {
                    setErr("与期望结果不一致 :" + "need : " + dxcsass.getLogintitle() + " but found:  " + webDriver.getTitle());
                    webDriver.quit();
                } else {
                    Element.setLoginusrname(usrname);
                    Element.setLoginpassword(password);
                    Element.setLoginbtnid();
                    wait.until(ExpectedConditions.presenceOfElementLocated(By.id("topSearch")));
                    rel = checkmsg(Element.getexittext(), dxcsass.getExittxt());
                    if (!rel) {
                        setErr("与期望结果不一致 :" + "need : " + dxcsass.getExittxt() + " but found:  " + Element.getexittext());
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


    public boolean mLogin(String Usrname, String password) throws InterruptedException {
        boolean rel = true;
        Element.getmsiteurl(webDriver);
        rel = checkmsg(webDriver.getTitle(), dxcsass.getMsitetitle());
        if (!rel) {
            setErr("与期望结果不一致 :" + "need : " + dxcsass.getExittxt() + " but found:  " + Element.getexittext());
            webDriver.quit();
        } else {
            Element.setMy();
            Element.setMsiteloginusrname(Usrname);
            Element.setMsiteloginpassword(password);
            Element.setMlogin();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/ul/li[1]/a/em")));
            rel = checkmsg(Element.getmsitesigntxt(), dxcsass.getMsitesigntxt());
            if (!rel) {
                setErr("与期望结果不一致 :" + "need : " + dxcsass.getMsitesigntxt() + " but found:  " + Element.getmsitesigntxt());
                webDriver.quit();
            } else {
                webDriver.quit();
            }
        }
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
