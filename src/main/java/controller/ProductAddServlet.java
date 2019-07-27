package controller;

import factory.ProductServiceFactory;
import factory.UserServiceFactory;
import model.Product;
import model.User;
import service.ProductService;
import service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
@WebServlet(value = "/addproduct")
public class ProductAddServlet extends HttpServlet {
    private static final ProductService productService = ProductServiceFactory.getProductServiceInstance();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("addproduct.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String productName = req.getParameter("productName");
        String productDescription = req.getParameter("productDescription");
        String productPrice = req.getParameter("productPrice");
        Product product = new Product(productName, productDescription, Long.valueOf(productPrice));
        productService.addProduct(product);
        resp.sendRedirect("/onlineshop");
    }
}
