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
public class CongNhan extends CanBo {

    private int bac;

    public CongNhan() {
    }

    public CongNhan(int bac) {
        this.bac = bac;
    }

    public CongNhan(int bac, String hoTen, int namSinh, String gioiTinh, String diaChi) {
        super(hoTen, namSinh, gioiTinh, diaChi);
        this.bac = bac;
    }

    public int getBac() {
        return bac;
    }

    public void setBac(int bac) {
        this.bac = bac;
    }

    @Override
    public void output() {
        super.output();
        System.out.println("Bậc: " + bac + "/7");
    }

    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        super.input();
        do {
            System.out.println("Nhập bậc (3-7): ");
            bac = Integer.valueOf(sc.nextLine());
        } while (bac < 3 || bac > 7);

    }

}
