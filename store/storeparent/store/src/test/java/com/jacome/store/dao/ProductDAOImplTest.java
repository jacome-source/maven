package com.jacome.store.dao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import com.jacome.store.dto.Product;

public class ProductDAOImplTest {

	@Test
	public void test() {
		ProductDAO dao = new ProductDAOImpl();
		Product product = new Product();
		product.setId(1);
		product.setName("Celular");
		product.setDescription("Bom produto");
		product.setPrice(800);
		dao.create(product);
		Product result = dao.read(1);
		
		assertNotNull(result);
		assertEquals("Celular", result.getName());
	}
}
