/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO_QLSP;

import Model_QLSP.Sanpham;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author pc
 */
public class SanphamDAO {

    public List<Sanpham> getAllSanPham() {
        List<Sanpham> sanpham = new ArrayList<Sanpham>();

        Connection connection = Connect.getJDBCConection();
        String sql = "select * from san_pham";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                Sanpham sv = new Sanpham();
                sv.setIDSP(rs.getInt("ma_san_pham"));
                sv.setIDLoai(rs.getInt("ma_loai"));
                sv.setTenSP(rs.getString("ten_san_pham"));
                sv.setGia(rs.getInt("gia"));
                sv.setAnh(rs.getString("Hinhanh"));
                sv.setMota(rs.getString("Mo_ta"));
                sanpham.add(sv);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sanpham;
    }

    public Sanpham getSPById(int IDSP) {

        Connection connection = Connect.getJDBCConection();
        String sql = "select * from san_pham where ma_san_pham = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, IDSP);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                Sanpham sv = new Sanpham();
                sv.setIDSP(rs.getInt("ma_san_pham"));
                sv.setIDLoai(rs.getInt("ma_loai"));
                sv.setTenSP(rs.getString("ten_san_pham"));
                sv.setGia(rs.getInt("gia"));
                sv.setAnh(rs.getString("Hinhanh"));
                sv.setMota(rs.getString("Mo_ta"));

                return sv;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public void addSP(Sanpham sanpham) {
        Connection connection = Connect.getJDBCConection();
        String sql = " INSERT INTO san_pham( ma_san_pham, ma_loai, ten_san_pham, gia, Hinhanh,Mo_ta)"
                + " VALUE(?,?,?,?,?,?) ";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, sanpham.getIDSP());
            preparedStatement.setInt(2, sanpham.getIDLoai());
            preparedStatement.setString(3, sanpham.getTenSP());
            preparedStatement.setInt(4, sanpham.getGia());
            preparedStatement.setString(5, sanpham.getAnh());
            preparedStatement.setString(6, sanpham.getMota());
            int rs = preparedStatement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void updateSP(Sanpham sanpham) {
        Connection connection = Connect.getJDBCConection();
        String sql = "Update san_pham set ma_loai = ? , ten_san_pham = ? , "
                + " gia = ?, Mo_ta = ? where ma_san_pham = ? ";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, sanpham.getIDLoai());
            preparedStatement.setString(2, sanpham.getTenSP());
            preparedStatement.setInt(3, sanpham.getGia());
            preparedStatement.setString(4, sanpham.getMota());
            preparedStatement.setString(5, sanpham.getAnh());
            preparedStatement.setInt(6, sanpham.getIDSP());
            int rs = preparedStatement.executeUpdate();
            System.out.println(rs);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deleteSP(String IDSP) {
        Connection connection = Connect.getJDBCConection();
        String sql = "delete from san_pham where ma_san_pham = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, IDSP);
            int rs = preparedStatement.executeUpdate();
            System.out.println(rs);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    

}
