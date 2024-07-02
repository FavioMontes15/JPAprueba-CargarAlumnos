package com.mycompany.jpaprueba;

import com.mycompany.jpaprueba.logica.Alumno;
import com.mycompany.jpaprueba.logica.Controladora;
import java.util.ArrayList;
import java.util.Date;

public class JpaPrueba {

    public static void main(String[] args) {

        Controladora control=new Controladora();
        
        Alumno alu=new Alumno(21,"Astrid","Mullisaca",new Date());        
        Alumno alu2=new Alumno(22,"Favio","Montes",new Date());        
        Alumno alu3=new Alumno(12,"Luciana","Montes",new Date());        
        //Crear Alumno
        control.crearAlumno(alu2);
        control.crearAlumno(alu3);
        //Eliminar Alumno
        control.eliminarAlumno(22);
        //Editar alumno--agregar valor de apellido
        alu.setApellido("*******");        
        control.editarAlumno(alu);
        //Traer o buscar alumno individualmente
        Alumno alumBusqueda=control.traerAlumno(12);
        System.out.println("----------BUSQUEDA INDIVIDUAL----------");
        System.out.println("El alumno es: "+alumBusqueda.toString());
        System.out.println("--------------------");
        //Traer o buscar lista de alumnos
        System.out.println("----------BUSQUEDA GLOBAL----------");
        ArrayList<Alumno>listaAlu=control.traerListaAlumnos();
        for(Alumno alBus2:listaAlu){
            System.out.println("El alumno es:"+alBus2.toString());
        }
    } 
}