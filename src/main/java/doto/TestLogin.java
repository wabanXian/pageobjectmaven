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
    dxcsass dxcsass = new dxcsass();

    public void gettitle() {
        loginPage.gettitle();
        loginPage.checktitle(dxcsass.getWebtitle(),"");
    }

    public void login() throws InterruptedException  {
        loginPage.Login("18708151438", "zang1020330");
        loginPage.checktitle(dxcsass.getWebtitle(),"");
    }

}
