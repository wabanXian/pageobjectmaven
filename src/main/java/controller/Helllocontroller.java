package controller;


import doto.TestLogin;

import doto.TestOrder;
import net.sf.json.JSON;
import net.sf.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


import java.util.HashMap;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * User: Xiaowawa
 * Date: 2017/11/27
 * Time: 17:33
 */
@Controller
public class Helllocontroller {
    @RequestMapping("/")
    public String hello() throws Exception {
        return "hello";
    }

    @RequestMapping(value = "/Login", method = RequestMethod.GET)
    @ResponseBody
    public JSON xx(TestLogin testLogin) throws InterruptedException {
        Map<String, String> map = new HashMap<>();
        JSON result = null;
        if (testLogin.login()) {
            map.put("statuss", "fi");
            result = JSONObject.fromObject(map);
        } else {
            map.put("err", testLogin.resultmsg());
            result = JSONObject.fromObject(map);
//            result = object;
        }
        return result;
    }

    @RequestMapping(value = "/loginorder", method = RequestMethod.GET)
    @ResponseBody
    public JSON xxs(TestOrder testOrder) throws InterruptedException {
        Map<String, String> map = new HashMap<>();
        JSON result = null;
        if (testOrder.order()) {
            map.put("statuss", "fi");
            result = JSONObject.fromObject(map);
        } else {
            map.put("err", testOrder.resultmsg());
            result = JSONObject.fromObject(map);
        }
        return result;
    }

    @RequestMapping(value = "/orderlogin", method = RequestMethod.GET)
    @ResponseBody
    public JSON xsxs(TestOrder testOrder) throws InterruptedException {
        Map<String, String> map = new HashMap<>();
        JSON result = null;
        if (testOrder.ordret()) {
            map.put("statuss", "fi");
            result = JSONObject.fromObject(map);
        } else {
            map.put("err", testOrder.resultmsg());
            result = JSONObject.fromObject(map);
        }
        return result;
    }

//    @RequestMapping(value = "/io", method = RequestMethod.GET)
//    public ModelAndView xsxss(ModelAndView modelAndView, Testscr testscr) throws Exception {
//        if (testscr.sc()) {
//
//        }
//        return modelAndView;
//    }

    @RequestMapping(value = "/msitelogin", method = RequestMethod.GET)
    @ResponseBody
    public JSON msitexx(TestLogin testLogin) throws InterruptedException {
        Map<String, String> map = new HashMap<>();
        JSON result = null;
        if (testLogin.msitelogin()) {
            map.put("statuss", "fi");
            result = JSONObject.fromObject(map);
        } else {
            map.put("err", testLogin.resultmsg());
            result = JSONObject.fromObject(map);
        }
        return result;
    }

    @RequestMapping(value = "/msiteorder", method = RequestMethod.GET)
    @ResponseBody
    public JSON xmsitex(TestOrder testOrder) throws InterruptedException {
        Map<String, String> map = new HashMap<>();
        JSON result = null;
        if (testOrder.msiteorder()) {
            map.put("statuss", "fi");
            result = JSONObject.fromObject(map);
        } else {
            map.put("err", testOrder.resultmsg());
            result = JSONObject.fromObject(map);
        }
        return result;
    }

    @RequestMapping(value = "/msiteordert", method = RequestMethod.GET)
    @ResponseBody
    public JSON xmxsitex(TestOrder testOrder) throws InterruptedException {
        Map<String, String> map = new HashMap<>();
        JSON result = null;
        if (testOrder.msiteordert()) {
            map.put("statuss", "fi");
            result = JSONObject.fromObject(map);
        } else {
            map.put("err", testOrder.resultmsg());
            result = JSONObject.fromObject(map);
        }
        return result;
    }
}


// ByteArrayOutputStream baoStream = new ByteArrayOutputStream(1024);
//        // cache stream
//        PrintStream cacheStream = new PrintStream(baoStream);
//        // old stream
//        PrintStream oldStream = System.out;
//
//        System.setOut(cacheStream);
//
//        System.out.print("hello world!");
//
//        String message = baoStream.toString();
//
//        message = "<-- " + message + " -->";
//
//        // Restore old stream
//        System.setOut(oldStream);
//
//        System.out.println(message);
