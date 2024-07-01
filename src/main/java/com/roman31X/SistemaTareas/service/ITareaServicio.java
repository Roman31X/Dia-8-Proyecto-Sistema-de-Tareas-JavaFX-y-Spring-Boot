package com.roman31X.SistemaTareas.service;

import com.roman31X.SistemaTareas.model.Tarea;

import java.util.List;

public interface ITareaServicio {

    public List<Tarea> listarTarea();

    public Tarea buscarTareaPorId(Integer idTarea);

    public void guardarTarea(Tarea tarea);

    public void eliminarTarea(Tarea tarea);
}
