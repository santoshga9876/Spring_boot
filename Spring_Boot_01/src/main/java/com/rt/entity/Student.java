package com.rt.entity;

public class Student {
	private int rollno;
	private String name;
	private String marks;
	private String classno;
	
	public Student() {
	
		
}

	public Student(int rollno, String name, String marks, String classno) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
		this.classno = classno;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMarks() {
		return marks;
	}

	public void setMarks(String marks) {
		this.marks = marks;
	}

	public String getClassno() {
		return classno;
	}

	public void setClassno(String classno) {
		this.classno = classno;
	}
	
	
}
