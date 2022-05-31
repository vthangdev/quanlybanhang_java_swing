/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO_QLSP;

import Model_QLSP.Chitietsanpham;
import Model_QLSP.sanpham;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author pc
 */
public class ProductManagerment extends JDBCConnection{
    public List<sanpham> getAllProduct() {
        List<sanpham> sanpham = new ArrayList<sanpham>();

        Connection conn = null;
        try {
            conn = JDBCConnection.getJDBCConnection();
        } catch (SQLException ex) {
            Logger.getLogger(ProductManagerment.class.getName()).log(Level.SEVERE, null, ex);
        }
        String sqlQuerry = "select * from san_pham";

        try {
            PreparedStatement stm = conn.prepareStatement(sqlQuerry);
            ResultSet rs = stm.executeQuery();

            while (rs.next()) {
                sanpham sp = new sanpham();
                sp.setIdsp(rs.getInt("ma_san_pham"));
                sp.setIdloai(rs.getInt("ma_loai"));
                sp.setTensp(rs.getString("ten_san_pham"));
                sp.setGia(rs.getInt("gia"));

                sanpham.add(sp);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return sanpham;
    }
    
    public sanpham getProductByName(String tenSP) {
        sanpham sp = new sanpham();
        Connection conn = null;
        try {
            conn = JDBCConnection.getJDBCConnection();
        } catch (SQLException ex) {
            Logger.getLogger(ProductManagerment.class.getName()).log(Level.SEVERE, null, ex);
        }
        String sqlQuerry = "select * from san_pham where ten_san_pham = ?";
        try {
            PreparedStatement stm = conn.prepareStatement(sqlQuerry);
            stm.setString(1, tenSP);
            ResultSet rs = stm.executeQuery();

            while (rs.next()) {
                sp.setIdsp(rs.getInt("ma_san_pham"));
                sp.setIdloai(rs.getInt("ma_loai"));
                sp.setTensp(rs.getString("ten_san_pham"));
                sp.setGia(rs.getInt("gia"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return sp;
    }
    
    public sanpham getProductById(String ma_san_pham) {
        sanpham sp = new sanpham();
        Connection conn = null;
        try {
            conn = JDBCConnection.getJDBCConnection();
        } catch (SQLException ex) {
            Logger.getLogger(ProductManagerment.class.getName()).log(Level.SEVERE, null, ex);
        }
        String sqlQuerry = "select * from san_pham where ma_san_pham = ?";
        try {
            PreparedStatement stm = conn.prepareStatement(sqlQuerry);
            stm.setString(1, ma_san_pham);
            ResultSet rs = stm.executeQuery();

            while (rs.next()) {
                sp.setIdsp(rs.getInt("ma_san_pham"));
                sp.setIdloai(rs.getInt("ma_loai"));
                sp.setTensp(rs.getString("ten_san_pham"));
                sp.setGia(rs.getInt("gia"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return sp;
    }
    
    public void addProduct(sanpham sanpham) {
        Connection conn = null;
        try {
            conn = JDBCConnection.getJDBCConnection();
        } catch (SQLException ex) {
            Logger.getLogger(ProductManagerment.class.getName()).log(Level.SEVERE, null, ex);
        }
        String sqlQuerry = "insert into san_pham(ma_san_pham,ma_loai,ten_san_pham,gia) values(?,?,?,?)";

        try {
            PreparedStatement stm = conn.prepareStatement(sqlQuerry);
            stm.setInt(1, sanpham.getIdsp());
            stm.setInt(2, sanpham.getIdloai());
            stm.setString(3, sanpham.getTensp());
            stm.setInt(4, sanpham.getGia());

            stm.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    int result;

    public int deleteProduct(int id) {

        Connection conn = null;
        try {
            conn = JDBCConnection.getJDBCConnection();
        } catch (SQLException ex) {
            Logger.getLogger(ProductManagerment.class.getName()).log(Level.SEVERE, null, ex);
        }
        String sqlQuerry = "delete from san_pham where ma_san_pham = ?";

        try {
            PreparedStatement stm = conn.prepareStatement(sqlQuerry);
            stm.setInt(1, id);
            result = stm.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }
    
    //Chi tiết sản phẩm
    
    public List<Chitietsanpham> getAllproductdetails() {
        List<Chitietsanpham> Chitietsanpham = new ArrayList<Chitietsanpham>();

        Connection conn = null;
        try {
            conn = JDBCConnection.getJDBCConnection();
        } catch (SQLException ex) {
            Logger.getLogger(ProductManagerment.class.getName()).log(Level.SEVERE, null, ex);
        }
        String sqlQuerry = "select * from loai_san_pham";

        try {
            PreparedStatement stm = conn.prepareStatement(sqlQuerry);
            ResultSet rs = stm.executeQuery();

            while (rs.next()) {
                Chitietsanpham ctsp = new Chitietsanpham();
                ctsp.setIdloai(rs.getInt("ma_loai"));
                ctsp.setTen(rs.getString("ten_loai"));
                ctsp.setHinh(rs.getString("hinh_loai"));
                ctsp.setMota(rs.getString("Mo_ta"));

                Chitietsanpham.add(ctsp);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return Chitietsanpham;
    }
    
    public Chitietsanpham getProductdetailsByName(String ten) {
        Chitietsanpham ctsp = new Chitietsanpham();
        Connection conn = null;
        try {
            conn = JDBCConnection.getJDBCConnection();
        } catch (SQLException ex) {
            Logger.getLogger(ProductManagerment.class.getName()).log(Level.SEVERE, null, ex);
        }
        String sqlQuerry = "select * from loai_san_pham where ten_loai = ?";
        try {
            PreparedStatement stm = conn.prepareStatement(sqlQuerry);
            stm.setString(1, ten);
            ResultSet rs = stm.executeQuery();

            while (rs.next()) {
                ctsp.setIdloai(rs.getInt("ma_loai"));
                ctsp.setTen(rs.getString("ten_loai"));
                ctsp.setHinh(rs.getString("hinh_loai"));
                ctsp.setMota(rs.getString("Mo_ta"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ctsp;
    }
    
    public Chitietsanpham getProductdetailsById(String ma_loai) {
        Chitietsanpham ctsp = new Chitietsanpham();
        Connection conn = null;
        try {
            conn = JDBCConnection.getJDBCConnection();
        } catch (SQLException ex) {
            Logger.getLogger(ProductManagerment.class.getName()).log(Level.SEVERE, null, ex);
        }
        String sqlQuerry = "select * from loai_san_pham where ma_loai = ?";
        try {
            PreparedStatement stm = conn.prepareStatement(sqlQuerry);
            stm.setString(1, ma_loai);
            ResultSet rs = stm.executeQuery();

            while (rs.next()) {
                ctsp.setIdloai(rs.getInt("ma_loai"));
                ctsp.setTen(rs.getString("ten_loai"));
                ctsp.setHinh(rs.getString("hinh_loai"));
                ctsp.setMota(rs.getString("Mo_ta"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ctsp;
    }
}
