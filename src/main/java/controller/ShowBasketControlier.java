package controller;

import factory.BasketServiceFactory;
import factory.UserServiceFactory;
import model.Basket;
import model.User;
import service.BasketService;
import service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/showbasket")
public class ShowBasketControlier extends HttpServlet {

    private static final UserService userService = UserServiceFactory.getUserService();
    private static final BasketService basketService = BasketServiceFactory.getBasketService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        User user = (User) req.getSession().getAttribute("user");
        Basket userBasket = basketService.findBasketByUser(user).get();
        req.setAttribute("userBasket", userBasket.getProductList());
        req.getRequestDispatcher("/show_basket.jsp").forward(req, resp);
    }

}
