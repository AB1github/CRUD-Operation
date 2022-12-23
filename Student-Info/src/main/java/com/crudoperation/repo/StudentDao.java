package com.crudoperation.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crudoperation.entity.Student;

@Repository
public interface StudentDao extends JpaRepository<Student, Integer> {

}
