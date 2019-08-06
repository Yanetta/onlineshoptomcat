package dao.impl;

import dao.BasketDao;
import model.Basket;
import model.User;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class BasketDaoImpl implements BasketDao {
    private static final Logger logger = Logger.getLogger(BasketDaoImpl.class);
    private static List<Basket> basketList = new ArrayList<Basket>();


    @Override
    public void addBasket(Basket basket) {
        basketList.add(basket);
        logger.info("Basket" + basket + "added in db");
    }

    @Override
    public Optional<Basket> findBasketByUser(User user) {
        return basketList.stream().filter(basket -> basket.getUser().getId().equals(user.getId())).findFirst();
    }

    @Override
    public void deleteBasket(Basket basket) {
        Optional<Basket> optBasketForDeletion = basketList.stream().filter(basketFromStream -> basketFromStream.getUser().getId().
                equals(basket.getUser().getId())).findFirst();
        if (optBasketForDeletion.isPresent()) {
            basketList.remove(optBasketForDeletion.get());
            logger.info("Basket of user with Id " + basket.getUser().getId() + "deleted from db");

        } else {
            logger.info("Basket of user with Id " + basket.getUser().getId() + "does not exist in db");
        }
    }

    @Override
    public List<Basket> getAll() {
        return basketList;
    }

    @Override
    public void updateBasket(Basket basket) {

    }
}
