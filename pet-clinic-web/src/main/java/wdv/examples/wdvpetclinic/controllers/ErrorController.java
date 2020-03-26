package wdv.examples.wdvpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ErrorController {

    @RequestMapping({"/oups", "/error"})
    public String index(){
        return "notImplemented";
    }
}
