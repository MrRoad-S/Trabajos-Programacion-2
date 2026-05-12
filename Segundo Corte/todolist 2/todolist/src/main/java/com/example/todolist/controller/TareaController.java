package com.example.todolist.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.todolist.model.Categoria;
import com.example.todolist.model.Tarea;
import com.example.todolist.respository.CategoriaRepository;
import com.example.todolist.respository.TareaRepository;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/tareas")
public class TareaController {
    @Autowired
    private  TareaRepository tareaRepo;
    @Autowired
    private CategoriaRepository categoriaRepo;

@GetMapping
public String listar(Model model){
    model.addAttribute("tareas",tareaRepo.findAll());
    return "tareas/lista";

}

@GetMapping("/nueva")
public String nueva(Model model){
    model.addAttribute("tarea",new Tarea());
    model.addAttribute("categorias",categoriaRepo.findAll());
    return"tareas/formulario";
}

@PostMapping
public String guardar(@ModelAttribute Tarea tarea){
    tareaRepo.save(tarea);
    return("redirect:/tareas");
}
@GetMapping("/editar/{id}")
public String editar(@PathVariable int id ,Model model){
    Tarea tarea = tareaRepo.findById(id).orElse(null);
    if(tarea==null){
        return"redirect:/tareas";
    }
    model.addAttribute("tarea", tarea);
    model.addAttribute("categorias",categoriaRepo.findAll());
    return"tareas/formulario";
}


@GetMapping("/eliminar/{id}")
public String eliminar(@PathVariable int id,Model model){
    tareaRepo.deleteById(id);
    return"redirect:/tareas";
}
@GetMapping("/completar/{id}")
public String completar(@PathVariable int id) {
    Tarea tarea = tareaRepo.findById(id).orElse(null);
    if(tarea != null){
        tarea.setCompletada(true);
        tareaRepo.save(tarea);
    }
    return "redirect:/tareas";
}
 
}
