package com.crudoperation.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crudoperation.entity.Student;
import com.crudoperation.repo.StudentDao;

@Service
public class StudentServiceImp implements StudentService{
	
	@Autowired
	private StudentDao studentDao;

	@Override
	public void addStudent(Student stud) {
		
		studentDao.save(stud);
	}

	@Override
	public List<Student> getAllStudent() {
		
		return studentDao.findAll();
	}

	@Override
	public Student getById(int id) {
		Optional<Student> stud=studentDao.findById(id);
		if(stud.isPresent())
		{
			return stud.get();
		}
		return null;
	}

	@Override
	public void deleteById(int id) {
		Student stud=studentDao.getById(id);
		studentDao.delete(stud);
	}

}
