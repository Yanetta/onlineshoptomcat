package service;

import model.Basket;
import model.User;

import java.util.List;
import java.util.Optional;

public interface BasketService {
    void addBasket(Basket basket);
    Optional<Basket> findBasketByUser (User user);
    void deleteBasket(Basket basket);
    void updateBasket(Basket basket);
    public List<Basket> getAll();
}


