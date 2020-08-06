package test.ciclovida;

import domain.Contacto;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Estado4EliminarObj {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("HibernateJpaPU");
        EntityManager em = emf.createEntityManager();
        //1.definimos la variable que va a recibir un objeto de la base de datos
        Contacto contacto = null;
        //2. recuperamos el objeto
        //DETACHED
        contacto = em.find(Contacto.class, 3);
        em.getTransaction().begin();
        //3.remove
        em.remove(em.merge(contacto));
        
        em.getTransaction().commit();
        
        //TRANSITIVO

        System.out.println("contacto = " + contacto);
    }
}
