package demo;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.logging.Logger;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    private static final Logger logger = Logger.getLogger(LoginServlet.class.getName());

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if (username.equals("admin@gmail.com") && password.equals("Viet123")) {
            // Đăng nhập thành công
            request.setAttribute("message2", "Servlet thanh cong at /WebJava");
            request.setAttribute("message1", " Email cua ban la: " + username);
            request.setAttribute("message", " Mat khau cua ban la: " + password);
            request.getRequestDispatcher("success.jsp").forward(request, response);

        } else {
            // Đăng nhập không thành công
            request.setAttribute("message", "Đăng nhập không thành công. Vui lòng thử lại.");
            request.getRequestDispatcher("login.jsp").forward(request, response);
        }
    }
}
