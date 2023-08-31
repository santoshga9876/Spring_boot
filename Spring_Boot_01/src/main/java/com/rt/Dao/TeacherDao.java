package com.rt.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.rt.entity.Teacher;

public interface TeacherDao extends JpaRepository<Teacher, Integer> {

	// Teacher findByName(String name);
	//-----------------------------------------------------------------------------------------

	//Teacher findByAddress(String address);

	@Query(value = "select e from Teacher e where e.name=:name", nativeQuery = false)
	List<Teacher> findByName(@Param("name") String name);
	
	
	@Query(value = "select e from Teacher e where e.salary=:salary", nativeQuery = false)
	List<Teacher> findBySalary(@Param("salary") int name);
	
	//-----------------------------------------------------------------------------------------
	@Query(value = "select e from Teacher e where e.address=:address ", nativeQuery=false)
	List<Teacher> findByAddress(@Param("address")String address);


}
