package com.example.todolist.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.todolist.model.Tarea;



public interface TareaRepository extends JpaRepository<Tarea,Integer>{
    
}
