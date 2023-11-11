/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package khachhang;

/**
 *
 * @author ADMIN
 */
public class KhachHangVietNam extends KhachHang {
    private final String doiTuongKhachHang;
    private final double dinhMuc;

    public KhachHangVietNam(String maKhachHang, String hoTen, String ngayRaHoaDon, String doiTuongKhachHang, double soLuong, double donGia, double dinhMuc) {
        super(maKhachHang, hoTen, ngayRaHoaDon, soLuong, donGia);
        this.doiTuongKhachHang = doiTuongKhachHang;
        this.dinhMuc = dinhMuc;
    }

    @Override
    public double tinhTongCong() {
        if (soLuong <= dinhMuc) {
            return soLuong * donGia;
        } else {
            return (dinhMuc * donGia) + ((soLuong - dinhMuc) * donGia * 25);
        }
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Đối tượng khách hàng: " + doiTuongKhachHang);
        System.out.println("Định mức: " + dinhMuc);
    }
}
