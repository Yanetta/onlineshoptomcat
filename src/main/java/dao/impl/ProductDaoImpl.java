package dao.impl;

import dao.ProductDao;
import model.Product;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ProductDaoImpl implements ProductDao {
    private static final Logger logger = Logger.getLogger(ProductDaoImpl.class);

    private static final List<Product> productList = new ArrayList<Product>();
    public void addProduct(Product product) {
        productList.add(product);
        logger.info("User" + product + "added in db");
    }

    public List<Product> getAllProducts() {
        return productList;
    }

    @Override
    public Optional<Product> getProductByName(String name) {
          return productList.stream().filter(productFromStream -> productFromStream.getName().equals(name)).findFirst();
    }
}
