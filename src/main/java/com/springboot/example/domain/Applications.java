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
import lombok.NoArgsConstructor;

/**
 * @author M1006601
 *
 */
@Entity
@Table(name = "applications")
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
	/**
	 * @return the applicationsId
	 */
	public Long getApplicationsId() {
		return applicationsId;
	}
	/**
	 * @param applicationsId the applicationsId to set
	 */
	public void setApplicationsId(Long applicationsId) {
		this.applicationsId = applicationsId;
	}
	/**
	 * @return the applicationsName
	 */
	public String getApplicationsName() {
		return applicationsName;
	}
	/**
	 * @param applicationsName the applicationsName to set
	 */
	public void setApplicationsName(String applicationsName) {
		this.applicationsName = applicationsName;
	}
	/**
	 * @return the applicationsCreatedBy
	 */
	public String getApplicationsCreatedBy() {
		return applicationsCreatedBy;
	}
	/**
	 * @param applicationsCreatedBy the applicationsCreatedBy to set
	 */
	public void setApplicationsCreatedBy(String applicationsCreatedBy) {
		this.applicationsCreatedBy = applicationsCreatedBy;
	}
	/**
	 * @return the applicationsDescription
	 */
	public String getApplicationsDescription() {
		return applicationsDescription;
	}
	/**
	 * @param applicationsDescription the applicationsDescription to set
	 */
	public void setApplicationsDescription(String applicationsDescription) {
		this.applicationsDescription = applicationsDescription;
	}
	/**
	 * @return the applicationsPrice
	 */
	public double getApplicationsPrice() {
		return applicationsPrice;
	}
	/**
	 * @param applicationsPrice the applicationsPrice to set
	 */
	public void setApplicationsPrice(double applicationsPrice) {
		this.applicationsPrice = applicationsPrice;
	}
	
	
}