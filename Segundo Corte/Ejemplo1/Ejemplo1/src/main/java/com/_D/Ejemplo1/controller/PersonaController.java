package com._D.Ejemplo1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import com._D.Ejemplo1.repository.PersonaRepository;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class PersonaController {
    @Autowired
    PersonaRepository personaRepository;

    @GetMapping({"/listar"})
    public String listar(Model model){
        // Busca todos los registros en la BD y los guarda en la variable "Personas"
        model.addAllAttributes(personaRepository.findAll());

        return "listar"; // Retorna la vista listar.html
    }
}
