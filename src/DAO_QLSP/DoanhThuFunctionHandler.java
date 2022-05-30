package DAO_QLSP;

import java.lang.System.Logger;
import java.lang.System.Logger.Level;
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
            Connection conn = JDBCConnection.getJDBCConnection();
            PreparedStatement ps = conn.prepareStatement("SELECT YEAR(ngay_hd) As `nam`, COUNT(YEAR(ngay_hd)) AS `sl` FROM hoa_don GROUP BY YEAR(ngay_hd);");
            ResultSet result = ps.executeQuery();
            
            while (result.next()) {
                Year y_54 =new Year();
                y_54.setYear(result.getString("nam"));
                
                years_54.add(y_54);
            }
            return years_54;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }
    
    
    public List<DoanhThu> getAllDataHoaDon(String y_54) {
        List<DoanhThu> dts_54 = new ArrayList<>();
        
        try {
            Connection conn = JDBCConnection.getJDBCConnection();
            
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
            ex.printStackTrace();
        }
        return null;
    }

//    public List<Staff> GetAllStaff() {
//        List<Staff> staffs = new ArrayList<Staff>();
//        Connection conn = ConnectSQLServer.ConnectSQL();
//        
//        try {
//            PreparedStatement ps = conn.prepareStatement("select * from Staff");
//            ResultSet result = ps.executeQuery();
//            
//            while (result.next()) {
//                Staff staff = new Staff();
//                
//                staff.setID(result.getString("ID"));
//                staff.setName(result.getString("name"));
//                staff.setAddress(result.getString("address"));
//                staff.setEmail(result.getString("email"));
//                staff.setPhoneNumber(result.getString("phoneNumber"));
//                staff.setGender(result.getBoolean("gender"));
//                
//                staffs.add(staff);
//            }
//        } catch (SQLException ex) {
//            Logger.getLogger(HandleLogicFunctions.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return staffs;
//    }
}
