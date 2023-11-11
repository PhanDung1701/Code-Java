import java.util.ArrayList;
import java.util.Scanner;

class KhachHang {
    private String maKH;
    private String hoTen;
    private String diaChi;
    private String ngayLapHD;
    private double soKW;
    private double donGia;
    private double dinhMuc;

    // Constructors
    public KhachHang() {
    }

    public KhachHang(String maKH, String hoTen, String diaChi, String ngayLapHD, double soKW, double donGia, double dinhMuc) {
        this.maKH = maKH;
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.ngayLapHD = ngayLapHD;
        this.soKW = soKW;
        this.donGia = donGia;
        this.dinhMuc = dinhMuc;
    }

    // Setters and Getters
    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getNgayLapHD() {
        return ngayLapHD;
    }

    public void setNgayLapHD(String ngayLapHD) {
        this.ngayLapHD = ngayLapHD;
    }

    public double getSoKW() {
        return soKW;
    }

    public void setSoKW(double soKW) {
        this.soKW = soKW;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public double getDinhMuc() {
        return dinhMuc;
    }

    public void setDinhMuc(double dinhMuc) {
        this.dinhMuc = dinhMuc;
    }

    // NhapKhachHang method
    public void NhapKhachHang() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập thông tin khách hàng:");
        System.out.print("Mã khách hàng: ");
        maKH = scanner.nextLine();
        System.out.print("Họ tên: ");
        hoTen = scanner.nextLine();
        System.out.print("Địa chỉ: ");
        diaChi = scanner.nextLine();
        System.out.print("Ngày lập hóa đơn: ");
        ngayLapHD = scanner.nextLine();
        System.out.print("Số KW tiêu thụ: ");
        soKW = scanner.nextDouble();
        System.out.print("Đơn giá: ");
        donGia = scanner.nextDouble();
        System.out.print("Định mức tiêu thụ: ");
        dinhMuc = scanner.nextDouble();
    }

    // HienThiKhachHang method
    public void HienThiKhachHang() {
        System.out.println("Thông tin khách hàng:");
        System.out.println("Mã khách hàng: " + maKH);
        System.out.println("Họ tên: " + hoTen);
        System.out.println("Địa chỉ: " + diaChi);
        System.out.println("Ngày lập hóa đơn: " + ngayLapHD);
        System.out.println("Số KW tiêu thụ: " + soKW);
    }

    // ThanhTien method
    public double ThanhTien() {
        if (soKW <= dinhMuc) {
            return soKW * donGia;
        } else {
            return dinhMuc * donGia + (soKW - dinhMuc) * donGia * 2500;
        }
    }
}

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng khách hàng: ");
        int n = scanner.nextInt();

        ArrayList<KhachHang> danhSachKhachHang = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            KhachHang khachHang = new KhachHang();
            khachHang.NhapKhachHang();
            danhSachKhachHang.add(khachHang);
        }

        System.out.println("Danh sách khách hàng và tiền điện phải nộp:");
        for (KhachHang khachHang : danhSachKhachHang) {
            khachHang.HienThiKhachHang();
            System.out.println("Tiền điện phải nộp: " + khachHang.ThanhTien());
            System.out.println();
        }

        System.out.println("Danh sách khách hàng tiêu thụ điện vượt định mức:");
        for (KhachHang khachHang : danhSachKhachHang) {
            if (khachHang.getSoKW() > khachHang.getDinhMuc()) {
                khachHang.HienThiKhachHang();
                System.out.println();
            }
        }
    }
}
