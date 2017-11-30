package domain;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


/**
 * Created by IntelliJ IDEA.
 * User: Xiaowawa
 * Date: 2017/11/28
 * Time: 10:34
 */

public class element {

    dxcsass dxcsass = new dxcsass();

    /*
       首页登录按钮
     */
    @FindBy(how = How.LINK_TEXT, using = "请登录")
    @CacheLookup
    public WebElement login;
    /*
    用户名输入框
     */
    @FindBy(how = How.ID, using = "input_login_name")
    @CacheLookup
    public WebElement loginusrname;
    /*
    密码输入框
     */
    @FindBy(how = How.ID, using = "input_login_pwd")
    @CacheLookup
    public WebElement loginpassword;
    /*
    登录按钮
     */
    @FindBy(how = How.ID, using = "PageLoginBtn")
    public WebElement loginbtnid;
    /*
    退出
     */
    @FindBy(how = How.LINK_TEXT, using = "[退出]")
    public WebElement exittext;

    public void getweburl(WebDriver webDriver) {
        webDriver.get(dxcsass.getWeburl());
    }

    public void setLogin() {
        login.click();
    }

    public void setLoginusrname(String usrmane) {
        loginusrname.sendKeys(usrmane);
    }

    public void setLoginpassword(String password) {
        loginpassword.sendKeys(password);
    }

    public void setLoginbtnid() {
        loginbtnid.click();
    }

    public void setExittext() {
        exittext.click();
    }
    public String getexittext(){
     return   exittext.getText();
    }

//    public void checkresult(Object obj1, Object obj2, String string) {
//        string = "与期望值不一样";
////        Assert.assertEquals(obj1, obj2, string);
//    }

}
