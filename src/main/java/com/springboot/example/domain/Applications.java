/**
 * 
 */
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
 * @author M1006601
 *
 */
@Entity
@Table(name = "applications")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Applications {
	
	@Id
	@Column(name="applicationsId")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long applicationsId;
	@Column(name="applicationsName")
	private String applicationsName;
	@Column(name="applicationsCreator")
	private String applicationsCreatedBy;
	@Column(name="applicationsDescription")
	private String applicationsDescription;
	@Column(name="applicationsPrice")
	private double applicationsPrice;
}