package service;

import model.Product;
import model.User;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    void addProduct(Product product);
    List<Product> getAllProducts();
    Optional<Product> getProductByName(String name);

}
