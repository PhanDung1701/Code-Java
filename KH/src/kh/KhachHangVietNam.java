/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kh;

/**
 *
 * @author ADMIN
 */
public class KhachHangVietNam extends KH {
    private final String doiTuong;
    final int soLuong;
    private final double donGia;
    private final int dinhMuc;

    public KhachHangVietNam(String maKhachHang, String hoTen, int ngayRaHoaDon, int thangRaHoaDon, int namRaHoaDon, String doiTuong, int soLuong, double donGia, int dinhMuc) {
        super(maKhachHang, hoTen, ngayRaHoaDon, thangRaHoaDon, namRaHoaDon);
        this.doiTuong = doiTuong;
        this.soLuong = soLuong;
        this.donGia = donGia;
        this.dinhMuc = dinhMuc;
    }

    @Override
    public double tinhTien() {
        double thanhTien;
        if (soLuong <= dinhMuc) {
            thanhTien = soLuong * donGia;
        } else {
            thanhTien = dinhMuc * donGia + (soLuong - dinhMuc) * donGia * 25;
        }
        System.out.println("Thành tiền: " + thanhTien + " VND");
        return thanhTien;
    }
    @Override
    public void inThongTin() {
        System.out.println("Mã khách hàng: " + maKhachHang);
        System.out.println("Họ tên: " + hoTen);
        System.out.println("Ngày ra hóa đơn: " + ngayRaHoaDon + "/" + thangRaHoaDon + "/" + namRaHoaDon);
        System.out.println("Đối tượng: " + doiTuong);
        System.out.println("Định mức: " + dinhMuc+ " KW");
        System.out.println("Số lượng: " + soLuong + " KW");      
    }
}
