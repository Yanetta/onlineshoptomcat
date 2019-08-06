package controller;

import factory.BasketServiceFactory;
import factory.OrderServiceFactory;
import factory.UserServiceFactory;
import model.Basket;
import model.Order;
import model.User;
import service.BasketService;
import service.OrderService;
import service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/order")
public class OrderController extends HttpServlet {

    private static final UserService userService = UserServiceFactory.getUserService();
    private static final BasketService basketService = BasketServiceFactory.getBasketService();
    private static final OrderService orderService = OrderServiceFactory.getOrderService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        User user = (User) req.getSession().getAttribute("user");
        Basket userBasket = basketService.findBasketByUser(user).get();
        req.setAttribute("userBasket", userBasket.getProductList());
        req.getRequestDispatcher("/order.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        User user = (User) req.getSession().getAttribute("user");
        Basket basket = basketService.findBasketByUser(user).get();
        String phone = req.getParameter("phone");
        String address = req.getParameter("address");
        Order order = new Order(user, basket, phone, address);
        orderService.addOrder(order);
        PrintWriter writer = resp.getWriter();
        writer.write( "The order is successful");
    }
}
