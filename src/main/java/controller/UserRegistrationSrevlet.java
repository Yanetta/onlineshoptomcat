package controller;

import factory.UserServiceFactory;
import model.User;
import service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/admin/register")
public class UserRegistrationSrevlet extends HttpServlet {
    private static final UserService userService = UserServiceFactory.getUserService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        req.getRequestDispatcher("/register.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        String email = req.getParameter("email");
        String password = req.getParameter("password");
        String repeatPassword = req.getParameter("repeatPassword");
        String userRole = req.getParameter("setUserRole");
        if (password.equals(repeatPassword)) {
            User user = new User(email, password, userRole );
            userService.addUser(user);
            resp.sendRedirect("/onlineshop/admin/users");
        } else{
            req.setAttribute("error", "Your passwords are not equals");
            req.getRequestDispatcher("/register.jsp").forward(req, resp);
        }
    }
}
