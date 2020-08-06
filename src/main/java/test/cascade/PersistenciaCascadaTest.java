package test.cascade;

import domain.*;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class PersistenciaCascadaTest {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("HibernateJpaPU");
        EntityManager em = emf.createEntityManager();
        
        Domicilio domicilio=new Domicilio();
        domicilio.setCalle("SiempreViva");
        domicilio.setNoCalle("42");
        domicilio.setPais("UK");
        
        Contacto contacto=new Contacto();
        contacto.setEmail("Bart@mail.com");
        contacto.setTelefono("2255889977");
        
        Alumno alumno=new Alumno();
        alumno.setNombre("Bart");
        alumno.setApellido("Simpson");
        alumno.setContacto(contacto);
        alumno.setDomicilio(domicilio);
        
        em.getTransaction().begin();
        em.persist(alumno);
        em.getTransaction().commit();
        
        System.out.println("alumno = " + alumno);
        
        
        
        

    }
}
