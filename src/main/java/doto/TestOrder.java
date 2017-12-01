package doto;

import service.LoginPage;
import service.OrderPage;

/**
 * Created by IntelliJ IDEA.
 * User: Xiaowawa
 * Date: 2017/12/1
 * Time: 16:26
 */
public class TestOrder {
    OrderPage orderPage = new OrderPage();
    LoginPage loginPage = new LoginPage();

    public boolean order() throws InterruptedException {
        return orderPage.lloginandorder();
    }

    public String resultmsg() {
        return loginPage.getErr();
    }
}
