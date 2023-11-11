import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng vận động viên bơi lội: ");
        int n = scanner.nextInt();

        VDVBL[] danhSachVDVBL = new VDVBL[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Nhập thông tin cho vận động viên thứ " + (i + 1));
            VDVBL vdvbl = new VDVBL("", 0, 0, 0, 0);
            vdvbl.nhapThongTin();
            danhSachVDVBL[i] = vdvbl;
        }

        System.out.println("");
        System.out.println("Danh sách vận động viên bơi lội:");
        for (int i = 0; i < n; i++) {
            System.out.println("");
            System.out.println("Vận động viên thứ " + (i + 1));
            danhSachVDVBL[i].xuatThongTin();
        }
        int maxHuyChuong = danhSachVDVBL[0].getSoHuyChuong();
        for (int i = 1; i < n; i++) {
            if (danhSachVDVBL[i].getSoHuyChuong() > maxHuyChuong) {
                maxHuyChuong = danhSachVDVBL[i].getSoHuyChuong();
            }
        }
        System.out.println("");
        System.out.println("Vận động viên có số huy chương đạt được nhiều nhất là:");
        for (int i = 0; i < n; i++) {
            if (danhSachVDVBL[i].getSoHuyChuong() == maxHuyChuong) {
                danhSachVDVBL[i].xuatThongTin();
                System.out.println("Số tiền thưởng: " + danhSachVDVBL[i].tinhTienThuong() + " VND");
            }
        }
    }
}
