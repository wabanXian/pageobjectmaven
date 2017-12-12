package doto;


import domain.dxcsass;

import org.junit.Test;
import service.LoginPage;

import java.net.MalformedURLException;

/**
 * Created by IntelliJ IDEA.
 * User: Xiaowawa
 * Date: 2017/11/28
 * Time: 13:48
 */

public class TestLogin {
    LoginPage loginPage = new LoginPage();
    dxcsass dxcsass = new dxcsass();

    public void sd() throws MalformedURLException {
        loginPage.gettitle();
    }

    public boolean login() throws InterruptedException {
        return loginPage.Login(dxcsass.getUsrname(), dxcsass.getPassword());
    }

    public String resultmsg() {
        return loginPage.getErr();
    }
}
