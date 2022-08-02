/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Admin
 */
public class NhanVien {

    private static int index = 0;
    private int maNV;
    private String tenNV;
    private int tuoi;
    private String diaChi;
    private String boPhan;

    public NhanVien() {
    }

    public NhanVien(String tenNV, int tuoi, String diaChi, String boPhan) {
        this.index++;
        this.maNV = index;
        this.tenNV = tenNV;
        this.tuoi = tuoi;
        this.diaChi = diaChi;
        this.boPhan = boPhan;
    }

    public static int getIndex() {
        return index;
    }

    public static void setIndex(int index) {
        NhanVien.index = index;
    }

    public int getMaNV() {
        return maNV;
    }

    public void setMaNV(int maNV) {
        this.maNV = maNV;
    }

    public String getTenNV() {
        return tenNV;
    }

    public void setTenNV(String tenNV) {
        this.tenNV = tenNV;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getBoPhan() {
        return boPhan;
    }

    public void setBoPhan(String boPhan) {
        this.boPhan = boPhan;
    }

    public void inThongTin() {
        System.out.printf("%-16d%-15s%-6d%-16s%-10s\n", maNV, tenNV, tuoi, diaChi, boPhan);
    }
}
