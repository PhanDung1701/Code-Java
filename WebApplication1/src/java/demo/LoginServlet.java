import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // Kiểm tra thông tin đăng nhập trong cơ sở dữ liệu hoặc danh sách người dùng
        boolean validLogin = checkLogin(username, password);

        if (validLogin) {
            // Đăng nhập thành công, chuyển hướng đến trang chính hoặc trang khác
            response.sendRedirect("home.jsp");
        } else {
            // Đăng nhập không thành công, chuyển hướng đến trang thông báo lỗi
            response.sendRedirect("loginError.jsp");
        }
    }

    private boolean checkLogin(String username, String password) {
        // Đây là nơi bạn kiểm tra thông tin đăng nhập trong cơ sở dữ liệu hoặc danh sách người dùng
        // Trả về true nếu thông tin hợp lệ, ngược lại trả về false
        // Đây chỉ là một ví dụ đơn giản, bạn cần triển khai kiểm tra thực tế ở đây
        return username.equals(username) && password.equals(password);
    }
}
