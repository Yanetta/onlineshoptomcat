package controller;

import factory.BasketDaoFactory;
import factory.BasketServiceFactory;
import factory.ProductServiceFactory;
import factory.UserServiceFactory;
import model.Basket;
import model.Product;
import model.User;
import service.BasketService;
import service.ProductService;
import service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@WebServlet("/chooseproducts")
public class ChooseProductsController extends HttpServlet {

    private static final BasketService basketService =
            BasketServiceFactory.getBasketService();
    private static final ProductService productService =
            ProductServiceFactory.getProductServiceInstance();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        List<Product> allProducts = productService.getAllProducts();
        req.setAttribute("allProducts", allProducts);
        req.getRequestDispatcher("choose_products.jsp").forward(req, resp);
    }
}
