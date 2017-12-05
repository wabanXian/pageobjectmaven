package doto;


import domain.dxcsass;
import org.testng.annotations.Test;
import service.LoginPage;

/**
 * Created by IntelliJ IDEA.
 * User: Xiaowawa
 * Date: 2017/11/28
 * Time: 13:48
 */
@Test
public class TestLogin {
    LoginPage loginPage = new LoginPage();
    dxcsass dxcsass = new dxcsass();

    public boolean login() throws InterruptedException {
    return    loginPage.Login(dxcsass.getUsrname(), dxcsass.getPassword());
    }

    public String resultmsg() {
        return loginPage.getErr();
    }
}
