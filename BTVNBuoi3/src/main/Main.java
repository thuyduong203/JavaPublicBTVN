package main;

import service.impl.ServiceImpl;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ServiceImpl svImpl = new ServiceImpl();
        int luaChon;
        do {
            System.out.println("+--------------Menu----------------+");
            System.out.println("    1.Bài 1");
            System.out.println("    2.Bài 2");
            System.out.println("    0.Thoát");
            System.out.println("+----------------------------------+");
            System.out.println("Mời nhập lựa chọn: ");
            luaChon = Integer.valueOf(sc.nextLine());
            switch (luaChon) {
                case 1: {
                    System.out.println("Nhập số phần tử của mảng: ");
                    int n = sc.nextInt();
                    int[] mangSoNguyen = new int[n];
                    svImpl.nhapMang(mangSoNguyen);
                    System.out.println("Mảng bạn vừa nhập: ");
                    svImpl.xuatMang(mangSoNguyen);
                    System.out.println("Tổng các số lẻ ở vtri chẵn trong mảng : " + svImpl.tongSoLe(mangSoNguyen));
                    System.out.println("Vị trí của min:");
                    svImpl.vtriMinTrongMang(mangSoNguyen);
                    System.out.println("Số chính phương trong mảng: ");
                    svImpl.hienThiSoChinhPhuong(mangSoNguyen);
                    System.out.println("Số nguyên tố trong mảng: ");
                    svImpl.hienThiSNT(mangSoNguyen);
                    svImpl.sapXepMang(mangSoNguyen);
                    System.out.println("Mảng sắp xếp tăng dần:");
                    svImpl.xuatMang(mangSoNguyen);
                    break;
                }
                case 2: {
                    System.out.println("Nhập chuỗi: ");
                    String chuoi = sc.nextLine();
                    System.out.println("Chuỗi bạn vừa nhập: " + chuoi);
                    String chuoiKoConKhoangTrang = svImpl.xoaKhoangTrangThua(chuoi);
                    String chuoiKoConSo = svImpl.xoaSoTrongChuoi(chuoiKoConKhoangTrang);
                    String chuoiVietHoa = svImpl.vietHoaFullName(chuoiKoConSo);
                    System.out.println("Output: " + chuoiVietHoa);
                    break;
                }
                case 0: {
                    System.out.println("Tạm biệt!");
                    break;
                }
                default: {
                    System.out.println("Lựa chọn không tồn tại!");
                    break;
                }
            }
        } while (luaChon != 0);
    }
}
