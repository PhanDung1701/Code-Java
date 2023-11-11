/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kh;

public class KhachHangNuocNgoai extends KH {
    private String quocTich;
    int soLuong;
    private double donGia;

    public KhachHangNuocNgoai(String maKhachHang, String hoTen, int ngayRaHoaDon, int thangRaHoaDon, int namRaHoaDon, String quocTich, int soLuong, double donGia) {
        super(maKhachHang, hoTen, ngayRaHoaDon, thangRaHoaDon, namRaHoaDon);
        this.quocTich = quocTich;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }

    @Override
    public double tinhTien() {
        double thanhTien = soLuong * donGia;
        System.out.println("Thành tiền: " + thanhTien + " USD");
        return thanhTien;
    }
    public void inThongTin() {
        System.out.println("Mã khách hàng: " + maKhachHang);
        System.out.println("Họ tên: " + hoTen);
        System.out.println("Ngày ra hóa đơn: " + ngayRaHoaDon + "/" + thangRaHoaDon + "/" + namRaHoaDon);
        System.out.println("Quốc tịch: " + quocTich + " ");
        System.out.println("Số lượng: " + soLuong + " KW");
    }
}
