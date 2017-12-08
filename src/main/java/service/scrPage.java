package service;

import config.Driver;
import config.ReadColor;
import config.XiaowawaConfiguration;
import domain.dxcsass;
import domain.element;
import lombok.Getter;
import lombok.Setter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;


/**
 * Created by IntelliJ IDEA.
 * User: Xiaowawa
 * Date: 2017/12/8
 * Time: 14:12
 */
public class scrPage {
    WebDriver webDriver = Driver.chromedriver();
    domain.dxcsass dxcsass = new dxcsass();
    domain.element element;
    XiaowawaConfiguration xiaowawaConfiguration=new XiaowawaConfiguration();

    {
        element = PageFactory.initElements(webDriver, domain.element.class);
    }

    public boolean getscrss() throws Exception {
        boolean rel = true;
        webDriver.get(dxcsass.getProducturl());
        element.setScreen();
        Thread.sleep(2000);
        File file = new File("C:\\bait.jpg");
        BufferedImage bi = null;
        bi = ImageIO.read(file);
        int width = bi.getWidth(); // 像素
        int height = bi.getHeight(); // 像素
        if (width == 255 && height == 255) {
            rel = false;
            setErr("图片像素不一致");
            webDriver.quit();
        }
        else if (width==0&&height==0){
            rel = false;
            setErr("图片像素不一致");
            webDriver.quit();
        }
        else {webDriver.quit();}
        return rel;
    }

    @Getter
    @Setter
    private String err;
}
