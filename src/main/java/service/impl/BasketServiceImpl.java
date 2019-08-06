package service.impl;

import dao.BasketDao;
import dao.ProductDao;
import factory.BasketDaoFactory;
import factory.ProductDaoFactory;
import model.Basket;
import model.Product;
import model.User;
import service.BasketService;

import java.util.List;
import java.util.Optional;

public class BasketServiceImpl implements BasketService {
    private static final BasketDao basketDao = BasketDaoFactory.getBasketDao();

    @Override
    public void addBasket(Basket basket) {
        basketDao.addBasket(basket);
    }

    @Override
    public Optional<Basket> findBasketByUser(User user) {
        return basketDao.findBasketByUser(user);
    }

    @Override
    public void deleteBasket(Basket basket) {
        basketDao.deleteBasket(basket);
    }

    @Override
    public void updateBasket(Basket basket) {
    }

    @Override
    public List<Basket> getAll() {
        return basketDao.getAll();
    }
}
