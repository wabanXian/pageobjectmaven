package domain;

import lombok.Data;
import lombok.Getter;

/**
 * Created by IntelliJ IDEA.
 * User: Xiaowawa
 * Date: 2017/11/28
 * Time: 10:40
 */
@Data
public class dxcsass {

    private String weburl="http://www.kjt.com";
    private String usrname;
    private String password;
    @Getter
    private String webtitle = "1跨境通-进口商品购物商城，上海自贸区官方平台，原装进口海外直销，海淘首选";
    @Getter
    private String logintitle = "跨境通-登录";
    @Getter
    private String exittxt="[退出]";
}
