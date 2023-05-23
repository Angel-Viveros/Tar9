package ico.fes.intro.controllers;


import ico.fes.intro.model.Empleado;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.sql.Date;

@Controller
public class Principal {

    @GetMapping("/inicio")
    public String getInicio(Model model){
        Empleado emp = new Empleado(1,"Angel Viveros", 23000, "Ingenieria en Computacion", "21/11/2002");
        model.addAttribute("empleado","Jose");
        return "index";

    }
}
