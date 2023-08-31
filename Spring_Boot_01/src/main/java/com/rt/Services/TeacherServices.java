package com.rt.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.rt.Dao.TeacherDao;
import com.rt.entity.Teacher;
@Component
public class TeacherServices {
	
	@Autowired
	TeacherDao tcrdao;


	public Teacher AddTeacher(Teacher t) {
		
		tcrdao.save(t)	;
		return null;
	}


	public List<Teacher> getByTeacherByName(String name) {
		List<Teacher> list = tcrdao.findByName(name);
		return list;
	}
	
	// ----------------------------Select By salary-----------------------------------

	public List<Teacher> getByTeacherBySalary(int name) {
		List<Teacher> list = tcrdao.findBySalary(name);
		return list;
	}

	// ----------------------------Select By address-----------------------------------

	public List<Teacher> getTeacherByAddress(String address) {
	List<Teacher> list = tcrdao.findByAddress(address);
		return list;
	}
      
	// ----------------------------delete teacher By id-----------------------------------

	public Teacher deleteByTeacher(int id) {
		
		tcrdao.deleteById(id);
		return null;
	}

	// ----------------------------Select By all data-----------------------------------
	public List<Teacher> getAllata() {
		List<Teacher> list = tcrdao.findAll();
		return list;
	}




	

}
