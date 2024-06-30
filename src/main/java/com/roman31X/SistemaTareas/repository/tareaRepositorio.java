package com.roman31X.SistemaTareas.repository;

import com.roman31X.SistemaTareas.model.Tarea;
import org.springframework.data.jpa.repository.JpaRepository;

public interface tareaRepositorio extends JpaRepository<Tarea,Integer> {
}
