package test.ciclovida;

import domain.Contacto;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Estado2RecuperarObjPersistente {
    public static void main(String[] args) {
        EntityManagerFactory emf=Persistence.createEntityManagerFactory("HibernateJpaPU");
        EntityManager em=emf.createEntityManager();
        
        //definimos la variable que va a recibir un objeto de la base de datos
        Contacto contacto=null;
        //recuperamos el objeto
        contacto=em.find(Contacto.class, 3);
        
        //detached
        System.out.println("contacto = " + contacto);
        
        
        
}
}
