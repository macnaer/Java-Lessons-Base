package org.example.dao;
import org.example.model.Product;

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

        productList = new ArrayList<Product>();
        productList.add(product1);
        return productList;
    }
}
