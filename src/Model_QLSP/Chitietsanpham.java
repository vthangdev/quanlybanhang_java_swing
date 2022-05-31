/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model_QLSP;

/**
 *
 * @author pc
 */
public class Chitietsanpham {
    private int idloai;
    private String ten;
    private String hinh;
    private String mota;

    public int getIdloai() {
        return idloai;
    }

    public void setIdloai(int idloai) {
        this.idloai = idloai;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getHinh() {
        return hinh;
    }

    public void setHinh(String hinh) {
        this.hinh = hinh;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    public Chitietsanpham(int idloai, String ten, String hinh, String mota) {
        this.idloai = idloai;
        this.ten = ten;
        this.hinh = hinh;
        this.mota = mota;
    }

    public Chitietsanpham() {
    }
}
