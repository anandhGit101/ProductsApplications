package com.springboot.example.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
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
	/**
	 * @return the productId
	 */
	public Long getProductId() {
		return productId;
	}
	/**
	 * @param productId the productId to set
	 */
	public void setProductId(Long productId) {
		this.productId = productId;
	}
	/**
	 * @return the productName
	 */
	public String getProductName() {
		return productName;
	}
	/**
	 * @param productName the productName to set
	 */
	public void setProductName(String productName) {
		this.productName = productName;
	}
	/**
	 * @return the productBrand
	 */
	public String getProductBrand() {
		return productBrand;
	}
	/**
	 * @param productBrand the productBrand to set
	 */
	public void setProductBrand(String productBrand) {
		this.productBrand = productBrand;
	}
	/**
	 * @return the productMadeIn
	 */
	public String getProductMadeIn() {
		return productMadeIn;
	}
	/**
	 * @param productMadeIn the productMadeIn to set
	 */
	public void setProductMadeIn(String productMadeIn) {
		this.productMadeIn = productMadeIn;
	}
	/**
	 * @return the productPrice
	 */
	public double getProductPrice() {
		return productPrice;
	}
	/**
	 * @param productPrice the productPrice to set
	 */
	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
}