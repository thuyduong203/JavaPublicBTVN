/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.util.ArrayList;
import java.util.Scanner;
import model.CanBo;
import model.CongNhan;
import model.KySu;
import model.NhanVien;
import service.impl.Bai1ServiceImpl;
import utill.Class1;

/**
 *
 * @author Admin
 */
public class QLCB {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<CanBo> listCB = new ArrayList<>();
        Class1 class1Utill = new Class1();
        Bai1ServiceImpl bai1Impl = new Bai1ServiceImpl();
        int luaChon;
        do {
            System.out.println("+----------------Menu----------------+");
            System.out.println("    1.Nhập thông tin CB");
            System.out.println("    2.Xuất dsach CB");
            System.out.println("    3.Xóa CB theo Id");
            System.out.println("    4.Tìm kiếm CB theo Id");
            System.out.println("    5.Thoát");
            System.out.println("+------------------------------------+");
            System.out.println("Mời nhập lựa chọn: ");
            luaChon = Integer.valueOf(sc.nextLine());
            switch (luaChon) {
                case 1: {
                    int chonNhap;
                    do {
                        System.out.println("Nhập thông tin: ");
                        System.out.println("1.Nhân viên");
                        System.out.println("2.Công nhân");
                        System.out.println("3.Kỹ sư");
                        System.out.println("4.Cán Bộ");
                        System.out.println("0.Thoát nhập");
                        chonNhap = Integer.valueOf(sc.nextLine());
                        switch (chonNhap) {
                            case 1: {
                                System.out.println("Nhập thông tin nhân viên:");
                                NhanVien nv = new NhanVien();
                                nv.input();
                                listCB.add(nv);
                                break;
                            }
                            case 2: {
                                System.out.println("Nhập thông tin Công nhân");
                                CongNhan cn = new CongNhan();
                                cn.input();
                                listCB.add(cn);
                                break;
                            }
                            case 3: {
                                System.out.println("Nhập thông tin kỹ sư:");
                                KySu ks = new KySu();
                                ks.input();
                                listCB.add(ks);
                                break;
                            }
                            case 4: {
                                System.out.println("Nhập thông tin cán bộ:");
                                CanBo cb = new CanBo();
                                cb.input();
                                listCB.add(cb);
                            }
                            case 0: {
                                break;
                            }
                            default: {
                                System.out.println("??????");
                                break;
                            }
                        }
                    } while (chonNhap != 0);
                    break;
                }
                case 2: {
                    if (bai1Impl.checkList(listCB)) {
                        System.out.println("Chưa có cán bộ nào?");
                    } else {
                        System.out.println("+--------------List CB----------------+");
                        for (CanBo canBo : listCB) {
                            canBo.output();
                        }
                    }
                    break;
                }
                case 3: {
                    if (bai1Impl.checkList(listCB)) {
                        System.out.println("Chưa có cán bộ nào?");
                    } else {
                        System.out.println("Xóa Cb:");
                        int id = class1Utill.nhapId();
                        boolean isRemove = bai1Impl.remove(listCB, id);
                        if (isRemove) {
                            System.out.println("Đã xóa!");
                            System.out.println("+---------------List CB----------------+");
                            for (CanBo canBo : listCB) {
                                canBo.output();
                            }
                        } else {
                            System.out.println("Không xóa được!");
                        }
                    }
                    break;
                }
                case 4: {
                    if (bai1Impl.checkList(listCB)) {
                        System.out.println("Chưa có cán bộ nào?");
                    } else {
                        System.out.println("Tìm kiếm:");
                        int id = class1Utill.nhapId();
                        bai1Impl.searchById(listCB, id);
                    }
                    break;
                }
                case 5: {
                    System.out.println("Tạm biệt!");
                    break;
                }
                default: {
                    System.out.println("????");
                    break;
                }
            }
        } while (luaChon != 5);
    }
}
