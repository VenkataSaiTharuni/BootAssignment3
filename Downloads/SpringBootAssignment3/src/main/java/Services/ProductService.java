package Services;

import java.util.ArrayList;

import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.ecommerceApplication.Repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
    private ProductRepository productRepository;
 
    // CRUD operations
 
    public List<Product> listAllProducts() {
        return productRepository.findAll();
    }
 
    public Optional<Product> getProductById(Long productId) {
        return productRepository.findById(productId);
    }
 
    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }
 
    public void deleteProduct(Long productId) {
        productRepository.deleteById(productId);
    }

	public String getId() {
		// TODO Auto-generated method stub
		return null;
	}

}
