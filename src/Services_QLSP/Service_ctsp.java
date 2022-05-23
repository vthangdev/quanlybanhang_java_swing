
package Services_QLSP;

import DAO_QLSP.ProductManagerment;
import Model_QLSP.Chitietsanpham;
import java.util.List;


public class Service_ctsp {
    private ProductManagerment productdetails;

    public Service_ctsp() {
        productdetails = new ProductManagerment();
    }
    
    public List<Chitietsanpham> getAllUser() {
        return productdetails.getAllproductdetails();
    }
    
    public Chitietsanpham getProductdetailsByName(String ten) {
        return productdetails.getProductdetailsByName(ten);
    }
    
     public Chitietsanpham getProductdetailsById(String ma_loai) {
        return productdetails.getProductdetailsById(ma_loai);
    }
}
