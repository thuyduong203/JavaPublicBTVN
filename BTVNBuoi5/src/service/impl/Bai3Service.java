/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.impl;

import main.*;

/**
 *
 * @author Admin
 */
public class Bai3Service {

    public boolean isPrime(int a) {
        boolean checkPrime = false;
        int dem = 0;
        if (a < 2) {
            checkPrime = false;
        } else {
            for (int i = 1; i <= a; i++) {
                if (a % i == 0) {
                    dem++;
                }
            }
            if (dem <= 2) {
                checkPrime = true;
            }
        }
        return checkPrime;
    }

    public boolean isPrime(long a) {
        return false;
    }

    public boolean isPrime(float a) {
        return false;
    }

    public boolean isPrime(double a) {
        return false;
    }
}
