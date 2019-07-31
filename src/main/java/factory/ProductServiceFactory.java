package factory;

import service.ProductService;
import service.impl.ProductServiceImpl;

public class ProductServiceFactory {
    private ProductServiceFactory() {
    }
    private static ProductService instance;
    public static synchronized ProductService getProductServiceInstance(){
        if (instance == null){
            instance = new ProductServiceImpl();
        }
        return instance;
    }
}
