package dao.impl;

import dao.OrderDao;
import model.Basket;
import model.Order;
import model.User;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OrderDaoImpl implements OrderDao {

    private static final Logger logger = Logger.getLogger(OrderDaoImpl.class);
    private static List<Order> orderList = new ArrayList<Order>();

    @Override
    public void addOrder(Order order) {
        orderList.add(order);
        logger.info("Order" + order + "added in db");
    }

    @Override
    public Optional<Order> findOrderByUser(User user) {
        return orderList.stream().filter(order -> order.getUser().getId().equals(user.getId())).findFirst();
    }

    @Override
    public void deleteOrder(Order order) {
        Optional<Order> optOrderForDeletion = orderList.stream().filter(order1 -> order1.getUser().getId().
                equals(order.getUser().getId())).findFirst();
        if (optOrderForDeletion.isPresent()) {
            orderList.remove(optOrderForDeletion.get());
            logger.info("Order of user with Id " + order.getUser().getId() + "deleted from db");

        } else {
            logger.info("Order of user with Id " + order.getUser().getId() + "does not exist in db");
        }
    }


    @Override
    public void updateOrder(Order order) {
    }

    @Override
    public List<Order> getAll() {
        return orderList;
    }
}
