package Entity;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Order {
	
	 @Id

	    @GeneratedValue(strategy = GenerationType.IDENTITY)

	    private Long id;

	 

	    @ManyToMany

	    private Set<Product> products= new HashSet<>();

	    private LocalDateTime orderDate;

		public Order() {
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

		public LocalDateTime getOrderDate() {
			return orderDate;
		}

		public void setOrderDate(LocalDateTime orderDate) {
			this.orderDate = orderDate;
		}

		public Order(Long id, Set<Product> products, LocalDateTime orderDate) {
			super();
			this.id = id;
			this.products = products;
			this.orderDate = orderDate;
		}


}
