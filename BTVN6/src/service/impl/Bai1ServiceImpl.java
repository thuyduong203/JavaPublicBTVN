/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.impl;

import java.util.ArrayList;
import java.util.Scanner;
import model.CanBo;
import service.Bai1Service;
import utill.Class1;

/**
 *
 * @author Admin
 */
public class Bai1ServiceImpl implements Bai1Service {

    private Class1 class1 = new Class1();

    @Override
    public boolean remove(ArrayList<CanBo> listCB, int id) {
        boolean isRemove = false;
        int index = checkTrungId(listCB, id);
        if (index < 0) {
            System.out.println("Không tìm thấy!");
        } else {
            listCB.remove(index);
            isRemove = true;
        }
        return isRemove;
    }

    @Override
    public void searchById(ArrayList<CanBo> listCB, int id) {
        int index = checkTrungId(listCB, id);
        if (index < 0) {
            System.out.println("Không tìm thấy!");
        } else {
            System.out.println("Thông tin cán bộ có id " + id);
            listCB.get(index).output();
        }
    }

    @Override
    public int checkTrungId(ArrayList<CanBo> listCB, int id) {
        int index = -1;
        for (int i = 0; i < listCB.size(); i++) {
            if (listCB.get(i).getId() == id) {
                index = i;
            }
        }
        return index;
    }

    @Override
    public boolean checkList(ArrayList<CanBo> listCB) {
        boolean checkList = true;
        if (listCB.size() <= 0) {
            return checkList;
        } else {
            checkList = false;
            return checkList;
        }
    }

}
