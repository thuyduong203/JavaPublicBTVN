/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class MayTinh {

    private String maMay;
    private String kieuMay;
    private String trangThai;

    public MayTinh() {
    }

    public MayTinh(String maMay, String kieuMay, String trangThai) {
        this.maMay = maMay;
        this.kieuMay = kieuMay;
        this.trangThai = trangThai;
    }

    public String getMaMay() {
        return maMay;
    }

    public void setMaMay(String maMay) {
        this.maMay = maMay;
    }

    public String getKieuMay() {
        return kieuMay;
    }

    public void setKieuMay(String kieuMay) {
        this.kieuMay = kieuMay;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    public MayTinh inputMayTinh() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mã máy: ");
        String maMay = sc.nextLine();
        System.out.println("Nhập kiểu máy: ");
        String kieuMay = sc.nextLine();
        System.out.println("Nhập tình trạng: ");
        String tinhTrang = sc.nextLine();
        MayTinh mt = new MayTinh(maMay, kieuMay, tinhTrang);
        return mt;
    }

    public void thongTinMayTinh() {
        System.out.println("Mã máy: " + maMay);
        System.out.println("Kiểu máy: " + kieuMay);
        System.out.println("Tình trạng: " + trangThai);
    }
}
