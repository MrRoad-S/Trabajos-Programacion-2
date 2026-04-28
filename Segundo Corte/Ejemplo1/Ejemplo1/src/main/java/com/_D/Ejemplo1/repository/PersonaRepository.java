package com._D.Ejemplo1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com._D.Ejemplo1.model.Persona;

public interface PersonaRepository extends JpaRepository<Persona,Long>{
    
    //Esto ya me permite hacer las consultas en general
}
