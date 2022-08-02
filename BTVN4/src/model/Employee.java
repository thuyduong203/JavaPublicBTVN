/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Admin
 */
public class Employee {

    private String id;
    private String name;
    private int tuoi;
    private int workingDay;
    private double salary;
    public static final int PRICE = 50;

    public Employee() {
    }

    public Employee(String id, String name, int tuoi, int workingDay) {
        this.id = id;
        this.name = name;
        this.tuoi = tuoi;
        this.workingDay = workingDay;
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

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public int getWorkingDay() {
        return workingDay;
    }

    public void setWorkingDay(int workingDay) {
        this.workingDay = workingDay;
    }

    public double salary(int workingDay) {
        return workingDay * PRICE;
    }

    public void output() {
        System.out.println("ID: " + id);
        System.out.println("Tên: " + name);
        System.out.println("Tuổi: " + tuoi);
        System.out.println("Số ngày công: " + workingDay);
        System.out.println("Lương: " + salary(workingDay));
    }
}
