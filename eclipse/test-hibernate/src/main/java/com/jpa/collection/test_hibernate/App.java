package com.jpa.collection.test_hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App 
{
    public static void main( String[] args )
    {
    	EntityManagerFactory emf= Persistence.createEntityManagerFactory("test1");    	
    	EntityManager em=emf.createEntityManager();
    	Books b=em.find(Books.class, 1);
    	System.out.println(b);
    	Books b1= new Books();
    	b1.setBookid(2);    	
    	b1.setBname("geetanjli");
    	b1.setBauthor("Ravindranath tagore");
    	b1.setBprice(600.82);
// for deletion emm.remove(b);
    	em.getTransaction().begin();
    	em.persist(b1);
    	
    	em.getTransaction().commit();
    	
    	//em.persist(b1);
    	
    	System.out.println("data which add by java file");
        System.out.println(b1);
    }
}
