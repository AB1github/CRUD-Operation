package com.crudoperation.service;



import java.util.List;

import com.crudoperation.entity.Student;

public interface StudentService {

	public void addStudent(Student stud);
	public List<Student> getAllStudent();
	public Student getById(int id);
	public void deleteById(int id);
}
