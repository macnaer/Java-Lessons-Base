package org.example.dao;
import org.example.model.Product;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ProductDao {
    private List<Product> productList;

    public List<Product> getProductList(){
        Product product1 = new Product();
        product1.setProductId("p1");
        product1.setProductName("polo");
        product1.setProductCategory("t-shorts");
        product1.setProductDescription("Nam sagittis a augue eget scelerisque. Nullam lacinia consectetur sagittis. Nam sed neque id eros fermentum dignissim quis at tortor. ");
        product1.setProductPrice(9.99);
        product1.setProductCondition("new");
        product1.setProductStatus("Active");
        product1.setProductManufacturer("Armani");

        Product product2 = new Product();
        product2.setProductId("p2");
        product2.setProductName("polo");
        product2.setProductCategory("t-shorts");
        product2.setProductDescription("Nam sagittis a augue eget scelerisque. Nullam lacinia consectetur sagittis. Nam sed neque id eros fermentum dignissim quis at tortor. ");
        product2.setProductPrice(19.99);
        product2.setProductCondition("Sale");
        product2.setProductStatus("Active");
        product2.setProductManufacturer("Versache");

        productList = new ArrayList<Product>();
        productList.add(product1);
        productList.add(product2);
        return productList;
    }

    public Product getProductById(String productId)  throws IOException {

        for (Product product : getProductList()){
            if (product.getProductId().equals(productId)){
                return  product;
            }
        }
        throw new IOException("No product found.");

    }
}
