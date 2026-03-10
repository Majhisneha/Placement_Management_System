package com.example.demo.collegeservices;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.College;

@Service
public interface CollegeServices {

	College saveCollege(College college);

	List<College> fetchCollegeList();

	College fetchById(Long id);

	void deleteCollegeById(Long id);

	College updateStudent(Long id, College college);

}
