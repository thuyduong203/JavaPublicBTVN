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
public class QuanLy {

    private String maQL;
    private String tenQL;

    public QuanLy() {
    }

    public QuanLy(String maQL, String tenQL) {
        this.maQL = maQL;
        this.tenQL = tenQL;
    }

    public String getMaQL() {
        return maQL;
    }

    public void setMaQL(String maQL) {
        this.maQL = maQL;
    }

    public String getTenQL() {
        return tenQL;
    }

    public void setTenQL(String tenQL) {
        this.tenQL = tenQL;
    }

    public QuanLy inputQL() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mã QL: ");
        String maQL = sc.nextLine();
        System.out.println("Nhập tên QL:");
        String tenQL = sc.nextLine();
        QuanLy ql = new QuanLy(maQL, tenQL);
        return ql;
    }

    public void thongTinQuanLy() {
        System.out.println("Mã QL: " + maQL);
        System.out.println("Tên QL: " + tenQL);
    }
}
