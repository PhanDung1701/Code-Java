<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Trang ch?</title>
</head>
<body>

    <h2>Ch?n s?n ph?m</h2>

    <form action="AddToCart" method="post">
        <label for="product">S?n ph?m:</label>
        <select name="product" id="product">
            <option value="Product1">S?n ph?m 1</option>
            <option value="Product2">S?n ph?m 2</option>
            <option value="Product3">S?n ph?m 3</option>
        </select>
        <br>
        <input type="submit" value="Thêm vào gi? hàng">
    </form>

    <br>
    <a href="viewCart.jsp">Xem gi? hàng</a>

</body>
</html>
