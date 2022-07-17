/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.impl;

import service.MainService;

/**
 *
 * @author Admin
 */
public class MainServiceImpl implements MainService {

    @Override
    public String ktraCungHoangDao(int ngay, int thang) {
        String cungHoangDao = "";
        if ((ngay >= 20 && thang == 1) || (ngay <= 18 && thang == 2)) {
            cungHoangDao = "Cung Bảo Bình";
        } else if ((ngay >= 19 && thang == 2) || (ngay <= 20 && thang == 3)) {
            cungHoangDao = "Cung Song Ngư";
        } else if ((ngay >= 21 && thang == 3) || (ngay <= 20 && thang == 4)) {
            cungHoangDao = "Cung Bạch Dương";
        } else if ((ngay >= 21 && thang == 4) || (ngay <= 20 && thang == 5)) {
            cungHoangDao = "Cung Kim Ngưu";
        } else if ((ngay >= 21 && thang == 5) || (ngay <= 21 && thang == 6)) {
            cungHoangDao = "Cung Song Tử";
        } else if ((ngay >= 22 && thang == 6) || (ngay <= 22 && thang == 7)) {
            cungHoangDao = "Cung Cự Giải";
        } else if ((ngay >= 23 && thang == 7) || (ngay <= 22 && thang == 8)) {
            cungHoangDao = "Cung Sư Tử";
        } else if ((ngay >= 23 && thang == 8) || (ngay <= 22 && thang == 9)) {
            cungHoangDao = "Cung Xử Nữ";
        } else if ((ngay >= 23 && thang == 9) || (ngay <= 23 && thang == 10)) {
            cungHoangDao = "Cung Thiên Bình";
        } else if ((ngay >= 24 && thang == 10) || (ngay <= 22 && thang == 11)) {
            cungHoangDao = "Cung Bọ Cạp";
        } else if ((ngay >= 23 && thang == 11) || (ngay <= 21 && thang == 12)) {
            cungHoangDao = "Cung Nhân Mã";
        } else {
            cungHoangDao = "Cung Ma Kết";
        }
        return cungHoangDao;
    }

    @Override
    public String ktraTamGiac(int a, int b, int c) {
        String result = "";
        if (a + b > c && b + c > a && a + c > b) {
            if ((a == b && a != c) || (a == c && a != b) || (c == b && a != c)) {
                if (((a * a + b * b) == c * c) || ((a * a + c * c) == b * b) || ((b * b + c * c) == a * a)) {
                    result = "3 kích thước bạn vừa nhập là các cạnh của tam giác vuông cân!";
                } else {
                    result = "3 kích thước bạn vừa nhập là các cạnh của tam giác cân!";
                }
            } else if (a == b && b == c) {
                result = "3 kích thước bạn vừa nhập là các cạnh của tam giác đều!";
            } else if (((a * a + b * b) == c * c) || ((a * a + c * c) == b * b) || ((b * b + c * c) == a * a)) {
                result = "3 kích thước bạn vừa nhập là các cạnh của tam giác vuông!";
            } else {
                result = "3 kích thước bạn vừa nhập là các cạnh của tam giác thường!";
            }
        } else {
            result = "3 kích thước bạn vừa nhập không là các cạnh của 1 tam giác!";
        }
        return result;
    }

    @Override
    public int tongUoc(int n) {
        int tongUoc = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                tongUoc += i;
            }
        }
        return tongUoc;
    }

    @Override
    public boolean checkNgayThang(int ngaySinh, int thangSinh, int namSinh) {
        boolean check = false;
        if (ngaySinh <= 0 || ngaySinh > 31) {
            System.out.println("Ngày không hợp lệ!");
        } else if (thangSinh <= 0 || thangSinh > 12) {
            System.out.println("Tháng không hợp lệ!");
        } else if (namSinh <= 0) {
            System.out.println("Năm sinh không hợp lệ!");
        } else if (thangSinh == 2 && ngaySinh > 29) {
            System.out.println("Ngày tháng không hợp lệ!");
        } else {
            check = true;
        }
        return check;
    }

}
