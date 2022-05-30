/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services_QLSP;

import DAO_QLSP.SanphamDAO;
import Model_QLSP.Sanpham;
import java.util.List;

/**
 *
 * @author pc
 */
public class Services {
    private SanphamDAO sanphamDAO;
    
    public Services(){
        sanphamDAO = new SanphamDAO();
    }
    
    public List<Sanpham> getAllSanpham(){
        return sanphamDAO.getAllSanPham();
    }
    
    public void addSanpham(Sanpham sp){
        sanphamDAO.addSP(sp);
    }
    
    public void deleteSanpham(String IDSP){
        sanphamDAO.deleteSP(IDSP);
    }
    
    public Sanpham getSPById(int IDSP){
        return sanphamDAO.getSPById(IDSP);
    }
     
    public void updateSanpham(Sanpham sp){
        sanphamDAO.updateSP(sp);
    }

    
}
