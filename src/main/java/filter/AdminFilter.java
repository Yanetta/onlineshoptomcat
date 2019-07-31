package filter;

import model.User;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebFilter(urlPatterns = {"/admin/*"})
public class AdminFilter implements Filter {

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse,
                         FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest httpServletRequest = (HttpServletRequest) servletRequest;
        HttpServletResponse httpServletResponse = (HttpServletResponse) servletResponse;
        User userFromSession = (User) httpServletRequest.getSession().getAttribute("user");
        if (userFromSession != null && userFromSession.getRole().equals("admin")) {
            filterChain.doFilter(servletRequest, servletResponse);
        } else {
            httpServletRequest.getRequestDispatcher("/accessDenied.jsp").
                    forward(httpServletRequest, httpServletResponse);
        }
    }
}
