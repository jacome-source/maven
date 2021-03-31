package com.jacome.store.bo;

import com.jacome.store.dao.ProductDAO;
import com.jacome.store.dao.ProductDAOImpl;
import com.jacome.store.dto.Product;

public class ProductBOImpl implements ProductBO {

	private static ProductDAO dao = new ProductDAOImpl();
	
	@Override
	public void create(Product product) {
		dao.create(product);
	}

	@Override
	public Product findProduct(int id) {
		return dao.read(id);
	}

}
