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
public class Student {

    private String id;
    private String name;
    private int age;
    private Adress adress = new Adress();

    public Student() {
    }

    public Student(String id, String name, int age, Adress adress) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.adress = adress;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Adress getAdress() {
        return adress;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }

    public Student inputSt() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập ID: ");
        String idST = sc.nextLine();
        System.out.println("Nhập tên: ");
        String ten = sc.nextLine();
        System.out.println(" Nhập tuổi: ");
        int tuoi = Integer.valueOf(sc.nextLine());
        Adress diaChi = adress.inputAdress();
        Student student = new Student(idST, ten, tuoi, diaChi);
        return student;
    }

    public void thongTinStudent() {
        System.out.println("ID Sinh viên: " + id + " - Name: " + name + " - Age: " + age);
        System.out.print("Adress: ");
        adress.thongTinAdress();
    }
}
