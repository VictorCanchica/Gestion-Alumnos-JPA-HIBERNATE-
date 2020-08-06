package test.ciclovida;

import domain.Contacto;
import javax.persistence.*;

public class Estado1Persistido {
    public static void main(String[] args) {
        EntityManagerFactory emf=Persistence.createEntityManagerFactory("HibernateJpaPU");
        EntityManager em=emf.createEntityManager();
        
        //1. estado transitivo
        Contacto contacto=new Contacto();
        contacto.setEmail("Cvictor");
        contacto.setTelefono("2405936565");
        
        //2. persistimos el objeto
        em.getTransaction().begin();
        em.persist(contacto);
        //em.flush();
        em.getTransaction().commit();
        //3.detached(separado)
        System.out.println("contacto = " + contacto);
        
        
    }
    
}
