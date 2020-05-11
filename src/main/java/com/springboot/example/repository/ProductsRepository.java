/**
 * 
 */
package com.springboot.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.example.domain.Products;

/**
 * @author M1006601
 *
 */
public interface ProductsRepository extends JpaRepository<Products, Long> {

}
