package org.example.controller;

import org.example.dao.ProductDao;
import org.example.model.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;
import java.util.List;

@Controller
public class ProductController {
    private ProductDao productDao = new ProductDao();
    @RequestMapping("/productList")
    public String getProducts(Model model){
        List<Product> products = productDao.getProductList();
        model.addAttribute("products", products);
        return "productList";
    }

    @RequestMapping("/productList/viewProduct/{productId}")
    public String viewProduct(@PathVariable String productId , Model model) throws IOException {
        Product product = productDao.getProductById(productId);
        model.addAttribute(product);
        return "viewProduct";
    }
}
