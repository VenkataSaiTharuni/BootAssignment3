package com.cts.ecommerceApplication.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Entity.Cart;
import Entity.Order;
import Entity.Product;

public interface ProductRepository extends JpaRepository<Product, String>{
	
public interface CartRepository extends JpaRepository<Cart, Long> {}
public interface OrderRepository extends JpaRepository<Order, Long> {}

}
