package factory;

import dao.ProductDao;
import dao.impl.ProductDaoImpl;

public class ProductDaoFactory {
    private ProductDaoFactory() {
    }
    private static ProductDao instance;
    public static synchronized ProductDao getProductDao(){
        if (instance == null){
            instance = new ProductDaoImpl();
        }
        return instance;
    }
}
