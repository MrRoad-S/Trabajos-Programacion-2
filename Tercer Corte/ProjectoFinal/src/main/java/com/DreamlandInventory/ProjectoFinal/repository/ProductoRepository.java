package com.DreamlandInventory.ProjectoFinal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.DreamlandInventory.ProjectoFinal.model.Producto;

public interface ProductoRepository extends JpaRepository<Producto,Integer>{
    
}
