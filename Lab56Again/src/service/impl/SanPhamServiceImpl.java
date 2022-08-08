/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.impl;

import java.util.List;
import model.SanPham;
import repository.SanPhamRepository;
import service.SanPhamService;

/**
 *
 * @author Admin
 */
public class SanPhamServiceImpl implements SanPhamService {

    @Override
    public List<SanPham> getAll() {
        return new SanPhamRepository().getAll();
    }

}
