/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bt.java;

/**
 *
 * @author ADMIN
 */
public abstract class SinhVienPoly {

    private final String hoTen;
    private final String nganh;

    public SinhVienPoly(String hoTen, String nganh) {
        this.hoTen = hoTen;
        this.nganh = nganh;
    }

    public abstract double getDiem();

    public String getHocLuc() {
        double diem = getDiem();
        if (diem < 5) {
            return "Yếu";
        } else if (diem >= 5 && diem <= 7) {
            return "Trung Bình";
        } else if (diem > 7 && diem < 8) {
            return "Khá";
        } else {
            return "Giỏi";
        }
    }

    public void xuatThongTin() {
        System.out.println("-------------------------------------------------");
        System.out.println(String.format("| %-10s | %-10s | %-6s | %-10s |", "Họ tên", "Ngành", "Điểm", "Học lực"));
        System.out.println(String.format("| %-10s | %-10s | %-6.2f | %-10s |", hoTen, nganh, getDiem(), getHocLuc()));
        System.out.println("-------------------------------------------------");
    }

}
