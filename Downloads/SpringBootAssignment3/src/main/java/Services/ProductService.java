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

	/* public List<Product> listAllProducts() {
		 
		 	List<Product> products=new ArrayList<>();
		 	productRepository.findAll().forEach(products::add);
	        return products;

	    }

	   
*/
	    // Other CRUD methods ...

}
