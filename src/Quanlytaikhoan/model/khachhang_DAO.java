/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Quanlytaikhoan.model;

/**
 *
 * @author hoten
 */
public class khachhang_DAO {
    int ma_khach_hang;
    String UserName, Email, gioi_tinh, 	so_dien_thoai;
    int Tuoi;

    public khachhang_DAO() {
    }

    public khachhang_DAO(int ma_khach_hang, String UserName, String Email, String gioi_tinh, String so_dien_thoai, int Tuoi) {
        this.ma_khach_hang = ma_khach_hang;
        this.UserName = UserName;
        this.Email = Email;
        this.gioi_tinh = gioi_tinh;
        this.so_dien_thoai = so_dien_thoai;
        this.Tuoi = Tuoi;
    }
    public khachhang_DAO( String UserName, String Email, String gioi_tinh, String so_dien_thoai, int Tuoi) {
        
        this.UserName = UserName;
        this.Email = Email;
        this.gioi_tinh = gioi_tinh;
        this.so_dien_thoai = so_dien_thoai;
        this.Tuoi = Tuoi;
    }

    public int getMa_khach_hang() {
        return ma_khach_hang;
    }

    public void setMa_khach_hang(int ma_khach_hang) {
        this.ma_khach_hang = ma_khach_hang;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getGioi_tinh() {
        return gioi_tinh;
    }

    public void setGioi_tinh(String gioi_tinh) {
        this.gioi_tinh = gioi_tinh;
    }

    public String getSo_dien_thoai() {
        return so_dien_thoai;
    }

    public void setSo_dien_thoai(String so_dien_thoai) {
        this.so_dien_thoai = so_dien_thoai;
    }

    public int getTuoi() {
        return Tuoi;
    }

    public void setTuoi(int Tuoi) {
        this.Tuoi = Tuoi;
    }
    
    
}
