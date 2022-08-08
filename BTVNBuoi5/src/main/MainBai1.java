/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import model.PhongMay;

/**
 *
 * @author Admin
 */
public class MainBai1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Nhập thông tin:");
        PhongMay pm = new PhongMay().inputPhongMay();
        System.out.println("                    Thông tin phòng máy:");
        pm.thongTinhPhongMay();
    }

}
