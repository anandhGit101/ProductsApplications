/**
 * 
 */
package com.springboot.example.service;

import java.util.List;

import com.springboot.example.domain.Applications;

/**
 * @author M1006601
 *
 */
public interface ApplicationsService {

	public List<Applications> listAllApplications();
	public void save(Applications product);
	public Applications get(long id);
	public void delete(long id);
}
