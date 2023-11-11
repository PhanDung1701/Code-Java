package tapchi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class QLTapchi {
    public static void main(String[] args) {
        String jdbcUrl = "jdbc:mysql://localhost:3306/qltapchi";
        String username = "root";
        String password = "";
        try {
            Connection connection = DriverManager.getConnection(jdbcUrl, username, password);
            String query = "SELECT * FROM tap_chi";

            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery(query);

            ArrayList<TapChi> tapchiList = new ArrayList<>();

            while (resultSet.next()) {
                int maTC = resultSet.getInt("MaTC");
                String tenTC = resultSet.getString("TenTC");
                String nhaXB = resultSet.getString("NhaXB");
                int namXB = resultSet.getInt("NamXB");
                
                TapChi tapChi = new TapChi(maTC, tenTC, nhaXB, namXB);
                tapchiList.add(tapChi);
            }

            for (TapChi tapChi : tapchiList) {
                System.out.println("Ma tap chi: " + tapChi.getMaTC());
                System.out.println("Ten tap chi: " + tapChi.getTenTC());
                System.out.println("Nha xuat ban: " + tapChi.getNhaXB());
                System.out.println("Nam xuat ban: " + tapChi.getNamXB());
                System.out.println("----------------------");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
