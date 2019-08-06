package factory;

import dao.BasketDao;
import dao.impl.BasketDaoImpl;
import service.BasketService;
import service.impl.BasketServiceImpl;

public class BasketServiceFactory {
    private BasketServiceFactory() {
    }
    private static BasketService instance;
    public static synchronized BasketService getBasketService(){
        if (instance == null){
            instance = new BasketServiceImpl();
        }
        return instance;
    }
}

