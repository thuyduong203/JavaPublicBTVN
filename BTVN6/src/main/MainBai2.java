/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.util.ArrayList;
import java.util.Scanner;
import model.PhuongTien;
import service.impl.Bai2ServiceImpl;

/**
 *
 * @author Admin
 */
public class MainBai2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char luaChon;
        ArrayList<PhuongTien> listPT = new ArrayList<>();
        Bai2ServiceImpl bai2Impl = new Bai2ServiceImpl();
        do {
            System.out.println("+------------------------Menu----------------------+");
            System.out.println("    a.Nhập thông tin");
            System.out.println("    b.Xuất dsach xe");
            System.out.println("    c.Xuất dsach xe theo tiền thuế tăng dần");
            System.out.println("    d.Xuất dsach xe theo tiền thuế giảm dần");
            System.out.println("    e.Thoát");
            System.out.println("+---------------------------------------------------+");
            System.out.println("Mời chọn: ");
            luaChon = sc.next().charAt(0);
            switch (luaChon) {
                case 'a': {
                    PhuongTien pt = new PhuongTien();
                    pt.input();
                    listPT.add(pt);
                    break;
                }
                case 'b': {
                    if (bai2Impl.checkList(listPT)) {
                        System.out.println("Chưa có xe nào!");
                    } else {
                        bai2Impl.xuatMang(listPT);
                    }
                    break;
                }
                case 'c': {
                    if (bai2Impl.checkList(listPT)) {
                        System.out.println("Chưa có xe nào!");
                    } else {
                        bai2Impl.sortTangDan(listPT);
                        bai2Impl.xuatMang(listPT);
                    }
                    break;
                }
                case 'd': {
                    if (bai2Impl.checkList(listPT)) {
                        System.out.println("Chưa có xe nào!");
                    } else {
                        bai2Impl.sortGiamDan(listPT);
                        bai2Impl.xuatMang(listPT);
                    }
                    break;
                }
                case 'e': {
                    System.out.println("Tạm biệt!");
                    break;
                }
                default: {
                    System.out.println("Lựa chọn không tồn tại!");
                    break;
                }
            }
        } while (luaChon != 'e');
    }
}
