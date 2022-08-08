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
public class PhongMay {

    private String maPhong;
    private String tenPhong;
    private double dienTich;
    private QuanLy quanLy = new QuanLy();
    private MayTinh mayTinh = new MayTinh();

    public PhongMay() {
    }

    public PhongMay(String maPhong, String tenPhong, double dienTich, QuanLy quanLy, MayTinh mayTinh) {
        this.maPhong = maPhong;
        this.tenPhong = tenPhong;
        this.dienTich = dienTich;
        this.quanLy = quanLy;
        this.mayTinh = mayTinh;
    }

    public String getMaPhong() {
        return maPhong;
    }

    public void setMaPhong(String maPhong) {
        this.maPhong = maPhong;
    }

    public String getTenPhong() {
        return tenPhong;
    }

    public void setTenPhong(String tenPhong) {
        this.tenPhong = tenPhong;
    }

    public double getDienTich() {
        return dienTich;
    }

    public void setDienTich(double dienTich) {
        this.dienTich = dienTich;
    }

    public QuanLy getQuanLy() {
        return quanLy;
    }

    public void setQuanLy(QuanLy quanLy) {
        this.quanLy = quanLy;
    }

    public MayTinh getMayTinh() {
        return mayTinh;
    }

    public void setMayTinh(MayTinh mayTinh) {
        this.mayTinh = mayTinh;
    }

    public PhongMay inputPhongMay() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mã phòng: ");
        String maPhong = sc.nextLine();
        System.out.println("Nhập tên phòng:");
        String tenPhong = sc.nextLine();
        System.out.println("Nhập diện tích: ");
        double dienTich = Double.valueOf(sc.nextLine());
        QuanLy ql = quanLy.inputQL();
        MayTinh mt = mayTinh.inputMayTinh();
        PhongMay pm = new PhongMay(maPhong, tenPhong, dienTich, ql, mt);
        return pm;
    }

    public void thongTinhPhongMay() {
        System.out.println("Mã phòng: " + maPhong);
        System.out.println("Tên phòng: " + tenPhong);
        System.out.println("Diện tích: " + dienTich);
        quanLy.thongTinQuanLy();
        mayTinh.thongTinMayTinh();
    }
}
