package controller;

import doto.TestLogin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import service.LoginPage;

/**
 * Created by IntelliJ IDEA.
 * User: Xiaowawa
 * Date: 2017/11/27
 * Time: 17:33
 */
@Controller
public class Helllocontroller {
    @RequestMapping("/hello")
    public String hello() throws Exception {
        return "hello";
    }

    @RequestMapping(value = "/Im", method = RequestMethod.GET)
    public ModelAndView xx(ModelAndView modelAndView, TestLogin testLogin) throws InterruptedException {
        LoginPage loginPage = new LoginPage();
        testLogin.gettitle();
        modelAndView.addObject("msg", "");
        modelAndView.setViewName("hello");
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
