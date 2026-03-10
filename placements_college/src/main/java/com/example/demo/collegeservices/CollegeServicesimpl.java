package com.example.demo.collegeservices;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.collegerepository.CollegeRepository;
import com.example.demo.entity.College;

@Service
public class CollegeServicesimpl implements CollegeServices {
	
	@Autowired
	CollegeRepository cr1;

	@Override
	public College saveCollege(College college) {
		// TODO Auto-generated method stub
		return cr1.save(college);
	}

	@Override
	public List<College> fetchCollegeList() {
		// TODO Auto-generated method stub
		return cr1.findAll();
	}

	@Override
	public College fetchById(Long id) {
		// TODO Auto-generated method stub
		return cr1.findById(id).get();
	}

	@Override
	public void deleteCollegeById(Long id) {
		// TODO Auto-generated method stub
		cr1.deleteById(id);
	}

	@Override
	public College updateStudent(Long id, College college) {
		// TODO Auto-generated method stub
		College colDB = cr1.findById(id).get();
		
		 if(Objects.nonNull(college.getCollegename()) &&
	              !"".equalsIgnoreCase(college.getCollegename())) {
	          colDB.setCollegename(college.getCollegename());
	      }
	    
	      if(Objects.nonNull(college.getLocation()) &&
	              !"".equalsIgnoreCase(college.getLocation())) {
	          colDB.setLocation(college.getLocation());
	      }
		
		return cr1.save(colDB);
	}

}
