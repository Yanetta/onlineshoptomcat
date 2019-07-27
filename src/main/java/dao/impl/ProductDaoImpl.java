package dao.impl;

import dao.ProductDao;
import model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductDaoImpl implements ProductDao {
    List<Product> productList = new ArrayList<Product>();
    public void addProduct(Product user) {
        productList.add(user);
    }

    public List<Product> getAllProducts() {
        return productList;
    }
}
