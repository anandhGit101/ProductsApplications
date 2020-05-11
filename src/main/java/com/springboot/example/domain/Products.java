package com.springboot.example.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 
 */

/**
 * @author M1006601
 *
 */
@Entity
@Table(name = "products")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Products {
	
	@Id
	@Column(name="productId")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long productId;
	@Column(name="productName")
	private String productName;
	@Column(name="productBrand")
	private String productBrand;
	@Column(name="productMadeIn")
	private String productMadeIn;
	@Column(name="productPrice")
	private double productPrice;

}