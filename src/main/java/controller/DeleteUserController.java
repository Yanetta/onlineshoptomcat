package controller;

import factory.UserServiceFactory;
import model.Product;
import service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/admin/deleteuser")
public class DeleteUserController extends HttpServlet {
    UserService userService = UserServiceFactory.getUserService();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Long id = Long.valueOf(req.getParameter("deleteuser"));
        userService.deleteUser(id);

        resp.sendRedirect("/onlineshop/admin/users");
        // req.getRequestDispatcher("/users.jsp").forward(req, resp);
    }
}

