package com.jacome.store.dao;

import com.jacome.store.dto.Product;

public interface ProductDAO {
	
	void create(Product product);
	
	Product read(int id);
	
	void update(Product product);
	
	void delete(int id);
	
}
