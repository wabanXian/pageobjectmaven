package domain;


import config.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.sql.Time;
import java.util.concurrent.TimeUnit;


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
    /*
    加入购物车
     */
    @FindBy(how = How.XPATH, using = "//*[@id=\"main\"]/div/div[1]/div[2]/div[1]/div[2]/div[4]/ul/li/div/a[1]")
    private WebElement addcart;
    /*
    去购物车
     */
    @FindBy(how = How.ID, using = "CartCTNRUrl")
    private WebElement tocart;

    /*
    去结算页面
     */
    @FindBy(how = How.ID, using = "CanSubmitBtn")
    private WebElement tocheckout;

    /*
    迷你登录用户名
     */
    @FindBy(how = How.ID, using = "UserID")
    private WebElement miniusrname;
    /*
    迷你登录密码
     */

    @FindBy(how = How.ID, using = "UserPassword")
    private WebElement minipasswords;
    /*
    迷你登录按钮
     */
    @FindBy(how = How.ID, using = "BtnLogin")
    private WebElement minilogin;

    /*
    选择支付方式
     */
    @FindBy(how = How.XPATH, using = "//*[@id=\"PayTypeListPanel\"]/div/ul/li[2]/a/img")
    private WebElement paytype;
    /*
    提交订单
     */
    @FindBy(how = How.ID, using = "btnSubmit")
    private WebElement submitorder;
    /*
    立即支付
     */
    @FindBy(how = How.LINK_TEXT, using = "立即支付")
    private WebElement nowpay;
    /*
    完成支付
     */
    @FindBy(how = How.LINK_TEXT, using = "完成支付")
    private WebElement finpay;
    /*
    作废按钮
     */
    @FindBy(how = How.LINK_TEXT, using = "作废")
    private WebElement voidbth;
    /*

     */
    @FindBy(how = How.ID, using = "btnInvalidOrder")
    private WebElement invaildorder;

    public void getweburl(WebDriver webDriver) {
        webDriver.manage().window().maximize();

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

    public String getexittext() {
        return exittext.getText();
    }

    public void addcart() {
        addcart.click();
    }

    public void tocart() {
        tocart.click();
    }

    public void tocheckout() {
        tocheckout.click();
    }

    public void setminiusrname(String miniusrmane) {
        miniusrname.sendKeys(miniusrmane);
    }

    public void setminipassword(String minipassword) {
        minipasswords.sendKeys(minipassword);
    }

    public void minilogin() {
        minilogin.click();
    }

    public void setPaytype() {
        paytype.click();
    }

    public void submitorder() {
        submitorder.click();
    }

    public void nowpay() {
        nowpay.click();
    }

    public void finpay() {
        finpay.click();
    }

    public void voidbth() {
        voidbth.click();
    }

    public void invaildorder() {
        invaildorder.click();
    }
}
