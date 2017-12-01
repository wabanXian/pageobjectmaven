package service;


import config.Driver;
import domain.dxcsass;
import domain.element;

import lombok.Getter;
import lombok.Setter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


/**
 * Created by IntelliJ IDEA.
 * User: Xiaowawa
 * Date: 2017/11/28
 * Time: 10:15
 */
public class LoginPage {

    WebDriver webDriver = Driver.htmlUnitDriver(true);
    dxcsass dxcsass = new dxcsass();
    element element;

    {
        element = PageFactory.initElements(webDriver, domain.element.class);
    }


    public boolean gettitle() {
        boolean rel;
        element.getweburl(webDriver);
        rel = checkmsg(webDriver.getTitle(), dxcsass.getWebtitle());
        if (rel == false) {
            setErr("与期望结果不一致 :" + " we need : " + dxcsass.getWebtitle() + " but found:  " + webDriver.getTitle());
        }
        return rel;

    }

    public void Login(String usrname, String password) throws InterruptedException {
        element.getweburl(webDriver);
        element.setLogin();
        element.setLoginusrname(usrname);
        element.setLoginpassword(password);
        element.setLoginbtnid();
        Thread.sleep(2000);
    }

    public boolean checkmsg(String str1, String str2) {
        boolean rel = true;
        if (str1 != str2) {
            rel = false;
        }
        return rel;
    }

    @Getter
    @Setter
    private String err;
}
