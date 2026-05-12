package com.example.todolist.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.todolist.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria,Integer>{
    
}
