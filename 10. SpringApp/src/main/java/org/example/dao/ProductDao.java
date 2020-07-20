package org.example.dao;
import org.example.model.Product;
import java.util.List;

public interface ProductDao {
    Product getProductById(String id);
    List<Product> getAllProducts();
    void addProduct(Product product);
    void delProduct(String id);
}
