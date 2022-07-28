package service.impl;

import service.Service;

import java.util.Scanner;

public class ServiceImpl implements Service {

    @Override
    public void nhapMang(int[] mang) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < mang.length; i++) {
            System.out.println("Nhập phần tử thứ " + (i + 1) + ":");
            mang[i] = sc.nextInt();
        }
    }

    @Override
    public void xuatMang(int[] mang) {
        for (int i = 0; i < mang.length; i++) {
            System.out.println(mang[i]);
        }
    }

    @Override
    public int tongSoLe(int[] mang) {
        int tong = 0;
        for (int i = 1; i < mang.length; i += 2) {
            if (mang[i] % 2 != 0) {
                tong += mang[i];
            }
        }
        return tong;
    }

    @Override
    public int timMin(int[] mang) {
        int min = mang[0];
        for (int i = 0; i < mang.length; i++) {
            if (mang[i] < min) {
                min = mang[i];
            }
        }
        return min;
    }

    @Override
    public void vtriMinTrongMang(int[] mang) {
        int min = new ServiceImpl().timMin(mang);
        for (int i = 0; i < mang.length; i++) {
            if (mang[i] == min) {
                System.out.print((i + 1) + " ");
            }
        }
    }

    @Override
    public boolean ktraSoChinhPhuong(int a) {
        if (a <= 0) {
            return false;
        } else {
            for (int i = 1; i <= a; i++) {
                if (i * i == a) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public void hienThiSoChinhPhuong(int[] mang) {
        for (int i = 0; i < mang.length; i++) {
            if (new ServiceImpl().ktraSoChinhPhuong(mang[i])) {
                System.out.println(mang[i]);
            }
        }
    }

    @Override
    public boolean ktraSNT(int a) {
        int dem = 0;
        if (a < 2) {
            return false;
        } else {
            for (int i = 1; i < a; i++) {
                if (a % i == 0) {
                    dem++;
                }
            }
            if (dem > 1) {
                return false;
            } else {
                return true;
            }
        }
    }

    @Override
    public void hienThiSNT(int[] mang) {
        for (int i = 0; i < mang.length; i++) {
            if (new ServiceImpl().ktraSNT(mang[i])) {
                System.out.println(mang[i]);
            }
        }
    }

    @Override
    public void sapXepMang(int[] mang) {

        for (int i = 0; i < mang.length - 1; i++) {
            for (int j = i + 1; j < mang.length; j++) {
                int temp;
                if (mang[j] < mang[i]) {
                    temp = mang[i];
                    mang[i] = mang[j];
                    mang[j] = temp;
                }
            }
        }
    }

    @Override
    public String xoaSoTrongChuoi(String chuoi) {
        char[] mangChuoi = chuoi.toCharArray();
        for (int i = 0; i < mangChuoi.length; i++) {
            if (mangChuoi[i] >= '0' && mangChuoi[i] <= '9') {
                chuoi = chuoi.replaceAll(String.valueOf(mangChuoi[i]), "");
            }
        }
        return chuoi;
    }

    @Override
    public String vietHoaChuDau(String chuoi) {
        String temp = chuoi.toLowerCase();
        String chuoiNew = String.valueOf(temp.charAt(0)).toUpperCase() + temp.substring(1);
        return chuoiNew;
    }

    @Override
    public String vietHoaFullName(String chuoi) {
        String full = "";
        String[] mang = chuoi.split("\\s+");
        for (int i = 0; i < mang.length; i++) {
            full += new ServiceImpl().vietHoaChuDau(mang[i]);
            if (i < mang.length - 1) {
                full += " ";
            }
        }
        return full;
    }

    @Override
    public String xoaKhoangTrangThua(String chuoi) {
        String chuoiXoa2Dau = chuoi.trim();
        String chuoiKoConKhoangTrang = chuoiXoa2Dau.replaceAll("\\s+", " ");
        return chuoiKoConKhoangTrang;
    }

}
