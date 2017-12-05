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


    public boolean order() throws InterruptedException {
        return orderPage.lloginandorder();
    }
    public boolean ordret() throws InterruptedException{
        return  orderPage.orderlogin();
    }
    public String resultmsg() {
        return orderPage.getErr();
    }
}
