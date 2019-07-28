package controller;

import factory.UserServiceFactory;
import model.User;
import service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Optional;

@WebServlet("/signin")
public class SignInController extends HttpServlet {
    private static final UserService userService = UserServiceFactory.getUserService();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String email = req.getParameter("email");
        String password = req.getParameter("password");
        Optional<User> optUser = userService.findUserByEmail(email);
        HttpSession session = req.getSession();

        if (optUser.isPresent() && optUser.get().getPassword().equals(password)) {
            session.setAttribute("user", optUser.get());
        }
//        such user doesnt exist, your login and password are incorrect
        else {
            req.getRequestDispatcher("/index.jsp").forward(req, resp);
        }
        if (optUser.get().getRole().equals("admin")) {
            resp.sendRedirect("/onlineshop/admin/users");

        } else {
            resp.sendRedirect("/onlineshop/products");
        }
//            req.getRequestDispatcher("/index.jsp").forward(req, resp);
        //req.getRequestDispatcher("/accessDenied.jsp").forward(req, resp);
    }
}



