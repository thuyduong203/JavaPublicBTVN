/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.impl;

import com.sun.source.tree.EmptyStatementTree;
import java.util.Scanner;
import model.Employee;
import service.EployeeService;

/**
 *
 * @author Admin
 */
public class EmployeeServiceImpl implements EployeeService {

    @Override
    public Employee input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập ID: ");
        String id = sc.nextLine();
        System.out.println("Nhập tên:");
        String name = sc.nextLine();
        System.out.println("Nhập tuổi:");
        int tuoi = Integer.valueOf(sc.nextLine());
        System.out.println("Nhập số ngày:");
        int workingDay = Integer.valueOf(sc.nextLine());
        Employee empl = new Employee(id, name, tuoi, workingDay);
        return empl;
    }

}
