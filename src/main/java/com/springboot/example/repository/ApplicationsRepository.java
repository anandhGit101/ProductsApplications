/**
 * 
 */
package com.springboot.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.example.domain.Applications;

/**
 * @author M1006601
 *
 */
public interface ApplicationsRepository extends JpaRepository<Applications, Long> {

}
