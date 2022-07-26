package service;

public interface Service {
    void nhapMang(int[] mang);

    void xuatMang(int[] mang);

    int tongSoLe(int[] mang);

    int timMin(int[] mang);

    void vtriMinTrongMang(int[] mang);

    boolean ktraSoChinhPhuong(int a);

    void hienThiSoChinhPhuong(int[] mang);

    boolean ktraSNT(int a);

    void hienThiSNT(int[] mang);

    void sapXepMang(int[] mang);

    String xoaSoTrongChuoi(String chuoi);

    String vietHoaChuDau(String chuoi);

    String vietHoaFullName(String chuoi);

    String xoaKhoangTrangThua(String chuoi);
}
