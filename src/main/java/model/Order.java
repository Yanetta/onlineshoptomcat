package model;

public class Order {
    private Long id;
    User user;
    Basket basket;
    String phone;
    String address;

    public Order() {
    }

    public Order(Long id, User user, Basket basket, String phone, String address) {
        this.id = id;
        this.user = user;
        this.basket = basket;
        this.phone = phone;
        this.address = address;
    }

    public Order(User user, Basket basket, String phone, String address) {
        this.user = user;
        this.basket = basket;
        this.phone = phone;
        this.address = address;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Basket getBasket() {
        return basket;
    }

    public void setBasket(Basket basket) {
        this.basket = basket;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", user=" + user +
                ", basket=" + basket +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
