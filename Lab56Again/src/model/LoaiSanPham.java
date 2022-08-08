/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Admin
 */
public class LoaiSanPham {

    private int id;
    private String tenLoaiSP;

    public LoaiSanPham() {
    }

    public LoaiSanPham(int id, String tenLoaiSP) {
        this.id = id;
        this.tenLoaiSP = tenLoaiSP;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenLoaiSP() {
        return tenLoaiSP;
    }

    public void setTenLoaiSP(String tenLoaiSP) {
        this.tenLoaiSP = tenLoaiSP;
    }

    public LoaiSanPham(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "LoaiSanPham{" + "id=" + id + ", tenLoaiSP=" + tenLoaiSP + '}';
    }

}
