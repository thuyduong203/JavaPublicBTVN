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
public class PhuongTien {

    private String tenChuXe;
    private String loaiXe;
    private int dungTich;
    private double triGia;

    public PhuongTien() {
    }

    public PhuongTien(String tenChuXe, String loaiXe, int dungTich, double triGia) {
        this.tenChuXe = tenChuXe;
        this.loaiXe = loaiXe;
        this.dungTich = dungTich;
        this.triGia = triGia;
    }

    public String getTenChuXe() {
        return tenChuXe;
    }

    public void setTenChuXe(String tenChuXe) {
        this.tenChuXe = tenChuXe;
    }

    public String getLoaiXe() {
        return loaiXe;
    }

    public void setLoaiXe(String loaiXe) {
        this.loaiXe = loaiXe;
    }

    public int getDungTich() {
        return dungTich;
    }

    public void setDungTich(int dungTich) {
        this.dungTich = dungTich;
    }

    public double getTriGia() {
        return triGia;
    }

    public void setTriGia(double triGia) {
        this.triGia = triGia;
    }

    public double thue() {
        double thueTruocBa = 0;
        if (dungTich < 100) {
            thueTruocBa = triGia * (0.02);
        } else if (dungTich >= 100 && dungTich <= 200) {
            thueTruocBa = triGia * (0.06);
        } else {
            thueTruocBa = triGia * (0.1);
        }
        return thueTruocBa;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên chủ xe: ");
        tenChuXe = sc.nextLine();
        System.out.println("Nhập loại xe: ");
        loaiXe = sc.nextLine();
        do {
            System.out.println("Nhập dung tích: ");
            dungTich = Integer.valueOf(sc.nextLine());
        } while (dungTich <= 0);
        do {
            System.out.println("Nhập trị giá: ");
            triGia = Double.valueOf(sc.nextLine());
        } while (triGia <= 0);
    }

    public void output() {
        System.out.format("%15s%15s%15d%15f%15f\n", tenChuXe, loaiXe, dungTich, triGia, thue());
    }
}
