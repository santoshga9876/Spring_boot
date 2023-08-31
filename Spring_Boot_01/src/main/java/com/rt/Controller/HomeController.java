package com.rt.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rt.Services.TeacherServices;
import com.rt.entity.Student;
import com.rt.entity.Teacher;

@RestController
public class HomeController {

	@Autowired
	TeacherServices tcrservices;

	@RequestMapping("/hello")
	private String hello() {
		return "hello";
	}

	@RequestMapping("/std/{rollno}")
	public Student student(@PathVariable("rollno") int rollno) {

		Student a = new Student(11, "santosh", "a+", "sangola");

		return a;
	}

	// ----------------------------add By teacher-----------------------------------

	@PostMapping("/teacher")
	public String AddTeacher(@RequestBody Teacher t) {

		tcrservices.AddTeacher(t);

		return "addd data success";

	}

	// ----------------------------Select By Name-----------------------------------
	
	@GetMapping("/teacher/name/{name}")
	public List<Teacher> getByTeacherByName(@PathVariable String name) {

		List<Teacher> list = tcrservices.getByTeacherByName(name);
		return list;
	}
	
	// ----------------------------Select By salary-----------------------------------
	
	@GetMapping("/teacher/salary/{salary}")
	public List<Teacher> getByTeacherBySalary(@PathVariable int salary) {

		List<Teacher> list = tcrservices.getByTeacherBySalary(salary);
		return list ;
	}

	// ----------------------------Select By address-----------------------------------
	
	@GetMapping("/teacher/address/{address}")
	public List<Teacher> getTeacherByAddress(@PathVariable String address) {
		List<Teacher> tc = tcrservices.getTeacherByAddress(address);
		return tc;
		
		// ----------------------------Select By id-----------------------------------

	}
	@DeleteMapping("/teacher/id/{id}")
	public Teacher deleteIdByTeacher(@PathVariable int id) {
		Teacher t = tcrservices.deleteByTeacher(id);
		
		return t;
     
	}
	
	// ----------------------------Select All Data-----------------------------------
	@GetMapping("/teacher/alldata")
	public List<Teacher> getAllata() {
		List<Teacher> list = tcrservices.getAllata();
return list;
	}
	
	
	
}
