package factory;

import dao.OrderDao;
import dao.ProductDao;
import dao.impl.OrderDaoImpl;
import dao.impl.ProductDaoImpl;

public class OrderDaoFactory {
    private OrderDaoFactory() {
    }
    private static OrderDao instance;
    public static synchronized OrderDao getOrderDao(){
        if (instance == null){
            instance = new OrderDaoImpl();
        }
        return instance;
    }
}
