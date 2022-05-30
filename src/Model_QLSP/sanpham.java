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
public class Sanpham {
    private int IDSP;
    private int IDLoai;
    private String tenSP;
    private int gia;
    private String anh;
    private String mota;

    public int getIDSP() {
        return IDSP;
    }

    public void setIDSP(int IDSP) {
        this.IDSP = IDSP;
    }

    public int getIDLoai() {
        return IDLoai;
    }

    public void setIDLoai(int IDLoai) {
        this.IDLoai = IDLoai;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public String getAnh() {
        return anh;
    }

    public void setAnh(String anh) {
        this.anh = anh;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    public Sanpham(int IDSP, int IDLoai, String tenSP, int gia, String anh, String mota) {
        this.IDSP = IDSP;
        this.IDLoai = IDLoai;
        this.tenSP = tenSP;
        this.gia = gia;
        this.anh = anh;
        this.mota = mota;
    }

    public Sanpham() {
    }
}
