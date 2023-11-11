/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package khachhang;

/**
 *
 * @author ADMIN
 */
public class KhachHangNuocNgoai extends KhachHang {
    private final String quocTich;

    public KhachHangNuocNgoai(String maKhachHang, String hoTen, String ngayRaHoaDon, String quocTich, double soLuong, double donGia) {
        super(maKhachHang, hoTen, ngayRaHoaDon, soLuong, donGia);
        this.quocTich = quocTich;
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Quốc tịch: " + quocTich);
    }
}

