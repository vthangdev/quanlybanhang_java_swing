/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Quanlynhanvien;

/**
 *
 * @author dvccv
 */
public class NhanVien_DAO {
    int idnv;
    String tennv, email, sdt, gt;

    public NhanVien_DAO(int idnv, String tennv, String email, String sdt, String gt) {
        this.idnv = idnv;
        this.tennv = tennv;
        this.email = email;
        this.sdt = sdt;
        this.gt = gt;
    }

    public int getIdnv() {
        return idnv;
    }

    public void setIdnv(int idnv) {
        this.idnv = idnv;
    }

    public String getTennv() {
        return tennv;
    }

    public void setTennv(String tennv) {
        this.tennv = tennv;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getGt() {
        return gt;
    }

    public void setGt(String gt) {
        this.gt = gt;
    }

}
