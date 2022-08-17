/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.impl;

import java.util.ArrayList;
import model.PhuongTien;
import service.Bai2Service;

/**
 *
 * @author Admin
 */
public class Bai2ServiceImpl implements Bai2Service {

    @Override
    public boolean checkList(ArrayList<PhuongTien> listPT) {
        boolean checkList = true;
        if (listPT.size() <= 0) {
            return checkList;
        } else {
            checkList = false;
            return checkList;
        }
    }

    @Override
    public void sortTangDan(ArrayList<PhuongTien> listPT) {
        listPT.sort((PhuongTien pt1, PhuongTien pt2) -> (int) (pt1.thue() - pt2.thue()));
    }

    @Override
    public void sortGiamDan(ArrayList<PhuongTien> listPT) {
        listPT.sort((PhuongTien pt1, PhuongTien pt2) -> (int) (pt2.thue() - pt1.thue()));
    }

    @Override
    public void xuatMang(ArrayList<PhuongTien> listPT) {
        System.out.printf("%15s%15s%15s%15s%15s\n", "Tên chủ xe", "Loại xe", "Dung tích", "Trị giá", "Thuế");
        for (PhuongTien phuongTien : listPT) {
            phuongTien.output();
        }
    }

}
