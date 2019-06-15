package hossein.springframework.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class indexController {

    @RequestMapping(value = {"", "/", "/index"})
    public String getIndexPage(){
        return "index";
    }
}
