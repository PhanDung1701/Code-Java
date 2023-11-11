
package khachhang;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        List<KhachHang> danhSachKhachHang = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Chọn loại khách hàng:");
            System.out.println("1. Khách hàng Việt Nam");
            System.out.println("2. Khách hàng nước ngoài");
            System.out.println("0. Kết thúc");
            System.out.print("Nhập lựa chọn:");

            int luaChon = scanner.nextInt();


            if (luaChon == 0) {
                break;
            }

            KhachHang khachHang = null;

            if (luaChon == 1) {
                System.out.println("Nhập thông tin cho khách hàng Việt Nam:");
                khachHang = nhapThongTinKhachHangVietNam();
            } else if (luaChon == 2) {
                System.out.println("Nhập thông tin cho khách hàng nước ngoài:");
                khachHang = nhapThongTinKhachHangNuocNgoai();
            }

            if (khachHang != null) {
                danhSachKhachHang.add(khachHang);
                System.out.println("Thông tin khách hàng đã được thêm.");
            }
        }

        // In danh sách hóa đơn
        for (KhachHang khachHang : danhSachKhachHang) {
            khachHang.hienThiThongTin();
            System.out.println();
        }
    }

    public static KhachHangVietNam nhapThongTinKhachHangVietNam() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập mã khách hàng: ");
        String maKhachHang = scanner.nextLine();
        System.out.print("Nhập họ tên: ");
        String hoTen = scanner.nextLine();
        System.out.print("Nhập ngày ra hóa đơn (dd/mm/yyyy): ");
        String ngayRaHoaDon = scanner.nextLine();
        System.out.print("Nhập đối tượng khách hàng: ");
        String doiTuongKhachHang = scanner.nextLine();
        System.out.print("Nhập số lượng: ");
        double soLuong = scanner.nextDouble();
        System.out.print("Nhập đơn giá: ");
        double donGia = scanner.nextDouble();
        System.out.print("Nhập định mức: ");
        double dinhMuc = scanner.nextDouble();
        return new KhachHangVietNam(maKhachHang, hoTen, ngayRaHoaDon, doiTuongKhachHang, soLuong, donGia, dinhMuc);
    }

    public static KhachHangNuocNgoai nhapThongTinKhachHangNuocNgoai() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập mã khách hàng: ");
        String maKhachHang = scanner.nextLine();
        System.out.print("Nhập họ tên: ");
        String hoTen = scanner.nextLine();
        System.out.print("Nhập ngày ra hóa đơn (dd/mm/yyyy): ");
        String ngayRaHoaDon = scanner.nextLine();
        System.out.print("Nhập quốc tịch: ");
        String quocTich = scanner.nextLine();
        System.out.print("Nhập số lượng: ");
        double soLuong = scanner.nextDouble();
        System.out.print("Nhập đơn giá: ");
        double donGia = scanner.nextDouble();
        return new KhachHangNuocNgoai(maKhachHang, hoTen, ngayRaHoaDon, quocTich, soLuong, donGia);

    }
}
