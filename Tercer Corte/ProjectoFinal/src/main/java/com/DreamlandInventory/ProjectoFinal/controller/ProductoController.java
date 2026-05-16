package com.DreamlandInventory.ProjectoFinal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.DreamlandInventory.ProjectoFinal.model.Movimiento;
import com.DreamlandInventory.ProjectoFinal.model.Producto;
import com.DreamlandInventory.ProjectoFinal.repository.ProductoRepository;

@Controller
@RequestMapping("/productos")
public class ProductoController {
    @Autowired
    private ProductoRepository productoRepo;

    @GetMapping
    public String listar(Model model) {
        model.addAttribute("productos", productoRepo.findAll());
        return "productos/lista";
    }

    @GetMapping("/nueva")
    public String nueva(Model model) {
        model.addAttribute("producto", new Producto());
        return "productos/formulario";
    }

    @PostMapping
    String guardar(@ModelAttribute Producto producto) {
        productoRepo.save(producto);
        return "redirect:/productos";
    }

    @GetMapping("/editar/{id}")
    public String editar(@PathVariable int id, Model model) {
        Producto producto = productoRepo.findById(id).orElse(null);
        if (producto == null) {
            return "redirect:/productos";
        }
        model.addAttribute("producto", producto);
        return "productos/formulario";
    }

   @GetMapping("/eliminar/{id}")
    public String eliminar(@PathVariable int id,Model model){
    productoRepo.deleteById(id);
    return"redirect:/productos";
    }
}
