    package demo;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/dang_nhap")
public class dang_nhap extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        
        // Kiểm tra tài khoản và mật khẩu ở đây. Đây là một ví dụ đơn giản.
        if (username.equals("linhvipro@gmail.com") && password.equals("123456")) {
            // Đăng nhập thành công
             request.setAttribute("message2", " Đăng nhập thành công ");
            request.setAttribute("message1", " Email cua ban la: "+username);
            request.setAttribute("message", " Mat khau cua ban la: "+password);
            request.getRequestDispatcher("success.jsp").forward(request, response);
        } else {
            // Đăng nhập không thành công
            request.setAttribute("message", "Đăng nhập không thành công. Vui lòng thử lại.");
            request.getRequestDispatcher("login.jsp").forward(request, response);
        }
    }
}
