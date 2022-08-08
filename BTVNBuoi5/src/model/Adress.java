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
public class Adress {
//    Tạo class Address: id, district, province, viết các phương thức nhập, xuất.
//Tạo class Student: id, name, age, Address, viết các phương thức nhập, xuất.
//Các id không được trùng nhau.

    private String id;
    private String district;
    private String province;

    public Adress() {
    }

    public Adress(String id, String district, String province) {
        this.id = id;
        this.district = district;
        this.province = province;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public Adress inputAdress() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập Id Adress: ");
        String idAdress = sc.nextLine();
        System.out.println("Nhập quận:");
        String district = sc.nextLine();
        System.out.println("Nhập tỉnh: ");
        String province = sc.nextLine();
        Adress adress = new Adress(idAdress, district, province);
        return adress;
    }

    public void thongTinAdress() {
        System.out.println("ID: " + id + " - District: " + district + " - Province: " + province);
    }
}
