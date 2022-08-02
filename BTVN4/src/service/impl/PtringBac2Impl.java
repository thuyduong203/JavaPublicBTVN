/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.impl;

import java.util.Scanner;
import model.PhuongTrinhBac2;
import service.PtrinhB2Service;

/**
 *
 * @author Admin
 */
public class PtringBac2Impl implements PtrinhB2Service {

    @Override
    public PhuongTrinhBac2 inputPtBac2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập a: ");
        double a = Integer.valueOf(sc.nextLine());
        System.out.println("Nhập b: ");
        double b = Integer.valueOf(sc.nextLine());
        System.out.println("Nhập c: ");
        double c = Integer.valueOf(sc.nextLine());
        PhuongTrinhBac2 ptb2 = new PhuongTrinhBac2(a, b, c);
        return ptb2;
    }

    @Override
    public void outputPtb2(PhuongTrinhBac2 ptb2) {
        System.out.println("Phương trình b2: ");
        System.out.println(ptb2.getA() + "x2" + ptb2.getB() + "x" + ptb2.getC());
    }

    @Override
    public void giaiPTB2(PhuongTrinhBac2 ptb2) {
        double a = ptb2.getA();
        double b = ptb2.getB();
        double c = ptb2.getC();
        if (a == 0) {
            //bx+c=0:
            if (b == 0 && c == 0) {
                System.out.println("Phương trình có vô số nghiệm");
            } else if (b == 0 && c != 0) {
                System.out.println("Phương trình vô nghiệm");
            } else {
                System.out.println("Phương trình có nghiệm x = " + (-c / b));
            }
        } else {
            double delta = 0;
            delta = (b * b) - (4 * a * c);
            if (delta < 0) {
                System.out.println("Phương trình vô nghiệm");
            } else if (delta == 0) {
                System.out.println("Phương trình có nghiệm kép: ");
                double x = 0;
                x = (-(b) / (2 * a));
                System.out.println("x = " + x);
            } else {
                System.out.println("Phương trình có 2 nghiệm phân biệt:");
                double x1 = 0;
                double x2 = 0;
                double canDelta = Math.sqrt(delta);
                x1 = ((-b) + canDelta) / (2 * a);
                x2 = ((-b) - canDelta) / (2 * a);
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            }
        }
    }

}
