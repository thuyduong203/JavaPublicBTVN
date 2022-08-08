/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import jdbc.SQLServerConnection;
import model.LoaiSanPham;
import model.SanPham;

/**
 *
 * @author Admin
 */
public class LoaiSanPhamRepository {

    public List<LoaiSanPham> getALl() {
        String query = "SELECT id,ten_loai_san_pham FROM loai_san_pham";
        try ( Connection cnn = SQLServerConnection.getConnection();  PreparedStatement ps = cnn.prepareStatement(query)) {
            List<LoaiSanPham> listLoaiSP = new ArrayList<>();
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                listLoaiSP.add(new LoaiSanPham(rs.getInt(1), rs.getString(2)));
            }
            return listLoaiSP;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    public LoaiSanPham getOne(int id) {
        String query = "SELECT id,ten_loai_san_pham FROM loai_san_pham WHERE id = ?";
        try ( Connection cnn = SQLServerConnection.getConnection();  PreparedStatement ps = cnn.prepareStatement(query)) {
            ps.setObject(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return new LoaiSanPham(rs.getInt(1), rs.getString(2));
            }
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }
    
}
