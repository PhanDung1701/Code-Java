/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bt.java;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<SinhVienPoly> ds = new ArrayList<>();

        while (true) {
            System.out.println("Chọn chức năng:");
            System.out.println("1. Nhập danh sách sinh viên");
            System.out.println("2. Xuất thông tin sinh viên");
            System.out.println("3. Xuất danh sách sinh viên có học lực giỏi");
            System.out.println("4. Sắp xếp danh sách sinh viên theo điểm");
            System.out.println("5. Kết thúc");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.println("Chọn loại sinh viên (1: IT, 2: Biz):");
                    int loaisv = scanner.nextInt();
                    if (loaisv == 1) {
                        System.out.print("Nhập họ tên: ");
                        String hoTen = scanner.next();
                        System.out.print("Nhập ngành: ");
                        String nganh = scanner.next();
                        System.out.print("Nhập điểm Java: ");
                        double java = scanner.nextDouble();
                        System.out.print("Nhập điểm HTML: ");
                        double html = scanner.nextDouble();
                        System.out.print("Nhập điểm CSS: ");
                        double css = scanner.nextDouble();
                        ds.add(new SinhVienIT(hoTen, nganh, java, html, css));
                    } else if (loaisv == 2) {
                        System.out.print("Nhập họ tên: ");
                        String hoTen = scanner.next();
                        System.out.print("Nhập ngành: ");
                        String nganh = scanner.next();
                        System.out.print("Nhập điểm Marketing: ");
                        double marketing = scanner.nextDouble();
                        System.out.print("Nhập điểm Sales: ");
                        double sales = scanner.nextDouble();
                        ds.add(new SinhVienBiz(hoTen, nganh, marketing, sales));
                    }
                }
                case 2 -> {
                    for (SinhVienPoly sinhVien : ds) {
                        sinhVien.xuatThongTin();
                    }
                }
                case 3 -> {
                    boolean coSinhVienHocLucGioi = false;
                    for (SinhVienPoly sinhVien : ds) {
                        if (sinhVien.getHocLuc().equals("Giỏi")) {
                            sinhVien.xuatThongTin();
                            coSinhVienHocLucGioi = true;
                        }
                    }

                    if (!coSinhVienHocLucGioi) {
                        System.out.println("Không có sinh viên nào học lực giỏi.");
                    }
                    break;
                }
                case 4 -> {
                    int n = ds.size();
                    for (int i = 0; i < n - 1; i++) {
                        for (int j = i + 1; j < n; j++) {
                            if (ds.get(i).getDiem() < ds.get(j).getDiem()) {
                                ds.add(i, ds.remove(j));
                            }
                        }
                    }

                    System.out.println("Danh sách sinh viên sau khi sắp xếp:");
                    for (SinhVienPoly sinhVien : ds) {
                        sinhVien.xuatThongTin();
                    }
                    break;
                }

                case 5 ->
                    System.exit(0);

                default ->
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }
        }
    }
}
