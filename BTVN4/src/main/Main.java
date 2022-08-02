/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import java.util.Scanner;
import model.Employee;
import model.HinhChuNhat;
import model.NhanVien;
import model.PhuongTrinhBac2;
import service.impl.Bai1ServiceImpl;
import service.impl.EmployeeServiceImpl;
import service.impl.PtringBac2Impl;

/**
 *
 * @author Admin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bai1ServiceImpl bai1Impl = new Bai1ServiceImpl();
        PtringBac2Impl ptb2Impl = new PtringBac2Impl();
        EmployeeServiceImpl emplImpl = new EmployeeServiceImpl();
        int luaChon;
        do {
            System.out.println("1.Bài 1");
            System.out.println("2.Bài 2");
            System.out.println("3.Bài 3");
            System.out.println("4.Bài 4");
            System.out.println("0.Thoát");
            System.out.println("Nhập lựa chọn: ");
            luaChon = Integer.valueOf(sc.nextLine());
            switch (luaChon) {
                case 1: {
                    HinhChuNhat hcn1 = bai1Impl.inputHCN();
                    HinhChuNhat hcn2 = bai1Impl.inputHCN();
                    System.out.println("Thông tin: ");
                    System.out.println("HCN 1:");
                    hcn1.xuatThongTin();
                    System.out.println("HCN2:");
                    hcn2.xuatThongTin();
                    int s1 = hcn1.dienTich(hcn1.getChieuDai(), hcn1.getChieuRong());
                    int s2 = hcn2.dienTich(hcn2.getChieuDai(), hcn2.getChieuRong());
                    if (s1 > s2) {
                        System.out.println("Hình chữ nhật 1 có diện tích lớn hơn");
                    } else if (!(s1 > s2)) {
                        System.out.println("Hình chữ nhật 2 có diện tích lớn hơn");
                    } else {
                        System.out.println("Diện tích bằng nhau!");
                    }
                    break;
                }
                case 2: {
                    NhanVien nv1 = new NhanVien("ThuyDuong1", 18, "Tuyên Quang", "CNTT");
                    NhanVien nv2 = new NhanVien("ThuyDuong2", 18, "Tuyên Quang", "CNTT");
                    NhanVien nv3 = new NhanVien("ThuyDuong3", 18, "Tuyên Quang", "CNTT");
                    NhanVien nv4 = new NhanVien("ThuyDuong4", 18, "Tuyên Quang", "CNTT");
                    NhanVien nv5 = new NhanVien("ThuyDuong5", 18, "Tuyên Quang", "CNTT");
                    System.out.println("                        THÔNG TIN NHÂN VIÊN");
                    System.out.printf("%6s %10s %10s %10s %10s \n", "Mã nhân viên", "Họ tên", "Tuổi", "Địa chỉ", "Bộ phận");
                    nv1.inThongTin();
                    nv2.inThongTin();
                    nv3.inThongTin();
                    nv4.inThongTin();
                    nv5.inThongTin();
                    break;
                }
                case 3: {
                    PhuongTrinhBac2 ptb2 = ptb2Impl.inputPtBac2();
                    ptb2Impl.outputPtb2(ptb2);
                    ptb2Impl.giaiPTB2(ptb2);
                    break;
                }
                case 4: {
                    Employee em = emplImpl.input();
                    em.output();
                    break;
                }
                case 0: {
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
