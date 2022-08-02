/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.impl;

import java.util.Scanner;
import model.HinhChuNhat;
import service.Bai1Servivice;

/**
 *
 * @author Admin
 */
public class Bai1ServiceImpl implements Bai1Servivice {

    @Override
    public HinhChuNhat inputHCN() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chiều dài: ");
        int chieuDai = Integer.valueOf(sc.nextLine());
        System.out.println("Nhập chiều rộng: ");
        int chieuRong = Integer.valueOf(sc.nextLine());
        HinhChuNhat hcn = new HinhChuNhat(chieuDai, chieuRong);
        return hcn;
    }

}
