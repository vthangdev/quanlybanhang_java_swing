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
public class sanpham {
    private int idsp;
    private int idloai;
    private String tensp;
    private int gia;

    public sanpham() {
    }

    public sanpham(int idsp, int idloai, String tensp, int gia) {
        this.idsp = idsp;
        this.idloai = idloai;
        this.tensp = tensp;
        this.gia = gia;
    }

    public int getIdsp() {
        return idsp;
    }

    public void setIdsp(int idsp) {
        this.idsp = idsp;
    }

    public int getIdloai() {
        return idloai;
    }

    public void setIdloai(int idloai) {
        this.idloai = idloai;
    }

    public String getTensp() {
        return tensp;
    }

    public void setTensp(String tensp) {
        this.tensp = tensp;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public void addProduct(sanpham product) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
