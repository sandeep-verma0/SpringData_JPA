package com.learnbycoding.springDataJpa.dao;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.learnbycoding.springDataJpa.model.Student;

public interface StudentReporsitory extends CrudRepository<Student, Integer>{
	@Modifying
	@Query("delete from Student u where u.uniqueID = ?1")
	 void deleteUsersByuniqueID(String uniqueID);
	 
	 @Query("select u from Student u where u.uniqueID = ?1")		 
	 Student findByUniqueID(String uniqueID);
	
}
