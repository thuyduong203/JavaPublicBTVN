/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.Scanner;
import service.impl.Bai1ServiceImpl;

/**
 *
 * @author Admin
 */
public class CanBo {

    private static int index = 0;
    private int id;
    private String hoTen;
    private int namSinh;
    private String gioiTinh;
    private String diaChi;
    private Bai1ServiceImpl bai1Impl = new Bai1ServiceImpl();
    private ArrayList<CanBo> listCB = new ArrayList<>();

    public CanBo() {
        this.index++;
        this.id = index;
    }

    public CanBo(String hoTen, int namSinh, String gioiTinh, String diaChi) {
        this.id = index;
        this.hoTen = hoTen;
        this.namSinh = namSinh;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
    }

    public static int getIndex() {
        return index;
    }

    public static void setIndex(int index) {
        CanBo.index = index;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public Bai1ServiceImpl getBai1Impl() {
        return bai1Impl;
    }

    public void setBai1Impl(Bai1ServiceImpl bai1Impl) {
        this.bai1Impl = bai1Impl;
    }

    public ArrayList<CanBo> getListCB() {
        return listCB;
    }

    public void setListCB(ArrayList<CanBo> listCB) {
        this.listCB = listCB;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập họ tên: ");
        hoTen = sc.nextLine();
        System.out.println("Nhập năm sinh: ");
        namSinh = Integer.valueOf(sc.nextLine());
        System.out.println("Nhập giới tính: ");
        gioiTinh = sc.nextLine();
        System.out.println("Nhập địa chỉ: ");
        diaChi = sc.nextLine();
    }

    public void output() {
        System.out.println("ID: " + id);
        System.out.println("Họ tên: " + hoTen);
        System.out.println("Năm sinh: " + namSinh);
        System.out.println("Giới tính: " + gioiTinh);
        System.out.println("Địa chỉ: " + diaChi);
    }
}
