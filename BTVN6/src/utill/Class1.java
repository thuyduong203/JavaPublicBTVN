/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utill;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Class1 {

    public int nhapId() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập id: ");
        int id = Integer.valueOf(sc.nextLine());
        return id;
    }

}
