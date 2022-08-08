/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Admin
 */
public class SanPham {

    private int id;
    private LoaiSanPham loaiSP;
    private String ten;
    private int soLuong;
    private int gia;

    public SanPham() {
    }

    public SanPham(int id, LoaiSanPham loaiSP, String ten, int soLuong, int gia) {
        this.id = id;
        this.loaiSP = loaiSP;
        this.ten = ten;
        this.soLuong = soLuong;
        this.gia = gia;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LoaiSanPham getLoaiSP() {
        return loaiSP;
    }

    public void setLoaiSP(LoaiSanPham loaiSP) {
        this.loaiSP = loaiSP;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    @Override
    public String toString() {
        return "SanPham{" + "id=" + id + ", loaiSP=" + loaiSP + ", ten=" + ten + ", soLuong=" + soLuong + ", gia=" + gia + '}';
    }

    public Object[] toDataRow() {
        return new Object[]{id, ten, gia, soLuong, loaiSP.getTenLoaiSP()};
    }
}
