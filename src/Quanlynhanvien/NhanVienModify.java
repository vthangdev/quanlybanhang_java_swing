/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Quanlynhanvien;

import Quanlytaikhoan.model.khachhang_DAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dvccv
 */
public class NhanVienModify {

    public static List<NhanVien_DAO> findAll() {
        List<NhanVien_DAO> NhanVienList = new ArrayList<>();

        Connection connection = null;
        Statement statement = null;

        try {
            //lay tat ca ds khach hang
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/quanlybanhang", "root", "");

            //query
            String sql = "select * from `nhan_vien`";
            statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                NhanVien_DAO nv = new NhanVien_DAO(resultSet.getInt("idnv"), resultSet.getString("tennv"),
                        resultSet.getString("email"), resultSet.getString("sdt"), resultSet.getString("gt"));
                NhanVienList.add(nv);
            }
        } catch (SQLException ex) {
            Logger.getLogger(NhanVienModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(NhanVienModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(NhanVienModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        ///ket thuc
        return NhanVienList;
    }

    public static void insert(NhanVien_DAO nv) {
        Connection connection = null;
        PreparedStatement statement = null;

        try {
            //lay tat ca ds khach hang
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/quanlybanhang", "root", "");

            //query
            String sql = "insert into nhan_vien( idnv, tennv, email, sdt, gt) values(?,?,?,?,?)";
            statement = connection.prepareCall(sql);
            if (nv.getGt().equals("Nam")) {
                statement.setInt(1, nv.getIdnv());
                statement.setString(2, nv.getTennv());
                statement.setString(3, nv.getEmail());
                statement.setString(4, nv.getSdt());
                statement.setBoolean(5, true);
            } else {
                statement.setInt(1, nv.getIdnv());
                statement.setString(2, nv.getTennv());
                statement.setString(3, nv.getEmail());
                statement.setString(4, nv.getSdt());
                statement.setBoolean(5, false);
            }
            statement.execute();

        } catch (SQLException ex) {
            Logger.getLogger(NhanVienModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(NhanVienModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(NhanVienModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        ///ket thuc

    }

    public static void update(NhanVien_DAO nv) {
        Connection connection = null;
        PreparedStatement statement = null;

        try {
            //lay tat ca ds khach hang
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/quanlybanhang", "root", "");

            //query
            String sql = "update nhan_vien set  tennv=?, email=?, sdt=?, gt=? where idnv=? ";
            statement = connection.prepareCall(sql);
            if (nv.getGt().equals("Nam")) {
                statement.setString(1, nv.getTennv());
                statement.setString(2, nv.getEmail());
                statement.setString(3, nv.getSdt());
                statement.setBoolean(4, true);
                statement.setInt(5, nv.getIdnv());
            } else {
                statement.setString(1, nv.getTennv());
                statement.setString(2, nv.getEmail());
                statement.setString(3, nv.getSdt());
                statement.setBoolean(4, false);
                statement.setInt(5, nv.getIdnv());
            }

            statement.execute();

        } catch (SQLException ex) {
            Logger.getLogger(NhanVienModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(NhanVienModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(NhanVienModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        ///ket thuc

    }
public static void  delete(int idnv) {
    Connection connection = null;
    PreparedStatement statement = null;
        
        try {
            //lay tat ca ds khach hang
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/quanlybanhang", "root", "");
            
            //query
            String  sql= "delete from nhan_vien where idnv=? ";
            statement=   connection.prepareCall(sql);
            
            statement.setInt(1, idnv);
            
            
            statement.execute();
            
           
        } catch (SQLException ex) {
            Logger.getLogger(NhanVienModify.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            if(statement != null){
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(NhanVienModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            if(connection!=null){
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(NhanVienModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        ///ket thuc
    
}
}
