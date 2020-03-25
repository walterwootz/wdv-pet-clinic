package wdv.examples.wdvpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VetController {

    @RequestMapping({"/vets", "vets/index", "vets/index.html", "vets.html"})
    public String showVets(){

        return "vets/index";
    }
}
