package Entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Cart {
	
	    @Id

	    @GeneratedValue(strategy = GenerationType.IDENTITY)

	    private Long id;

	 

	    @ManyToMany(mappedBy="Carts")

	    private Set<Product> products= new HashSet<>();



		public Cart() {
			super();
		}



		public Long getId() {
			return id;
		}



		public void setId(Long id) {
			this.id = id;
		}



		public Set<Product> getProducts() {
			return products;
		}



		public void setProducts(Set<Product> products) {
			this.products = products;
		}



		public Cart(Long id, Set<Product> products) {
			super();
			this.id = id;
			this.products = products;
		}

}


