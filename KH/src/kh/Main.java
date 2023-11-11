package kh;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<KH> danhSachHoaDon = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("");
            System.out.println("Menu:");
            System.out.println("1. Thêm khách hàng Việt Nam");
            System.out.println("2. Thêm khách hàng nước ngoài");
            System.out.println("3. Tính tổng số lượng điện tiêu thụ cho từng loại khách hàng");
            System.out.println("4. Xuất ra các hoá đơn trong tháng 09 năm 2013");
            System.out.println("5. Xuất danh sách các hóa đơn khách hàng");
             System.out.println("6. Tính trung bình thành tiền của khách hàng nước ngoài");
            System.out.println("0. Thoát");
            System.out.print("Chọn: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1: {
                    System.out.println("");
                    System.out.print("Mã khách hàng: ");
                    String maKhachHang = scanner.next();
                    System.out.print("Họ tên: ");
                    String hoTen = scanner.next();
                    System.out.print("Ngày ra hóa đơn (ngày tháng năm): ");
                    int ngay = scanner.nextInt();
                    int thang = scanner.nextInt();
                    int nam = scanner.nextInt();
                    System.out.print("Đối tượng khách hàng (sinh hoạt, kinh doanh, sản xuất): ");
                    String doiTuong = scanner.next();
                    System.out.print("Số lượng (số KW tiêu thụ): ");
                    int soLuong = scanner.nextInt();
                    System.out.print("Đơn giá: ");
                    double donGia = scanner.nextDouble();
                    System.out.print("Định mức: ");
                    int dinhMuc = scanner.nextInt();

                    KhachHangVietNam khachHangVietNam = new KhachHangVietNam(maKhachHang, hoTen, ngay, thang, nam, doiTuong, soLuong, donGia, dinhMuc);
                    danhSachHoaDon.add(khachHangVietNam);
                    break;
                }
                case 2: {
                    System.out.println("");
                    System.out.print("Mã khách hàng: ");
                    String maKhachHang = scanner.next();
                    System.out.print("Họ tên: ");
                    String hoTen = scanner.next();
                    System.out.print("Ngày ra hóa đơn (ngày tháng năm): ");
                    int ngay = scanner.nextInt();
                    int thang = scanner.nextInt();
                    int nam = scanner.nextInt();
                    System.out.print("Quốc tịch: ");
                    String quocTich = scanner.next();
                    System.out.print("Số lượng (số KW tiêu thụ): ");
                    int soLuong = scanner.nextInt();
                    System.out.print("Đơn giá: ");
                    double donGia = scanner.nextDouble();

                    KhachHangNuocNgoai khachHangNuocNgoai = new KhachHangNuocNgoai(maKhachHang, hoTen, ngay, thang, nam, quocTich, soLuong, donGia);
                    danhSachHoaDon.add(khachHangNuocNgoai);
                    break;
                }
                case 3: {
                        int tongSLVietNam = 0;
                        int tongSLNuocNgoai = 0;
                        for (int i = 0; i < danhSachHoaDon.size(); i++) {
                            KH khachHang = danhSachHoaDon.get(i);
                            if (khachHang instanceof KhachHangVietNam) {
                                tongSLVietNam += ((KhachHangVietNam) khachHang).soLuong;
                            } else if (khachHang instanceof KhachHangNuocNgoai) {
                                tongSLNuocNgoai += ((KhachHangNuocNgoai) khachHang).soLuong;
                            }
                        }
                        System.out.println("");
                        System.out.println("Tổng số lượng điện tiêu thụ của khách hàng Việt Nam: " + tongSLVietNam + " KW");
                        System.out.println("Tổng số lượng điện tiêu thụ của khách hàng nước ngoài: " + tongSLNuocNgoai + " KW");
                        break;
                    }

                case 4: {
                        System.out.println("");
                        System.out.println("Các hoá đơn trong tháng 09 năm 2013:");
                        for (int i = 0; i < danhSachHoaDon.size(); i++) {
                            KH khachHang = danhSachHoaDon.get(i);
                            if (khachHang.namRaHoaDon == 2013 && khachHang.thangRaHoaDon == 9) {
                                System.out.println("");
                                khachHang.inThongTin();
                                khachHang.tinhTien();
                            }
                        }
                        break;
                    }

                case 5: {
                        System.out.println("Danh sách các hóa đơn:");
                        System.out.println("");
                        for (int i = 0; i < danhSachHoaDon.size(); i++) {
                            KH khachHang = danhSachHoaDon.get(i);
                            khachHang.inThongTin();
                            khachHang.tinhTien();
                            System.out.println("");
                        }
                        break;
                    }
               case 6: {
                        double tongThanhTienNgoai = 0;
                        int soKhachHangNgoai = 0;
                        for (int i = 0; i < danhSachHoaDon.size(); i++) {
                            KH khachHang = danhSachHoaDon.get(i);
                            if (khachHang instanceof KhachHangNuocNgoai) {
                                double thanhTien = khachHang.tinhTien();
                                tongThanhTienNgoai += thanhTien;
                                soKhachHangNgoai++;
                            }
                        }
                        if (soKhachHangNgoai > 0) {
                            double trungBinhThanhTienNgoai = tongThanhTienNgoai / soKhachHangNgoai;
                            System.out.println("");
                            System.out.println("Trung bình thành tiền của khách hàng nước ngoài: " + trungBinhThanhTienNgoai+ "USD");
                        } else {
                            System.out.println("Không có khách hàng nước ngoài nào.");
                        }
                        break;
                    }

                case 0:
                    System.out.println("Thoát chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }
        } while (choice != 0);

        scanner.close();
    }
}
