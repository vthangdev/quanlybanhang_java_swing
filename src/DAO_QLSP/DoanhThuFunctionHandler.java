package DAO_QLSP;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Quốc Hùng
 */
public class DoanhThuFunctionHandler {      
    
    public List<Year> getYearDoanhThu() {       //hàm lấy năm bảng hoa_don
        List<Year> years_54 = new ArrayList<>();
        
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/quanlybanhang", "root", "");
            PreparedStatement ps = conn.prepareStatement("SELECT YEAR(ngay_hd) As `nam`, COUNT(YEAR(ngay_hd)) AS `sl` FROM hoa_don GROUP BY YEAR(ngay_hd);");
            ResultSet result = ps.executeQuery();
            
            while (result.next()) {
                Year y_54 =new Year();
                y_54.setYear(result.getString("nam"));
                
                years_54.add(y_54);
            }
            return years_54;
        } catch (SQLException ex) {
            Logger.getLogger(DoanhThuFunctionHandler.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        return null;
    }
    
    
    public List<DoanhThu> getAllDataHoaDon(String y_54) {
        List<DoanhThu> dts_54 = new ArrayList<>();
        
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/quanlybanhang", "root", "");
            
            PreparedStatement ps = conn.prepareStatement("select * from hoa_don where YEAR(ngay_hd) = ?");
            ps.setString(1, y_54);
            ResultSet result = ps.executeQuery();
            
            while (result.next()) {
                DoanhThu dt_54 = new DoanhThu();
                
                dt_54.setSoHD_54(result.getString("so_hoa_don"));
                dt_54.setThoiGian_54(result.getString("thoi_gian"));
                dt_54.setNgayHD_54(result.getString("ngay_hd"));
                dt_54.setMaKH_54(result.getString("ma_khach_hang"));
                dt_54.setMaSP_54(result.getString("ma_san_pham"));
                dt_54.setSoLuong_54(result.getString("soLuong"));
                dt_54.setDonGia_54(result.getString("donGia"));
                
                dts_54.add(dt_54);
            }
            return dts_54;
        } catch (SQLException ex) {
            Logger.getLogger(DoanhThuFunctionHandler.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public List<DoanhThu> getAllDataHoaDonDK(String nBD_54,String nKT_54) {
        List<DoanhThu> dts_54 = new ArrayList<>();
        
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/quanlybanhang", "root", "");
            
            PreparedStatement ps = conn.prepareStatement("select * from hoa_don where ngay_hd >= ? and ngay_hd <= ?");
            ps.setString(1, nBD_54);
            ps.setString(2, nKT_54);
            ResultSet result = ps.executeQuery();
            
            while (result.next()) {
                DoanhThu dt_54 = new DoanhThu();
                
                dt_54.setSoHD_54(result.getString("so_hoa_don"));
                dt_54.setThoiGian_54(result.getString("thoi_gian"));
                dt_54.setNgayHD_54(result.getString("ngay_hd"));
                dt_54.setMaKH_54(result.getString("ma_khach_hang"));
                dt_54.setMaSP_54(result.getString("ma_san_pham"));
                dt_54.setSoLuong_54(result.getString("soLuong"));
                dt_54.setDonGia_54(result.getString("donGia"));
                
                dts_54.add(dt_54);
            }
            return dts_54;
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(DoanhThuFunctionHandler.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        return null;
    }

    public List<DoanhThu> GetResultSearch(String searchType_54,String valueSearch_54) {
        List<DoanhThu> dts_54 = new ArrayList<>();
        
        
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/quanlybanhang", "root", "");
            
            PreparedStatement ps = null;
            switch(searchType_54) {
            case "Năm" : 
                 ps = conn.prepareStatement("select * from hoa_don where YEAR(ngay_hd) = ?");
                 ps.setObject(1, valueSearch_54);  
                break;
            
            case "Tháng" : 
                 ps = conn.prepareStatement("select * from hoa_don where MONTH(ngay_hd) = ?");
                ps.setObject(1, valueSearch_54);  
                break;
             
            case "Ngày" : 
                 ps = conn.prepareStatement("select * from hoa_don where DAY(ngay_hd) = ?");
                ps.setObject(1, valueSearch_54);  
                break;
            }
            
            ResultSet result = ps.executeQuery();
            
            while(result.next()) {
                DoanhThu dt_54 = new DoanhThu();
                
                dt_54.setSoHD_54(result.getString("so_hoa_don"));
                dt_54.setThoiGian_54(result.getString("thoi_gian"));
                dt_54.setNgayHD_54(result.getString("ngay_hd"));
                dt_54.setMaKH_54(result.getString("ma_khach_hang"));
                dt_54.setMaSP_54(result.getString("ma_san_pham"));
                dt_54.setSoLuong_54(result.getString("soLuong"));
                dt_54.setDonGia_54(result.getString("donGia"));
                
                dts_54.add(dt_54);
            }
            return dts_54;
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(DoanhThuFunctionHandler.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        return null;
    }
}
