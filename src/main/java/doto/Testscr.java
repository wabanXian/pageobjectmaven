package doto;

import service.scrPage;

/**
 * Created by IntelliJ IDEA.
 * User: Xiaowawa
 * Date: 2017/12/8
 * Time: 14:12
 */
public class Testscr {
    scrPage scrPage = new scrPage();

    public boolean sc() throws Exception {
        return scrPage.getscrss();
    }

    public String resultmsg() {
        return scrPage.getErr();
    }
}
