package controller;

import factory.BasketServiceFactory;
import factory.ProductServiceFactory;
import model.Basket;
import model.Product;
import model.User;
import service.BasketService;
import service.ProductService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@WebServlet("/userbasket")
public class BasketController extends HttpServlet {
    private static final BasketService basketService =
            BasketServiceFactory.getBasketService();
    private static final ProductService productService = ProductServiceFactory.getProductServiceInstance();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        User user = (User) req.getSession().getAttribute("user");
        System.out.println(user);
        String productName = req.getParameter("name");
        Product product = productService.getProductByName(productName).get();
        System.out.println(product);

        if (user != null) {
            Optional<Basket> optBasket = basketService.findBasketByUser(user);
            if (optBasket.isPresent()) {
                //Product product = (Product)session.getAttribute("product");
                optBasket.get().getProductList().add(product);
                resp.sendRedirect("/onlineshop/chooseproducts");
            }

            if (!optBasket.isPresent()) {
                Basket basket = new Basket(user, new ArrayList<>());
                basket.getProductList().add(product);
                basketService.addBasket(basket);
                resp.sendRedirect("/onlineshop/chooseproducts");
            }
        }
    }
}
