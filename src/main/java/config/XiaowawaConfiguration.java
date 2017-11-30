package config;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.io.File;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * User: Xiaowawa
 * Date: 2017/11/27
 * Time: 14:08
 */

public class XiaowawaConfiguration {

    public void getscreen(String name, WebDriver webDriver) {
        String path = "/sc";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddhhmm");
        String da = simpleDateFormat.format(new Date());
        TakesScreenshot takesScreenshot = (TakesScreenshot) webDriver;
        File file = new File(path + File.separator + da + name + ".jpg");
        takesScreenshot.getScreenshotAs(OutputType.FILE).renameTo(file);
    }
 public void waitfortimeout(WebDriver webDriver){
     WebDriverWait webDriverWait = new WebDriverWait(webDriver,10);
 }

}
