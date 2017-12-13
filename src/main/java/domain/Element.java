package domain;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


import java.io.File;


/**
 * Created by IntelliJ IDEA.
 * User: Xiaowawa
 * Date: 2017/11/28
 * Time: 10:34
 */

public class Element {

    private dxcsass dxcsass = new dxcsass();

    /*
       首页登录按钮
     */
    @FindBy(how = How.LINK_TEXT, using = "请登录")
    @CacheLookup
    private WebElement login;

    /*
    用户名输入框
     */
    @FindBy(how = How.ID, using = "input_login_name")
    @CacheLookup
    private WebElement loginusrname;
    /*
    密码输入框
     */
    @FindBy(how = How.ID, using = "input_login_pwd")
    @CacheLookup
    private WebElement loginpassword;
    /*
    登录按钮
     */
    @FindBy(how = How.ID, using = "PageLoginBtn")
    private WebElement loginbtnid;
    /*
    退出
     */
    @FindBy(how = How.LINK_TEXT, using = "[退出]")
    private WebElement exittext;
    /*
    加入购物车
     */
    @FindBy(how = How.XPATH, using = "//*[@id=\"main\"]/div/div[1]/div[2]/div[1]/div[2]/div[4]/ul/li/div/a[1]")
    private WebElement addcart;
    /*
    购物车数量
     */
    @FindBy(how = How.XPATH, using = "//*[@id=\"CartCTNR\"]/p/em")
    private WebElement cartnum;
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

    @FindBy(how = How.XPATH, using = "//*[@id=\"PayTypeListPanel\"]/div/ul/li[2]/label")
    private WebElement paytypewithoutpic;
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

    @FindBy(how = How.XPATH, using = "//*[@id=\"main\"]/div/div[1]/div[2]/div[2]/div[1]/a/img")
    private WebElement screen;
    /*
    msite首页“我的”按钮
     */
    @FindBy(how = How.XPATH, using = "/html/body/footer/ul/li[5]/a/span")
    @CacheLookup
    private WebElement my;
    /*
    msite登录用户名
     */
    @FindBy(how = How.ID, using = "phoneNumId")
    private WebElement msiteloginusrname;
    /*
    msite登录密码
     */
    @FindBy(how = How.ID, using = "pwdId")
    private WebElement msiteloginpassword;

    /*
    msite登录按钮
     */
    @FindBy(how = How.ID, using = "loginBtn")
    private WebElement mlogin;

    @FindBy(how = How.XPATH, using = "/html/body/div[2]/ul/li[1]/a/em")
    private WebElement msitesigntxt;
    /*
    msite立即购买按钮
     */
    @FindBy(how = How.ID, using = "goCheckout")
    private WebElement mtocheckout;

    /*
    msite提交订单
     */
    @FindBy(how = How.LINK_TEXT, using = "提交订单")
    private WebElement msubmitorder;

    /*
    msite立即支付
     */
    @FindBy(how = How.LINK_TEXT, using = "立即支付")
    private WebElement mpayclick;
    /*
    msite我的订单
     */
    @FindBy(how = How.XPATH, using = "/html/body/div[3]/div[2]/ul/li[1]/a/em")
    private WebElement mgetorder;
    /*
    msite作废订单
     */
    @FindBy(how = How.LINK_TEXT, using = "作废订单")
    private WebElement mvoidorder;

    @FindBy(how = How.ID, using = "cancleOrder")
    private WebElement mcancleOrder;

    @FindBy(how = How.LINK_TEXT, using = "丢掉")
    private WebElement mthrowssa;

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

    public String setCartnum() {
        return cartnum.getText();
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

    public void setPaytypewithoutpic() {
        paytypewithoutpic.click();
    }

    public void setScreen() {
        File file = new File("C:\\bait.jpg");
        screen.getScreenshotAs(OutputType.FILE).renameTo(file);
    }

    public void getmsiteurl(WebDriver webDriver) {
        webDriver.manage().window().maximize();
        webDriver.get(dxcsass.getMsiteurl());
    }

    public void setMy() {
        my.click();
    }

    public void setMsiteloginusrname(String usrnname) {
        msiteloginusrname.sendKeys(usrnname);
    }

    public void setMsiteloginpassword(String password) {
        msiteloginpassword.sendKeys(password);
    }

    public void setMlogin() {
        mlogin.click();
    }

    public void setMtocheckout() {
        mtocheckout.click();
    }

    public void setMsubmitorder() {
        msubmitorder.click();
    }

    public void setMpayclick() {
        mpayclick.click();
    }

    public void setMgetorder() {
        mgetorder.click();
    }

    public void setMvoidorder() {
        mvoidorder.click();
    }

    public void setMcancleOrder() {
        mcancleOrder.click();
    }

    public void setMthrowssa() {
        mthrowssa.click();
    }

    public String getmsitesigntxt() {
        return msitesigntxt.getText();
    }
}
