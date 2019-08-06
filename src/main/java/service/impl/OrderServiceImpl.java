package service.impl;

import dao.OrderDao;
import dao.ProductDao;
import factory.OrderDaoFactory;
import factory.ProductDaoFactory;
import model.Order;
import model.User;
import service.OrderService;

import java.util.List;
import java.util.Optional;

public class OrderServiceImpl implements OrderService {
    private static final OrderDao orderDao = OrderDaoFactory.getOrderDao();

    @Override
    public void addOrder(Order order) {
        orderDao.addOrder(order);
    }

    @Override
    public Optional<Order> findOrderByUser(User user) {
        return orderDao.findOrderByUser(user);
    }

    @Override
    public void deleteOrder(Order order) {
        orderDao.deleteOrder(order);
    }

    @Override
    public void updateOrder(Order order) {
    }

    @Override
    public List<Order> getAll() {
        return orderDao.getAll();
    }
}
