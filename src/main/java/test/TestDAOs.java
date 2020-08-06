package test;

import dao.*;
import java.util.List;

public class TestDAOs {
    public static void main(String[] args) {
        AlumnoDAO alumnoDao=new AlumnoDAO();
        System.out.println("Alumnos: " );
        imprimir(alumnoDao.listar());
        
        DomicilioDAO domicilioDao=new DomicilioDAO();
        System.out.println("Domicilios: " );
        imprimir(domicilioDao.listar());
        
        ContactoDAO contactoDao=new ContactoDAO();
        System.out.println("Contactos: " );
        imprimir(contactoDao.listar());
        
        CursoDAO CursoDao=new CursoDAO();
        System.out.println("Cursos: " );
        imprimir(CursoDao.listar());
        
        AsignacionDAO AsignacionDao=new AsignacionDAO();
        System.out.println("Asignaciones: " );
        imprimir(AsignacionDao.listar());
    }
    
    private static void imprimir(List coleccion){
    for (Object o: coleccion){
        System.out.println("valor= " +o );}
    }
    
}
