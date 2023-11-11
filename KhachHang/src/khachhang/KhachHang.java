/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package khachhang;
public class KhachHang {
    protected String maKhachHang;
    protected String hoTen;
    protected String ngayRaHoaDon;
    protected double soLuong;
    protected double donGia;

    public KhachHang(String maKhachHang, String hoTen, String ngayRaHoaDon, double soLuong, double donGia) {
        this.maKhachHang = maKhachHang;
        this.hoTen = hoTen;
        this.ngayRaHoaDon = ngayRaHoaDon;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }

    public double tinhTongCong() {
        return soLuong * donGia;
    }

    public void hienThiThongTin() {
        System.out.println("Mã khách hàng: " + maKhachHang);
        System.out.println("Họ tên: " + hoTen);
        System.out.println("Ngày ra hóa đơn: " + ngayRaHoaDon);
        System.out.println("Tổng số lượng điện tiêu thụ: " + soLuong);
        System.out.println("Thành tiền: " + tinhTongCong());
    }
}
