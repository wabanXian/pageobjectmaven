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
    private String usrname="18708151438";
    private String password="zang1020330";
    @Getter
    private String webtitle = "跨境通-进口商品购物商城，上海自贸区官方平台，原装进口海外直销，海淘首选";
    @Getter
    private String logintitle = "跨境通-登录";
    @Getter
    private String exittxt="[退出]";
    @Getter
    private String producturl="http://www.kjt.com/product/detail/260419";
    @Getter
    private String producttitle="跨境通-t测试商品，请勿下单，下单无效(粉紫色)";

}
