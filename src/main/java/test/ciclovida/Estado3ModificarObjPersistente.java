package test.ciclovida;

import domain.Contacto;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Estado3ModificarObjPersistente {
     public static void main(String[] args) {
        EntityManagerFactory emf=Persistence.createEntityManagerFactory("HibernateJpaPU");
        EntityManager em=emf.createEntityManager();
        //1.definimos la variable que va a recibir un objeto de la base de datos
        Contacto contacto=null;
        //2. recuperamos el objeto
        //DETACHED
        contacto=em.find(Contacto.class, 3);
        //3.modificamos el objeto
        contacto.setEmail("Vcanchica@mail.com");
        em.getTransaction().begin();
        //PERSISTENTE
        em.merge(contacto);
        em.getTransaction().commit();
        //DETACHED
        
         System.out.println("contacto = " + contacto);
}
}
