package service;

import config.Driver;
import domain.dxcsass;
import domain.element;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by IntelliJ IDEA.
 * User: Xiaowawa
 * Date: 2017/12/1
 * Time: 16:26
 */
public class OrderPage {
    WebDriver webDriver = Driver.htmlUnitDriver(false);
    LoginPage loginPage = new LoginPage();
    dxcsass dxcsass = new dxcsass();
    JavascriptExecutor js = (JavascriptExecutor)webDriver;
    element element;

    {
        element = PageFactory.initElements(webDriver, element.class);
    }

    public boolean lloginandorder() throws InterruptedException {
        boolean rel;
        webDriver.get(dxcsass.getWeburl());
        loginPage.Login(dxcsass.getUsrname(), dxcsass.getPassword());
        webDriver.get("http://www.kjt.com/product/detail/260419");
        System.out.println(webDriver.getTitle());
        System.out.println(dxcsass.getProducttitle());
        rel = loginPage.checkmsg(webDriver.getTitle(), dxcsass.getProducttitle());
        if (rel == false) {
            loginPage.setErr("与期望结果不一致 :" + " we need : " + dxcsass.getWebtitle() + " but found:  " + webDriver.getTitle());
            webDriver.quit();
        } else {
            element.addcart();
            element.tocart();
            element.submitorder();
            element.nowpay();
            element.finpay();
            element.voidbth();
            js.executeScript("document.getElementsByName(\'corder\')[6].checked=true");
            element.invaildorder();
        }
        return rel;
    }
}
