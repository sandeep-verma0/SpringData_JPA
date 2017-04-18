package com.learnbycoding.springDataJpa.service;

import java.util.List;

import com.learnbycoding.springDataJpa.model.Student;

public interface StudentService {

	void saveStudent(Student student);

	List<Student> findAllStudents();

	void deleteStudentByUniqueID(String uniqueID);

	Student findByUniqueID(String uniqueID);

	void updateStudent(Student student);
}
