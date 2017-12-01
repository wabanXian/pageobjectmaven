package doto;


import domain.dxcsass;
import service.LoginPage;

/**
 * Created by IntelliJ IDEA.
 * User: Xiaowawa
 * Date: 2017/11/28
 * Time: 13:48
 */
public class TestLogin {
    LoginPage loginPage = new LoginPage();
    dxcsass dxcsass;

    public boolean gettitle() {
        return loginPage.gettitle();
    }

    public void login() throws InterruptedException {
        loginPage.Login(dxcsass.getUsrname(), dxcsass.getPassword());
    }

    public String resultmsg() {
        return loginPage.getErr();
    }
}
