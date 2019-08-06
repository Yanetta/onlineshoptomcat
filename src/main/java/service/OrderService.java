package service;

import model.Order;
import model.User;

import java.util.List;
import java.util.Optional;

public interface OrderService {
    void addOrder(Order order);

    Optional<Order> findOrderByUser(User user);

    void deleteOrder(Order order);

    void updateOrder(Order order);

    public List<Order> getAll();
}
