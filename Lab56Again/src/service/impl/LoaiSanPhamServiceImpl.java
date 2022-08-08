/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.impl;

import java.util.List;
import model.LoaiSanPham;
import repository.LoaiSanPhamRepository;
import service.LoaiSanPhamService;

/**
 *
 * @author Admin
 */
public class LoaiSanPhamServiceImpl implements LoaiSanPhamService {

    @Override
    public List<LoaiSanPham> getALl() {
        return new LoaiSanPhamRepository().getALl();
    }

    @Override
    public LoaiSanPham getOne(int id) {
        return new LoaiSanPhamRepository().getOne(id);
    }

}
