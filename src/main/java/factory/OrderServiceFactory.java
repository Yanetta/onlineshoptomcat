package factory;

import dao.BasketDao;
import dao.impl.BasketDaoImpl;
import service.OrderService;
import service.impl.OrderServiceImpl;

public class OrderServiceFactory {
    private OrderServiceFactory() {
    }
    private static OrderService instance;
    public static synchronized OrderService getOrderService(){
        if (instance == null){
            instance = new OrderServiceImpl();
        }
        return instance;
    }
}
