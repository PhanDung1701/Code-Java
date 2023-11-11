<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Giỏ hàng</title>
</head>
<body>

    <h2>Giỏ hàng</h2>

    <%
        // Lấy danh sách sản phẩm từ cookie
        Cookie[] cookies = request.getCookies();
        String productList = "";
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals("productList")) {
                    productList = cookie.getValue();
                    break;
                }
            }
        }

        // Chuyển danh sách sản phẩm thành mảng
        String[] products = productList.split(",");

        // Hiển thị danh sách sản phẩm
        if (products.length > 0 && !products[0].isEmpty()) {
            out.println("<ul>");
            for (String product : products) {
                out.println("<li>" + product + "</li>");
            }
            out.println("</ul>");
        } else {
            out.println("<p>Giỏ hàng trống.</p>");
        }
    %>

    <br>
    <a href="index.jsp">Quay lại trang chủ</a>

</body>
</html>
