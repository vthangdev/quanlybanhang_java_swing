/*
  crud(insert, update, delete, findall)
 */
package Quanlytaikhoan.model;


import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.List;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hoten
 */
public class KhachhangModify {
    public static List<khachhang_DAO> findAll() {
        List<khachhang_DAO> KhachhangList = new ArrayList<>();
        
        Connection connection = null;
        Statement statement = null;
        
        try {
            //lay tat ca ds khach hang
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/quanlybanhang", "root", "");
            
            //query
            String  sql= "select * from info_user";
            statement= connection.createStatement();
            
            ResultSet resultSet = statement.executeQuery(sql);
            
            while(resultSet.next()){
                khachhang_DAO kh = new khachhang_DAO(resultSet.getInt("ma_khach_hang"), resultSet.getString("UserName"),
                    resultSet.getString("Email"), resultSet.getString("gioi_tinh"), resultSet.getString("so_dien_thoai"), 
                    resultSet.getInt("Tuoi"));
                KhachhangList.add(kh);
            }
           
            
           
        } catch (SQLException ex) {
            Logger.getLogger(KhachhangModify.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            if(statement != null){
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(KhachhangModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            if(connection!=null){
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(KhachhangModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        ///ket thuc
        return KhachhangList;
    }




public static void  insert(khachhang_DAO kh) {
    Connection connection = null;
    PreparedStatement statement = null;
        
        try {
            //lay tat ca ds khach hang
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/quanlybanhang", "root", "");
            
            //query
            String  sql= "insert into info_user( UserName, Email, gioi_tinh, so_dien_thoai, Tuoi) values(?,?,?,?,?)";
            statement=  connection.prepareCall(sql);
            
           
            statement.setString(1, kh.getUserName());
            statement.setString(2, kh.getEmail());
            statement.setString(3, kh.getGioi_tinh());
            statement.setString(4, kh.getSo_dien_thoai());
            statement.setInt(5, kh.getTuoi());
            
            statement.execute();
           
        } catch (SQLException ex) {
            Logger.getLogger(KhachhangModify.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            if(statement != null){
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(KhachhangModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            if(connection!=null){
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(KhachhangModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        ///ket thuc
    
}
public static void  update(khachhang_DAO kh) {
    Connection connection = null;
    PreparedStatement statement = null;
        
        try {
            //lay tat ca ds khach hang
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/quanlybanhang", "root", "");
            
            //query
            String  sql= "update info_user set  UserName=?, Email=?, gioi_tinh=?, so_dien_thoai=?, Tuoi=? where ma_khach_hang=? ";
            statement=  connection.prepareCall(sql);
            
            
            statement.setString(1, kh.getUserName());
            statement.setString(2, kh.getEmail());
            statement.setString(3, kh.getGioi_tinh());
            statement.setString(4, kh.getSo_dien_thoai());
            statement.setInt(5, kh.getTuoi());
            statement.setInt(6, kh.getMa_khach_hang());
            
            statement.execute();
           
        } catch (SQLException ex) {
            Logger.getLogger(KhachhangModify.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            if(statement != null){
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(KhachhangModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            if(connection!=null){
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(KhachhangModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        ///ket thuc
    
}

public static void  delete(int ma_khach_hang) {
    Connection connection = null;
    PreparedStatement statement = null;
        
        try {
            //lay tat ca ds khach hang
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/quanlybanhang", "root", "");
            
            //query
            String  sql= "delete from info_user where ma_khach_hang=? ";
            statement=   connection.prepareCall(sql);
            
            statement.setInt(1, ma_khach_hang);
            
            
            statement.execute();
            
           
        } catch (SQLException ex) {
            Logger.getLogger(KhachhangModify.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            if(statement != null){
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(KhachhangModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            if(connection!=null){
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(KhachhangModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        ///ket thuc
    
}


}

