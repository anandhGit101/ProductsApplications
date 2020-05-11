/**
 * 
 */
package com.springboot.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springboot.example.domain.Products;
import com.springboot.example.repository.ProductsRepository;

/**
 * @author M1006601
 *
 */
@Service
@Transactional
public class ProductsServiceImpl implements ProductsService {
	
	@Autowired
    private ProductsRepository productsRepo;

	@Override
	public List<Products> listAllProducts() {
		return productsRepo.findAll();		
	}

	@Override
	public void save(Products product) {
		productsRepo.save(product);
	}

	@Override
	public Products get(long id) {
		return productsRepo.findById(id).get();
	}

	@Override
	public void delete(long id) {
		productsRepo.deleteById(id);		
	}
	
}
