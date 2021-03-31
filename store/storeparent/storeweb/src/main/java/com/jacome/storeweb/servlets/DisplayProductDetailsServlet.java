package com.jacome.storeweb.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jacome.store.bo.ProductBOImpl;
import com.jacome.store.dto.Product;

/**
 * Servlet implementation class DisplayProductDetailsServlet
 */
public class DisplayProductDetailsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Integer id = Integer.parseInt(request.getParameter("id"));
		ProductBOImpl bo = new ProductBOImpl();
		Product product = bo.findProduct(id);
		
		PrintWriter out = response.getWriter();
		out.print("Product Details");
		out.print("Product ID: "+product.getId());
		out.print("Product Name: "+product.getName());
		out.print("Product Description: "+product.getDescription());
		out.print("Product Price: "+product.getPrice());		
	}

}
