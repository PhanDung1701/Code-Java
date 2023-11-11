/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kh;

/**
 *
 * @author ADMIN
 */
public class KH {
protected String maKhachHang;
    protected String hoTen;
    protected int ngayRaHoaDon;
    protected int thangRaHoaDon;
    protected int namRaHoaDon;

    public KH(String maKhachHang, String hoTen, int ngayRaHoaDon, int thangRaHoaDon, int namRaHoaDon) {
        this.maKhachHang = maKhachHang;
        this.hoTen = hoTen;
        this.ngayRaHoaDon = ngayRaHoaDon;
        this.thangRaHoaDon = thangRaHoaDon;
        this.namRaHoaDon = namRaHoaDon;
    }

    public void inThongTin() {
        System.out.println("Mã khách hàng: " + maKhachHang);
        System.out.println("Họ tên: " + hoTen);
        System.out.println("Ngày ra hóa đơn: " + ngayRaHoaDon + "/" + thangRaHoaDon + "/" + namRaHoaDon);
    }

    public double tinhTien() {
    return 0;
    }
}
