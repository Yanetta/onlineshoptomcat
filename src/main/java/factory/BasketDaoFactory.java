package factory;

import dao.BasketDao;
import dao.ProductDao;
import dao.impl.BasketDaoImpl;
import dao.impl.ProductDaoImpl;

public class BasketDaoFactory {
    private BasketDaoFactory() {
    }
    private static BasketDao instance;
    public static synchronized BasketDao getBasketDao(){
        if (instance == null){
            instance = new BasketDaoImpl();
        }
        return instance;
    }
}
