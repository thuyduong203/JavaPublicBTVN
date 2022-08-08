/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import java.util.List;
import model.SanPham;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import jdbc.SQLServerConnection;
import model.LoaiSanPham;

/**
 *
 * @author Admin
 */
public class SanPhamRepository {

    public List<SanPham> getAll() {
        String query = "SELECT id, loai_san_pham_id,ten,so_luong,gia FROM san_pham";
        try ( Connection cnn = SQLServerConnection.getConnection();  PreparedStatement ps = cnn.prepareStatement(query)) {
            List<SanPham> listSP = new ArrayList<>();
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                LoaiSanPham loaiSP = new LoaiSanPhamRepository().getOne(rs.getInt(2));
                listSP.add(new SanPham(rs.getInt(1), loaiSP, rs.getString(3), rs.getInt(4), rs.getInt(5)));
            }
            return listSP;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    public boolean add(SanPham sp) {
        int check = 0;
        String query = "INSERT INTO [dbo].[san_pham]\n"
                + "           ([loai_san_pham_id]\n"
                + "           ,[ten]\n"
                + "           ,[so_luong]\n"
                + "           ,[gia])\n"
                + "     VALUES\n"
                + "           (?\n"
                + "           ,?\n"
                + "           ,?\n"
                + "           ,?)";
        try ( Connection cnn = SQLServerConnection.getConnection();  PreparedStatement ps = cnn.prepareStatement(query)) {
            ps.setObject(1, sp.getLoaiSP().getId());
            ps.setObject(2, sp.getTen());
            ps.setObject(3, sp.getSoLuong());
            ps.setObject(4, sp.getGia());
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
    }

    public static void main(String[] args) {
        LoaiSanPham loaiSP = new LoaiSanPham(1);
        SanPham sp = new SanPham(0, loaiSP, "adfg", 2, 4);
        System.out.println(new SanPhamRepository().add(sp));
    }
}
