package com.DreamlandInventory.ProjectoFinal.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Movimiento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String tipoMovimiento;
    private int stockInicial;
    private int stockFinal;
    private int cantidad;
    private LocalDateTime fecha;

    @ManyToOne
    @JoinColumn(name="producto_id", nullable = false)
    private Producto producto;

    public Movimiento() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipoMovimiento() {
        return tipoMovimiento;
    }

    public void setTipoMovimiento(String tipoMovimiento) {
        this.tipoMovimiento = tipoMovimiento;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int addStock(){
        int stock = producto.getStock();
        stock = stock+cantidad;
    return(stock);
    }

    public int getStockInicial() {
        return stockInicial;
    }

    public void setStockInicial(int stockInicial) {
        this.stockInicial = stockInicial;
    }

    public int getStockFinal() {
        return stockFinal;
    }

    public void setStockFinal(int stockFinal) {
        this.stockFinal = stockFinal;
    } 
    
}
