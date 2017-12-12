package controller;


import doto.TestLogin;
import doto.TestOrder;
import doto.Testscr;
import net.sf.json.JSON;
import net.sf.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;


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

    @RequestMapping(value = "/Im", method = RequestMethod.GET)
    @ResponseBody
    public JSON xx(TestLogin testLogin) throws InterruptedException {
        Map<String,String> map= new HashMap<>();
         JSON result=null;
        if (testLogin.login()) {
            map.put("statuss", "fi");
            JSONObject object = JSONObject.fromObject(map);
          result =object;
        } else {
            map.put("err", testLogin.resultmsg());
            JSONObject object = JSONObject.fromObject(map);
            result=object;
//            result = object;
        }
        return result;
    }

    @RequestMapping(value = "/Is", method = RequestMethod.GET)
    public ModelAndView xxs(ModelAndView modelAndView, TestOrder testOrder) throws InterruptedException {
        if (testOrder.order()) {

        }
        return modelAndView;
    }

    @RequestMapping(value = "/Iss", method = RequestMethod.GET)
    public ModelAndView xxss(ModelAndView modelAndView, TestOrder testOrder) throws InterruptedException {
        if (testOrder.ordret()) {
            modelAndView.addObject("msg", "ok");
            modelAndView.addObject("mss3", "~");
        } else {
            modelAndView.addObject("msg", testOrder.resultmsg());
            modelAndView.addObject("mss3", "`");
        }
        modelAndView.setViewName("/hello");
        return modelAndView;
    }

    @RequestMapping(value = "/io", method = RequestMethod.GET)
    public ModelAndView xsxss(ModelAndView modelAndView, Testscr testscr) throws Exception {
        if (testscr.sc()) {
            modelAndView.addObject("msg", "ok");
            modelAndView.addObject("mss4", "~");
        } else {
            modelAndView.addObject("msg", testscr.resultmsg());
            modelAndView.addObject("mss4", "`");
        }
        modelAndView.setViewName("/hello");
        return modelAndView;
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
