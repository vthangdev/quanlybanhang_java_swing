
package Services_QLSP;

import DAO_QLSP.ProductManagerment;
import Model_QLSP.sanpham;
import java.util.List;


public class Service_qlsp {
    private ProductManagerment product;

    public Service_qlsp() {
        product = new ProductManagerment();
    }
    
    public List<sanpham> getAllUser() {
        return product.getAllProduct();
    }
    
    public sanpham getProductByName(String tenSP) {
        return product.getProductByName(tenSP);
    }
    
    public sanpham getProductById(String idSP) {
        return product.getProductById(idSP);
    }
    
    public void addProduct(sanpham sanpham) {
        product.addProduct(sanpham);
    }
    
    public int deleteProduct(int id) {
        return product.deleteProduct(id);
    }
}
