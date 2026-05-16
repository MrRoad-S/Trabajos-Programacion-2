package com.example.todolist.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.todolist.model.Categoria;
import com.example.todolist.repository.CategoriaRepository;

@Controller
@RequestMapping("/categorias")
public class CategoriaController {
    @Autowired
    private CategoriaRepository categoriaRepo;

    @GetMapping
    public String listar(Model model){
        model.addAttribute("categorias", categoriaRepo.findAll());
        return "categorias/lista";
    }
    @GetMapping("/nueva")
    public String nueva(Model model){
        model.addAttribute("categoria", new Categoria());
        return"categorias/formulario";
    }
    @PostMapping
    public String guardar(@ModelAttribute Categoria categoria){
        categoriaRepo.save(categoria);
        return"redirect:/categorias";
    }
}
