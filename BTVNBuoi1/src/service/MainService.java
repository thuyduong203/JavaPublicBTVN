/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

/**
 *
 * @author Admin
 */
public interface MainService {

    boolean checkNgayThang(int ngay, int thang, int nam);

    String ktraCungHoangDao(int ngay, int thang);

    String ktraTamGiac(int a, int b, int c);

    int tongUoc(int n);

}
