/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import model.Student;

/**
 *
 * @author Admin
 */
public interface StudentService {

    Student search(Student[] mangST, String id);

    int checkTrungID(Student[] mangST, String id, int phanTu);

    void changeProvince(Student[] mangST);

    void delete(Student[] mangST, String id);
}
