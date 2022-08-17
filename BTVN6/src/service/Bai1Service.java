/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import java.util.ArrayList;
import model.CanBo;

/**
 *
 * @author Admin
 */
public interface Bai1Service {

    int checkTrungId(ArrayList<CanBo> listCB, int id);

    boolean remove(ArrayList<CanBo> listCB, int id);

    void searchById(ArrayList<CanBo> listCB, int id);

    boolean checkList(ArrayList<CanBo> listCB);
}
