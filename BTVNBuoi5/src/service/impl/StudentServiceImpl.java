/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.impl;

import model.Adress;
import model.Student;
import service.StudentService;

/**
 *
 * @author Admin
 */
public class StudentServiceImpl implements StudentService {

    @Override
    public Student search(Student[] mangST, String id) {
        for (Student student : mangST) {
            if (student.getId().equals(id)) {
                return student;
            }
        }
        return null;
    }

    @Override
    public int checkTrungID(Student[] mangST, String id, int phanTu) {
        int check = 0;
        for (int i = 0; i <= phanTu; i++) {
            if (mangST[i].getId().isEmpty()) {
                check = 2;
                return check;
            }
            if (mangST[i].getId().equals(id) || mangST[i].getId().isEmpty()) {
                check++;
            }
        }
        return check;
    }

    @Override
    public void changeProvince(Student[] mangST) {
        for (Student st : mangST) {
            if (st.getAdress().getProvince().equalsIgnoreCase("Thanh Hóa")) {
                Adress adr = st.getAdress();
                adr.setProvince("Hải Phòng");
            }
        }
    }

    @Override
    public void delete(Student[] mangST, String id) {
        int sz = mangST.length;
        if (search(mangST, id) == null) {
            System.out.println("Ko tìm thấy sinh viên có id " + id);
        } else {
            for (int i = 0; i < sz; i++) {
                if (mangST[i].getId().equals(id)) {
                    mangST[i] = mangST[i + 1];
                }
                sz--;
            }
        }
    }

}
