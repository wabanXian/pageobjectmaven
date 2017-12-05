package service;

import config.Driver;
import domain.dxcsass;
import domain.element;

import lombok.Getter;
import lombok.Setter;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import java.util.Objects;

/**
 * Created by IntelliJ IDEA.
 * User: Xiaowawa
 * Date: 2017/12/1
 * Time: 16:26
 */
public class OrderPage {
    WebDriver webDriver = Driver.chromedriver();
    dxcsass dxcsass = new dxcsass();
    JavascriptExecutor js = (JavascriptExecutor) webDriver;
    Actions action = new Actions(webDriver);

    element element;

    {
        element = PageFactory.initElements(webDriver, element.class);
    }

    public boolean lloginandorder() throws InterruptedException {
        boolean rel;
        webDriver.get(dxcsass.getWeburl());
        element.setLogin();
        element.setLoginusrname(dxcsass.getUsrname());
        element.setLoginpassword(dxcsass.getPassword());
        element.setLoginbtnid();
        Thread.sleep(2000);
        webDriver.get("http://www.kjt.com/product/detail/260419");
        rel = checkmsg(webDriver.getTitle(), dxcsass.getProducttitle());
        if (!rel) {
            setErr("与期望结果不一致 :" + " we need : " + dxcsass.getWebtitle() + " but found:  " + webDriver.getTitle());
            webDriver.quit();
        } else {
            element.addcart();
            element.tocart();
            element.tocheckout();
            Thread.sleep(2000);
            js.executeScript("window.scrollTo(0,700)");
            element.setPaytype();
            Thread.sleep(2000);
            element.submitorder();
            element.nowpay();
            element.finpay();
            Thread.sleep(2000);
            action.keyDown(Keys.CONTROL).sendKeys(Keys.TAB).keyUp(Keys.CONTROL).sendKeys(Keys.NULL).perform();
            action.keyDown(Keys.CONTROL).sendKeys("w").keyUp(Keys.CONTROL).sendKeys(Keys.NULL).perform();
            element.voidbth();
            js.executeScript("document.getElementsByName(\'corder\')[6].checked=true");
            element.invaildorder();
            Thread.sleep(2000);
            webDriver.quit();
        }
        return rel;
    }

    public boolean orderlogin() throws InterruptedException {
        boolean rel;
        webDriver.get("http://www.kjt.com/product/detail/260419");
        rel = checkmsg(webDriver.getTitle(), dxcsass.getProducttitle());
        if (!rel) {
            setErr("与期望结果不一致 :" + " we need : " + dxcsass.getWebtitle() + " but found:  " + webDriver.getTitle());
            webDriver.quit();
        } else {
            element.addcart();
            Thread.sleep(1000);
            element.tocart();
            element.tocheckout();
            element.setminiusrname(dxcsass.getUsrname());
            element.setminipassword(dxcsass.getPassword());
            element.minilogin();
            Thread.sleep(1000);
            element.tocheckout();
            Thread.sleep(2000);
            js.executeScript("window.scrollTo(0,700)");
            Thread.sleep(2000);
            element.setPaytype();
            Thread.sleep(2000);
            element.submitorder();
            element.nowpay();
            element.finpay();
            Thread.sleep(2000);
            action.keyDown(Keys.CONTROL).sendKeys(Keys.TAB).keyUp(Keys.CONTROL).sendKeys(Keys.NULL).perform();
            action.keyDown(Keys.CONTROL).sendKeys("w").keyUp(Keys.CONTROL).sendKeys(Keys.NULL).perform();
            element.voidbth();
            js.executeScript("document.getElementsByName(\'corder\')[6].checked=true");
            element.invaildorder();
            Thread.sleep(2000);
            webDriver.quit();
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
    private String err;
}
