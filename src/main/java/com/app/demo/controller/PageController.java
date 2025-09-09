package com.app.demo.controller;

import com.app.demo.dao.IPacienteDAO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class PageController {

    @Autowired
    private IPacienteDAO iPacienteDAO;

    @GetMapping("/")
    public String indexPage(Model model){
        log.info("ejecutando el controlador Spring MVC");
        var pacientes = iPacienteDAO.findAll();
        model.addAttribute("pacientes", pacientes);
        return "index";
    }
}
