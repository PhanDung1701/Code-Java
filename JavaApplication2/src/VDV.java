import java.util.Scanner;
class VDV {
    private String hoTen;
    private double chieuCao;
    int soNamThiDau;

    public VDV(String hoTen, double chieuCao, int soNamThiDau) {
        this.hoTen = hoTen;
        this.chieuCao = chieuCao;
        this.soNamThiDau = soNamThiDau;
    }

    public String getHoTen() {
        return hoTen;
    }

    public double getChieuCao() {
        return chieuCao;
    }

    public int getSoNamThiDau() {
        return soNamThiDau;
    }

    public void nhapThongTin() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tên vận động viên: ");
        this.hoTen = scanner.nextLine();
        System.out.print("Nhập chiều cao: ");
        this.chieuCao = scanner.nextDouble();
        System.out.print("Nhập số năm thi đấu: ");
        this.soNamThiDau = scanner.nextInt();
    }

    public void inThongTin() {
        System.out.println("Họ tên: " + hoTen);
        System.out.println("Chiều cao: " + chieuCao + " cm");
        System.out.println("Số năm thi đấu: " + soNamThiDau + " năm");
    }
}

class VDVBL extends VDV {
    private int soHuyChuong;
    private double thoiGianThiDau;

    public VDVBL(String hoTen, double chieuCao, int soNamThiDau, int soHuyChuong, double thoiGianThiDau) {
        super(hoTen, chieuCao, soNamThiDau);
        this.soHuyChuong = soHuyChuong;
        this.thoiGianThiDau = thoiGianThiDau;
    }

    public int getSoHuyChuong() {
        return soHuyChuong;
    }

    public double getThoiGianThiDau() {
        return thoiGianThiDau;
    }

    public void nhapThongTin() {
        super.nhapThongTin();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số huy chương đạt được: ");
        this.soHuyChuong = scanner.nextInt();
        System.out.print("Nhập thời gian thi đấu (s): ");
        this.thoiGianThiDau = scanner.nextDouble();
    }

    public void xuatThongTin() {
        super.inThongTin();
        System.out.println("Số huy chương đạt được: " + soHuyChuong);
        System.out.println("Thời gian thi đấu: " + thoiGianThiDau + " giây");
        System.out.println("Số tiền thưởng là: " + tinhTienThuong());
    }

    public double tinhTienThuong() {
        return soHuyChuong * 5000000 + soNamThiDau * 400000;
    }
}

