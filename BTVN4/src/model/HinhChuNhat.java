/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Admin
 */
public class HinhChuNhat {

    private int chieuDai;
    private int chieuRong;

    public HinhChuNhat() {
    }

    public HinhChuNhat(int chieuDai, int chieuRong) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    public int getChieuDai() {
        return chieuDai;
    }

    public void setChieuDai(int chieuDai) {
        this.chieuDai = chieuDai;
    }

    public int getChieuRong() {
        return chieuRong;
    }

    public void setChieuRong(int chieuRong) {
        this.chieuRong = chieuRong;
    }

    public int chuVi(int chieuDai, int chieuRong) {
        return (chieuDai + chieuRong) * 2;
    }

    public int dienTich(int chieuDai, int chieuRong) {
        return chieuDai * chieuRong;
    }
    public void xuatThongTin(){
        System.out.println("Chiều dài: "+chieuDai);
        System.out.println("Chiều rộng: "+chieuRong);
        System.out.println("Chu vi: "+chuVi(chieuDai, chieuRong));
        System.out.println("Diện tích: "+dienTich(chieuDai, chieuRong));
    }
}
