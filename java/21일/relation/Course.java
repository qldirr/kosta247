package kosta.relation;

import java.util.ArrayList;
import java.util.List;

public class Course {
	private String name;//과목명
	private List<Student> students;
	
	public Course() {}

	public Course(String name) {
		super();
		this.name = name;
		students = new ArrayList<Student>();
	}
	
	public void addStudent(Student student) {
		students.add(student);
	}
	
	public void removeStudent(Student student) {
		students.remove(student);
	}
	
	public void printCourse() {
		System.out.println("과목명 : " + name);
		for(Student student : students) {
			System.out.println("수강 신청 학생명: " + student.getName());
		}
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
