/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlygiadung;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public class KetNoi {

    private Connection connect;

    public KetNoi() {
        try {
            connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/qldogiadung", "root", "");
        } catch (SQLException ex) {
            JOptionPane.showConfirmDialog(null, "Lỗi kết nối!", "Thông báo", JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
    }
    public int executeUpdate(String query) {
        try {
            Statement stmt = connect.createStatement();
            return stmt.executeUpdate(query);
        } catch (SQLException ex) {
            JOptionPane.showConfirmDialog(null, "Lỗi: " + ex.getMessage(), "Thông báo", JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE);
        }
        return -1;
    }
    public ResultSet executeQuery(String query) {
        try {
            Statement stmt = connect.createStatement();
            return stmt.executeQuery(query);
        } catch (SQLException ex) {
            JOptionPane.showConfirmDialog(null, "Lỗi: " + ex.getMessage(), "Thông báo", JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE);
        }
        return null;
    }
}
                                     