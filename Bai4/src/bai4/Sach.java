/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai4;
public class Sach {
    // Các thuộc tính
    private String ten;
    private String tacgia;
    private double gia;
    private int nam;

    // Constructor
    public Sach(String ten, String tacgia, double gia, int nam) {
        this.ten = ten;
        this.tacgia = tacgia;
        this.gia = gia;
        this.nam = nam;
    }

    // Getter và Setter cho thuộc tính 'ten'
    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    // Getter và Setter cho thuộc tính 'tacgia'
    public String getTacgia() {
        return tacgia;
    }

    public void setTacgia(String tacgia) {
        this.tacgia = tacgia;
    }

    // Getter và Setter cho thuộc tính 'gia'
    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    // Getter và Setter cho thuộc tính 'nam'
    public int getNam() {
        return nam;
    }

    public void setNam(int nam) {
        this.nam = nam;
    }
}

