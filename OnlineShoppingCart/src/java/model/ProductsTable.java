/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;



import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

/**
 *
 * @author Phoom1645
 */
public class ProductsTable {
    
    public static List<Products> findAllProducts() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("OnlineShoppingCartPU");
        EntityManager em = emf.createEntityManager();
        
        try {
            TypedQuery<Products> query = em.createNamedQuery("Products.findAll", Products.class);
            return query.getResultList();
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            em.close();
            emf.close();
        }
    }
    
//    public static List<ProductController> getAllProducts() {
//        List<Products> prodList = findAllProducts();
//        List<ProductController> prod_con_List = new ArrayList<>();
//        for (Products single_prod : prodList) {
//            prod_con_List.add(new ProductController(single_prod.getId(), single_prod.getMovie(), single_prod.getRating(), single_prod.getYearcreate(), single_prod.getPrice()));
//        }
//        return prod_con_List;
//    }
//    
    public static Products findProductsById(int id) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("OnlineShoppingCartPU");
        EntityManager em = emf.createEntityManager();
        
        try {
            return em.find(Products.class, id);
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            em.close();
            emf.close();
        }
    }
}
