/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.util.ArrayList;
import java.util.Scanner;
import model.Student;
import service.impl.StudentServiceImpl;

/**
 *
 * @author Admin
 */
public class MainBai2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentServiceImpl stImpl = new StudentServiceImpl();
        System.out.println("Nhập số phần tử của mảng sinh viên:");
        int n = Integer.valueOf(sc.nextLine());
        Student[] mangStudent = new Student[n];
        int luaChon;
        do {
            System.out.println("+-------------Menu-----------------+");
            System.out.println("    1.Nhập mảng SV");
            System.out.println("    2.Xuất mảng SV");
            System.out.println("    3.Tìm kiếm sinh viên theo Id và hiển thị ra màn hình");
            System.out.println("    4.Sửa các sinh viên có province là “Thanh Hóa” thành “Hải Phòng”");
            System.out.println("    5.Xóa sinh viên theo Id");
            System.out.println("    0.Thoát");
            System.out.println("+----------------------------------+");
            System.out.println("Mời nhập lựa chon: ");
            luaChon = Integer.valueOf(sc.nextLine());
            switch (luaChon) {
                case 1: {
                    Student st = new Student();
                    for (int i = 0; i < n; i++) {
                        int check;
                        do {
                            mangStudent[i] = st.inputSt();
                            check = stImpl.checkTrungID(mangStudent, mangStudent[i].getId(), i);
                            if (check > 1) {
                                System.out.println("Nhập lại!_ID không được trùng hoặc đang bị bỏ trống!");
                            }
                        } while (check > 1);
                    }
                    break;
                }
                case 2: {
                    for (Student student : mangStudent) {
                        if (mangStudent[0] == null) {
                            System.out.println("Bạn chưa nhập sinh viên nào!");
                            break;
                        } else {
                            student.thongTinStudent();
                        }
                    }
                    break;
                }
                case 3: {
                    if (mangStudent[0] == null) {
                        System.out.println(" Bạn chưa nhập sinh viên nào!");
                        break;
                    }
                    System.out.println("Nhập đầy đủ ID cần tìm: ");
                    String idSearch = sc.nextLine();
                    if (stImpl.search(mangStudent, idSearch) != null) {
                        Student st = stImpl.search(mangStudent, idSearch);
                        st.thongTinStudent();
                    } else {
                        System.out.println("Không tìm thấy!");

                    }
                    break;
                }
                case 4: {
                    if (mangStudent[0] == null) {
                        System.out.println(" Bạn chưa nhập sinh viên nào!");
                        break;
                    }
                    stImpl.changeProvince(mangStudent);
                    for (Student student : mangStudent) {
                        student.thongTinStudent();
                    }
                    break;
                }
                case 5: {
                    if (mangStudent[0] == null) {
                        System.out.println(" Bạn chưa nhập sinh viên nào!");
                        break;
                    }
                    ArrayList<Student> listST = new ArrayList<>();
                    for (Student student : mangStudent) {
                        listST.add(student);
                    }
                    System.out.println("Nhập ID cần xóa:");
                    String id = sc.nextLine();
                    for (int i = 0; i < listST.size(); i++) {
                        if (listST.get(i).getId().equals(id)) {
                            listST.remove(i);

                            for (Student student : listST) {
                                for (int j = 0; j < n; j++) {
                                    mangStudent[j] = student;
                                }
                            }
                        }
                    }
                    System.out.println("        Sau khi xóa:");
                    for (Student student : listST) {
                        student.thongTinStudent();
                    }
//                    int temp;
//                    int i;
//                    for (temp = i = 0; i < mangStudent.length; i++) {
//                        if (mangStudent[i].getId().equals(id) == false) {
//                            mangStudent[temp] = mangStudent[i];
//                            temp++;
//                        }
//                    }
//                    n = temp;
////                    stImpl.delete(mangStudent, id);
//                    for (Student student : mangStudent) {
//                        student.thongTinStudent();
//                    }
                    break;
                }
                case 0: {
                    System.out.println(" fix mảng thế này có hèn quá ko ạ@_@");
                    break;
                }
                default: {
                    System.out.println("Lựa chọn ko tồn tại!");
                    break;
                }
            }
        } while (luaChon != 0);
    }
}
