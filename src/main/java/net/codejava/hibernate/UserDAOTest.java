package net.codejava.hibernate;
 
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

 
/**
 * UserDAOTest.java
 * Copyright by CodeJava.net
 */
public class UserDAOTest {
 
    public static void main(String[] args) {
    	
        /* NEW USER */
    	/*User newUser = new User();
        newUser.setEmail("billjoy@gmail.com");
        newUser.setFullname("bill Joy");
        newUser.setPassword("billi");*/
        
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("UsersDB");
        EntityManager entityManager = factory.createEntityManager();
         
        /*entityManager.getTransaction().begin();
        
         
        entityManager.persist(newUser);
         
        entityManager.getTransaction().commit();*/
         

        /* UPDATE USER */
        /*User existingUser = new User();
        existingUser.setId(1);
        existingUser.setEmail("bill.joy@gmail.com");
        existingUser.setFullname("Bill Joy");
        existingUser.setPassword("billionaire");
        
        entityManager.getTransaction().begin();
        entityManager.merge(existingUser);
        entityManager.getTransaction().commit();*/
        
        /* SELECT USER */
        /*Integer primaryKey = 2;
        User user = entityManager.find(User.class, primaryKey);
         
        System.out.println(user.getEmail());
        System.out.println(user.getFullname());
        System.out.println(user.getPassword());*/
        
        /*EXECUTE SQL*/
        
        /* String sql = "SELECT u from User u where u.email = 'bill.joy@gmail.com'";
        Query query = entityManager.createQuery(sql);
        User user = (User) query.getSingleResult();
         
        System.out.println(user.getEmail());
        System.out.println(user.getFullname());
        System.out.println(user.getPassword()); */
        
        /* DELETE USER */
        
        Integer primaryKey = 1;
        User reference = entityManager.getReference(User.class, primaryKey);
        entityManager.getTransaction().begin();
        entityManager.remove(reference);
        entityManager.getTransaction().commit();
        
        entityManager.close();
        factory.close(); 
    }
}
