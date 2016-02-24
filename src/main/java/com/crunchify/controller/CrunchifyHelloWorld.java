package com.crunchify.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by user on 16-2-22.
 */

@Controller
public class CrunchifyHelloWorld {

    @RequestMapping("/index")
    public void helloWorld(ModelMap model) {

        String message = "<br><div style='text-align:center;'>"
                + "<h3>********** Hello World, Spring MVC Tutorial</h3>This message is coming from CrunchifyHelloWorld.java **********</div><br><br>";
        model.addAttribute("Title", "Hello world!");
        model.addAttribute("END", "Hello world!");
        model.addAttribute("message", message);
    }

    @RequestMapping("/index2")
    public ModelAndView helloWorld2() {

        String message = "<br><div style='text-align:center;'>"
                + "<h3>********** Hello World, Spring MVC Tutorial</h3>This message is coming from CrunchifyHelloWorld.java **********</div><br><br>";
        return new ModelAndView("index2", "message", message);
    }

    public static class Response {
        public String message;
    }

    @RequestMapping("/index3")
    public Response helloWorld3() {
        String message = "<br><div style='text-align:center;'>"
                + "<h3>********** Hello World, Spring MVC Tutorial</h3>This message is coming from CrunchifyHelloWorld.java **********</div><br><br>";
        Response res = new Response();
        res.message = message;
        return res;
    }

}