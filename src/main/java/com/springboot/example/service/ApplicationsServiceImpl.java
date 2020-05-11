/**
 * 
 */
package com.springboot.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springboot.example.domain.Applications;
import com.springboot.example.repository.ApplicationsRepository;

/**
 * @author M1006601
 *
 */
@Service
@Transactional
public class ApplicationsServiceImpl implements ApplicationsService {
	
	@Autowired
	ApplicationsRepository applicationsRepo;

	@Override
	public List<Applications> listAllApplications() {
		return applicationsRepo.findAll();
	}

	@Override
	public void save(Applications application) {
		applicationsRepo.save(application);
	}

	@Override
	public Applications get(long id) {
		return applicationsRepo.findById(id).get();
	}

	@Override
	public void delete(long id) {
		applicationsRepo.deleteById(id);
	}

}