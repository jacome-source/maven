package com.jacome.store.bo;

import com.jacome.store.dto.Product;

public interface ProductBO {

	void create(Product product);
	
	Product findProduct(int id);
}
