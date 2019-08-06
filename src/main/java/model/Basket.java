package model;

import java.util.ArrayList;
import java.util.List;

public class Basket {
    private Long id;
    User user;
    List<Product> productList;

    public Basket() {
    }

    public Basket(User user, List<Product> productList) {
        this.user = user;
        this.productList = productList;
    }

    public User getUser() {
        return user;
    }

    public Basket(Long id, User user, List<Product> productList) {
        this.id = id;
        this.user = user;
        this.productList = productList;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    @Override
    public String toString() {
        return "Basket{" +
                "user=" + user +
                ", productList=" + productList +
                '}';
    }
}
