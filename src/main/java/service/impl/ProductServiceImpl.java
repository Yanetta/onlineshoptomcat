package service.impl;

import dao.ProductDao;
import dao.impl.ProductDaoImpl;
import factory.ProductDaoFactory;
import factory.ProductServiceFactory;
import model.Product;
import service.ProductService;

import java.util.List;

public class ProductServiceImpl implements ProductService {

    private static final ProductDao productDao = ProductDaoFactory.getProductDao();

    @Override
    public void addProduct(Product product) {
        productDao.addProduct(product);
    }

    @Override
    public List<Product> getAllProducts() {
        return productDao.getAllProducts();
    }
}
