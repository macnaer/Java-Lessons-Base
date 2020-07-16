package org.example.dao.implement;

import org.example.dao.ProductDao;
import org.example.model.Product;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class ProductDaoImplement implements ProductDao {
    @Autowired
    private SessionFactory sessionFactory;

//    public void addProduct(Product product){}
//    public void delProduct(){}

    public List<Product> getAllProducts(){
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("from Product");
        List<Product> products = query.list();
        session.flush();
        return products;
    }
    public Product getProductById(String id){
        Session session = sessionFactory.getCurrentSession();
        Product product = (Product) session.get(Product.class, id);
        session.flush();
        return product;
    }
}