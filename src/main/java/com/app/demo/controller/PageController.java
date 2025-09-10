package com.app.demo.controller;

import com.app.demo.domain.Paciente;
import com.app.demo.service.IPacienteService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@Slf4j
public class PageController {

    @Autowired
    private IPacienteService iPacienteService;

    @GetMapping("/")
    public String indexPage(Model model){
        var pacientes = iPacienteService.getAllPacientes();
        model.addAttribute("pacientes", pacientes);
        return "index";
    }

    @GetMapping("/create")
    public String createPage(Paciente paciente){
        return "create";
    }

    @PostMapping("/save")
    public String save(Paciente paciente){
        iPacienteService.savePaciente(paciente);
        return "redirect:/";
    }

    @GetMapping("/update/{id}")
    public String updatePage(Paciente paciente, Model model){
        paciente = iPacienteService.findPaciente(paciente);
        model.addAttribute("paciente", paciente);
        return "create";
    }

    @GetMapping("/delete")
    public String deletePage(Paciente paciente){
        iPacienteService.deletePaciente(paciente);
        return "redirect:/";    }
}
