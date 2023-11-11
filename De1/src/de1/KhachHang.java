/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package de1;

/**
 *
 * @author ADMIN
 */
public class KhachHang {
    private String Makh;
    private String Tenkh;
    private String Email;
    private String Sotaikhoan;

    public KhachHang(String Makh, String Tenkh, String Email, String Sotaikhoan) {
        this.Makh = Makh;
        this.Tenkh = Tenkh;
        this.Email = Email;
        this.Sotaikhoan = Sotaikhoan;
    }

    // Getters and setters for the properties
    public String getMakh() {
        return Makh;
    }

    public void setMakh(String Makh) {
        this.Makh = Makh;
    }

    public String getTenkh() {
        return Tenkh;
    }

    public void setTenkh(String Tenkh) {
        this.Tenkh = Tenkh;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getSotaikhoan() {
        return Sotaikhoan;
    }

    public void setSotaikhoan(String Sotaikhoan) {
        this.Sotaikhoan = Sotaikhoan;
    }
}

