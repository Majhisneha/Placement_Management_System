package com.example.demo.collegecontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.collegeservices.CollegeServices;
import com.example.demo.entity.College;

@RestController
public class CollegeController {
	@Autowired
	CollegeServices cs1;
	
	@PostMapping("/colleges")
	public College saveCollege(@RequestBody College college) {
		return cs1.saveCollege(college);
	}
	
	@GetMapping("/colleges")
	public List<College> fetchCollegeList() {
	   
	    return cs1.fetchCollegeList();
	}

	@GetMapping("/colleges/{id}")
	public College fetchCollegeById(@PathVariable("id") Long id) {
	    return cs1.fetchById(id);
	}

	@DeleteMapping("/colleges/{id}")
	public String deleteCollegeById(@PathVariable("id") Long id) {
	    cs1.deleteCollegeById(id);
	    return "row deleted Successfully!!";
	}

	@PutMapping("/colleges/{id}")
	public College updateCollege(@PathVariable("id") Long id,
	                                   @RequestBody College college) {
	    return cs1.updateStudent(id,college);
	}


}
