package Connect;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

public class testcon {
    public static void main(String[] args) throws SQLException {
        Connection con = Ketnoi.getConnection();
        Statement stm = con.createStatement();
        ResultSet rs = stm.executeQuery("SELECT * FROM sach");

        while (rs.next()) {
            System.out.println("Ma: " + rs.getInt(1));
            System.out.println("Tên : " + rs.getString(2));
            System.out.println("tac giả : " + rs.getString(3));
            System.out.println("nsb : " + rs.getString(4));
        }
    }
}
