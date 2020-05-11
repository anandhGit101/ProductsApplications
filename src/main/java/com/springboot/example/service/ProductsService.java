/**
 * 
 */
package com.springboot.example.service;

import java.util.List;

import com.springboot.example.domain.Products;

/**
 * @author M1006601
 *
 */
public interface ProductsService {
	
	public List<Products> listAllProducts();
	public void save(Products product);
	public Products get(long id);
	public void delete(long id);
}
