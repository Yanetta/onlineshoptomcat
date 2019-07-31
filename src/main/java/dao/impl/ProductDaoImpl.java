package dao.impl;

import dao.ProductDao;
import model.Product;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class ProductDaoImpl implements ProductDao {
    private static final Logger logger = Logger.getLogger(UserDaoImpl.class);

    private static final List<Product> productList = new ArrayList<Product>();
    public void addProduct(Product product) {
        productList.add(product);
        logger.info("User" + product + "added in db");
    }

    public List<Product> getAllProducts() {
        return productList;
    }
}
