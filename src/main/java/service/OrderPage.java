package service;

import config.Driver;
import domain.dxcsass;
import domain.Element;
import lombok.Getter;
import lombok.Setter;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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
    WebDriverWait wait = new WebDriverWait(webDriver, 30);
//    Actions action = new Actions(webDriver);

    Element Element;

    {
        Element = PageFactory.initElements(webDriver, Element.class);
    }

    public boolean lloginandorder() throws InterruptedException {
        boolean rel;
        webDriver.get(dxcsass.getWeburl());
        Element.setLogin();
        Element.setLoginusrname(dxcsass.getUsrname());
        Element.setLoginpassword(dxcsass.getPassword());
        Element.setLoginbtnid();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("topSearch")));
        webDriver.get("http://www.kjt.com/product/detail/260419");
        rel = checkmsg(webDriver.getTitle(), dxcsass.getProducttitle());
        if (!rel) {
            setErr("与期望结果不一致 :" + " we need : " + dxcsass.getWebtitle() + " but found:  " + webDriver.getTitle());
            webDriver.quit();
        } else {
            Element.addcart();
            Thread.sleep(500);
//            Element.tocart();
            js.executeScript("document.getElementById('CartCTNRUrl').click()");
            Thread.sleep(200);
            Element.tocheckout();
            Thread.sleep(500);
            js.executeScript("window.scrollTo(0,700)");
//            Element.setPaytype();
            Element.setPaytypewithoutpic();
            Thread.sleep(500);
            js.executeScript("document.getElementById('btnSubmit').click()");
            Element.nowpay();
            String handle = webDriver.getWindowHandle();
            webDriver.switchTo().window(handle);
            Element.finpay();
//            action.keyDown(Keys.CONTROL).sendKeys(Keys.TAB).keyUp(Keys.CONTROL).sendKeys(Keys.NULL).perform();
//            action.keyDown(Keys.CONTROL).sendKeys("w").keyUp(Keys.CONTROL).sendKeys(Keys.NULL).perform();
            Element.voidbth();
            js.executeScript("document.getElementsByName(\'corder\')[6].checked=true");
            Element.invaildorder();
            wait.until(ExpectedConditions.alertIsPresent());
            webDriver.quit();
        }
        webDriver.quit();
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
            Element.addcart();
            Thread.sleep(500);
            // Element.tocart();
            js.executeScript("document.getElementById('CartCTNRUrl').click()");
            Thread.sleep(200);
            Element.tocheckout();
            Element.setminiusrname(dxcsass.getUsrname());
            Element.setminipassword(dxcsass.getPassword());
            Element.minilogin();
            Thread.sleep(500);
            Element.tocheckout();
            Thread.sleep(500);
            js.executeScript("window.scrollTo(0,700)");
            Element.setPaytypewithoutpic();
            Thread.sleep(500);
            js.executeScript("document.getElementById('btnSubmit').click()");
            Element.nowpay();
            String handle = webDriver.getWindowHandle();
            webDriver.switchTo().window(handle);
            Element.finpay();
//            action.keyDown(Keys.CONTROL).sendKeys(Keys.TAB).keyUp(Keys.CONTROL).sendKeys(Keys.NULL).perform();
//            action.keyDown(Keys.CONTROL).sendKeys("w").keyUp(Keys.CONTROL).sendKeys(Keys.NULL).perform();
            Element.voidbth();
            js.executeScript("document.getElementsByName(\'corder\')[6].checked=true");
            Element.invaildorder();
            webDriver.quit();
        }
        webDriver.quit();
        return rel;
    }

    public boolean msiteloginandorder() throws InterruptedException {
        boolean rel;
        webDriver.get(dxcsass.getMsiteurl());
        Element.setMy();
        Element.setMsiteloginusrname(dxcsass.getUsrname());
        Element.setMsiteloginpassword(dxcsass.getPassword());
        Element.setMlogin();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/ul/li[1]/a/em")));
        rel = checkmsg(Element.getmsitesigntxt(), dxcsass.getMsitesigntxt());
        if (!rel) {
            setErr("与期望结果不一致 :" + "need : " + dxcsass.getMsitesigntxt() + " but found:  " + Element.getmsitesigntxt());
            webDriver.quit();
        } else {
            webDriver.get(dxcsass.getMsiteproducturl());
            Element.setMtocheckout();
            Element.setMsubmitorder();
            String handle = webDriver.getWindowHandle();
            Element.setMpayclick();
            webDriver.switchTo().window(handle);
            Thread.sleep(1500);
            js.executeScript("document.getElementsByTagName('span')[7].click()");
//            Element.setMy();
            js.executeScript("window.scrollTo(0,700)");
            Element.setMgetorder();
            Element.setMvoidorder();
            Element.setMcancleOrder();
            Element.setMthrowssa();
            Thread.sleep(500);
            webDriver.quit();
        }
        webDriver.quit();
        return rel;
    }

    public boolean msiteorderlogin() throws InterruptedException {
        boolean rel = true;
        webDriver.get("http://m.kjt.com/product/detail/260419");
//        if (!rel) {
//            setErr("与期望结果不一致 :" + " we need : " + dxcsass.getMsitetitle() + " but found:  " + webDriver.getTitle());
//            webDriver.quit();
//        } else {
        Element.setMtocheckout();
        Element.setMsiteloginusrname(dxcsass.getUsrname());
        Element.setMsiteloginpassword(dxcsass.getPassword());
        Element.setMlogin();
        Thread.sleep(500);
        Element.setMsubmitorder();
        String handle = webDriver.getWindowHandle();
        Element.setMpayclick();
        webDriver.switchTo().window(handle);
        Thread.sleep(1500);
        js.executeScript("document.getElementsByTagName('span')[7].click()");
//            Element.setMy();
        js.executeScript("window.scrollTo(0,700)");
        Element.setMgetorder();
        Element.setMvoidorder();
        Element.setMcancleOrder();
        Element.setMthrowssa();
        Thread.sleep(500);
        webDriver.quit();
//        }
        webDriver.quit();
        return rel;
    }


    private boolean checkmsg(String str1, String str2) {
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
