package com.learnbycoding.springDataJpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.learnbycoding.springDataJpa.dao.StudentReporsitory;
import com.learnbycoding.springDataJpa.model.Student;

@Service("studentService")
@Transactional
public class StudentServiceImpl implements StudentService{
	
	 @Autowired 
	 private StudentReporsitory repository;
	
	@Override
	public List<Student> findAllStudents() {
		return ( List<Student>)repository.findAll();
	}

	@Override
	public void deleteStudentByUniqueID(String uniqueID) {
		repository.deleteUsersByuniqueID(uniqueID);
	}

	@Override
	public Student findByUniqueID(String uniqueID) {
	    return repository.findByUniqueID(uniqueID);
	}

	@Override
	public void updateStudent(Student student) {
		repository.save(student);
	}

	@Override
	public void saveStudent(Student student) {
		repository.save(student);
	}
}
