package com.mycompany.jpaprueba.logica;

import com.mycompany.jpaprueba.persistencia.ControladoraPersistencia;
import java.util.ArrayList;

public class Controladora {

    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public void crearAlumno(Alumno alu) {
        controlPersis.crearAlumno(alu);
    }

    public void eliminarAlumno(int id) {
        controlPersis.eliminarAlumno(id);

    }

    public void editarAlumno(Alumno alu) {
        controlPersis.editarAlumno(alu);
    }
    public Alumno traerAlumno(int id){
         return controlPersis.traerAlumno(id);
    }

    public ArrayList<Alumno> traerListaAlumnos(){
        return controlPersis.traerListaAlumnos();
    }
}
