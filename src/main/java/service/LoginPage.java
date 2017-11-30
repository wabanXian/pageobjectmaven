package service;


import ch.qos.logback.classic.Logger;
import ch.qos.logback.core.LogbackException;
import config.Driver;
import domain.dxcsass;
import domain.element;
import groovy.util.ObservableSet;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


/**
 * Created by IntelliJ IDEA.
 * User: Xiaowawa
 * Date: 2017/11/28
 * Time: 10:15
 */
public class LoginPage {

    WebDriver webDriver = Driver.htmlUnitDriver();
    dxcsass dxcsass = new dxcsass();
    element element;

    {
        element = PageFactory.initElements(webDriver, domain.element.class);
    }


    public void gettitle() {

        element.getweburl(webDriver);
    }

    public void Login(String usrname, String password) throws InterruptedException {
        element.getweburl(webDriver);
        element.setLogin();
        checktitle(dxcsass.getLogintitle(),"");
        element.setLoginusrname(usrname);
        element.setLoginpassword(password);
        element.setLoginbtnid();
        Thread.sleep(2000);
        element.setExittext();
    }

    public String checktitle(String string,String err){
        err="ok";
        if (webDriver.getTitle()!=string){
             err="与期望的值不一样";
        }
        return err;
    }

}
