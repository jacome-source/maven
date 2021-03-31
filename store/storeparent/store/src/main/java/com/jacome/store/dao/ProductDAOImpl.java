package com.jacome.store.dao;

import java.util.HashMap;
import java.util.Map;

import com.jacome.store.dto.Product;

public class ProductDAOImpl implements ProductDAO {

	Map<Integer,Product> products = new HashMap<Integer,Product>();
	
	@Override
	public void create(Product product) {
		products.put(product.getId(), product);
	}

	@Override
	public Product read(int id) {
		return products.get(id);
	}

	@Override
	public void update(Product product) {
		products.replace(product.getId(), product);
	}

	@Override
	public void delete(int id) {
		products.remove(id);
	}
}
