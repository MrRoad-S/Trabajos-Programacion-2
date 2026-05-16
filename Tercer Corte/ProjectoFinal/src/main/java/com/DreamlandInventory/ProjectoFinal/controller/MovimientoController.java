package com.DreamlandInventory.ProjectoFinal.controller;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.DreamlandInventory.ProjectoFinal.model.Movimiento;
import com.DreamlandInventory.ProjectoFinal.model.Producto;
import com.DreamlandInventory.ProjectoFinal.repository.MovimientoRepository;
import com.DreamlandInventory.ProjectoFinal.repository.ProductoRepository;

@Controller
@RequestMapping("/movimientos")
public class MovimientoController {
    @Autowired
    private MovimientoRepository movirepo;
    @Autowired
    private ProductoRepository productoRepo;

    @GetMapping
    public String listar(Model model) {
        model.addAttribute("movimientos", movirepo.findAll());
        return "movimientos/lista";
    }

    @GetMapping("/entrada")
    public String entrada(Model model) {
        model.addAttribute("movimiento", new Movimiento());
        model.addAttribute("productos", productoRepo.findAll());

        return "movimientos/formulario";
    }

    @GetMapping("/salida")
    public String salida(Model model) {
        model.addAttribute("movimiento", new Movimiento());
        model.addAttribute("productos", productoRepo.findAll());

        return "movimientos/formularioS";
    }

    @PostMapping
    String guardar(@ModelAttribute Movimiento movimiento, RedirectAttributes redirectAttributes) {
        Producto producto = productoRepo.findById(movimiento.getProducto().getId()).orElseThrow();
        int stockInicial = producto.getStock();;
        int stockFinal = 0;
        if (movimiento != null) {
            movimiento.setStockInicial(stockInicial);
            if (movimiento.getTipoMovimiento().equalsIgnoreCase("entrada")) {
                producto.setStock(movimiento.getCantidad() + producto.getStock());
            } else if (movimiento.getTipoMovimiento().equalsIgnoreCase("salida")) {
                if (producto.getStock() < movimiento.getCantidad()) {
                    return "movimientos/error";
                } else {
                    producto.setStock(producto.getStock() - movimiento.getCantidad());
                }
            }
            stockFinal = producto.getStock();
            movimiento.setStockFinal(stockFinal);
            addLocalDate(movimiento);
            productoRepo.save(producto);
            movirepo.save(movimiento);
        }

        return "redirect:movimientos";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminar(@PathVariable int id, Model model) {
        movirepo.deleteById(id);
        return "redirect:/movimientos";
    }

    public void addLocalDate(@ModelAttribute Movimiento movimiento) {
        
        LocalDateTime fecha = LocalDateTime.now();
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        String formattedDate = fecha.format(myFormatObj);
        movimiento.setFecha(fecha);
        // movimiento.setTipoMovimiento("entrada");

    }

}
