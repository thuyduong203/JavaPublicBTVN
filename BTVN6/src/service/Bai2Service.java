/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import java.util.ArrayList;
import model.PhuongTien;

/**
 *
 * @author Admin
 */
public interface Bai2Service {

    boolean checkList(ArrayList<PhuongTien> listPT);

    void sortTangDan(ArrayList<PhuongTien> listPT);

    void sortGiamDan(ArrayList<PhuongTien> listPT);

    void xuatMang(ArrayList<PhuongTien> listPT);
}
