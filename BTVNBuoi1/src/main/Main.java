/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import java.util.Scanner;
import service.impl.MainServiceImpl;

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
        MainServiceImpl mainSV = new MainServiceImpl();
        int luaChon;
        do {
            System.out.println("+------------Menu-------------+");
            System.out.println("    1.Bài 1");
            System.out.println("    2.Bài 2");
            System.out.println("    3.Bài 3");
            System.out.println("    0.Thoát");
            System.out.println("Mời nhập lựa chọn: ");
            luaChon = sc.nextInt();
            switch (luaChon) {
                case 1: {
                    System.out.println("+-------------------Bài 1---------------------+");
                    System.out.println("Nhập ngày sinh: ");
                    int ngaySinh = sc.nextInt();
                    System.out.println("Nhập tháng sinh: ");
                    int thangSinh = sc.nextInt();
                    System.out.println("Nhập năm sinh:");
                    int namSinh = sc.nextInt();
                    if (mainSV.checkNgayThang(ngaySinh, thangSinh, namSinh)) {
                        System.out.println("Ngày sinh " + ngaySinh + "/" + thangSinh + "/" + namSinh + " thuộc " + mainSV.ktraCungHoangDao(ngaySinh, thangSinh));
                    }
                    break;
                }
                case 2: {
                    System.out.println("+-------------------Bài 2---------------------+");
                    System.out.println("Nhập 3 số nguyên: ");
                    System.out.println("Số thứ nhất: ");
                    int soThuNhat = sc.nextInt();
                    System.out.println("Nhập số thứ hai:");
                    int soThuHai = sc.nextInt();
                    System.out.println("Nhập số thứ ba:");
                    int soThuBa = sc.nextInt();
                    System.out.println(mainSV.ktraTamGiac(soThuNhat, soThuHai, soThuBa));
                    break;
                }
                case 3: {
                    System.out.println("+-------------------Bài 3---------------------+");
                    int n;
                    do {
                        System.out.println("Nhập n>0: ");
                        n = sc.nextInt();
                    } while (n <= 0);
                    System.out.println("Tổng các ước của " + n + ": " + mainSV.tongUoc(n));
                    break;
                }
                case 0: {
                    System.out.println("+-------------------Tạm biệt!---------------------+");
                    break;
                }
                default: {
                    System.out.println("Lựa chọn bạn nhập không tồn tại!");
                    break;
                }
            }
        } while (luaChon != 0);
    }

}
