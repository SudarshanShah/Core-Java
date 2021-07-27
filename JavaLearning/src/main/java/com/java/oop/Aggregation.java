package com.java.oop;

import java.util.ArrayList;
import java.util.List;

// It is a special form of Association where:
//It represents Has-A relationship.
//It is a unidirectional association i.e. a one way relationship. 
//For example, department can have students but vice versa is not possible and thus unidirectional in nature.
//In Aggregation, both the entries can survive individually which means ending one entity will not effect the other entity

class Student {

	private int id;
	private String name;
	private String dept;

	public Student(int id, String name, String dept) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", dept=" + dept + "]";
	}

}

class Department {

	private String name;
	private List<Student> students;

	public Department(String name, List<Student> students) {
		super();
		this.name = name;
		this.students = students;
	}

	public List<Student> getStudents() {
		return students;
	}

	public String getName() {
		return name;
	}

}

class Institute {

	private String name;
	private List<Department> departments;

	public Institute(String name, List<Department> departments) {
		super();
		this.name = name;
		this.departments = departments;
	}

	public String getName() {
		return name;
	}

	public int getTotalStudents() {

		int studentsCount = 0;
		List<Student> students;

		for (Department dept : departments) {
			students = dept.getStudents();
			for (int i = 0; i < students.size(); i++) {
				studentsCount++;
			}
		}

		return studentsCount;
	}
}

public class Aggregation {

	public static void main(String[] args) {

		Student s1 = new Student(1, "Sudarshan Shah", "CS");
		Student s2 = new Student(2, "Ananya", "MBA");
		Student s3 = new Student(3, "Nikhil Gupta", "Maths");
		Student s4 = new Student(4, "Harsh Rajpurohit", "Engg");

		List<Student> grp1 = new ArrayList<Student>();
		grp1.add(s1);
		grp1.add(s2);

		List<Student> grp2 = new ArrayList<Student>();
		grp2.add(s3);
		grp2.add(s4);

		Department dep1 = new Department("Consultancy", grp1);
		Department dep2 = new Department("Technical", grp2);

		List<Department> departments = new ArrayList<Department>();
		departments.add(dep1);
		departments.add(dep2);

		Institute institute = new Institute("IIT", departments);

		System.out.println("Total students in institute : " + institute.getTotalStudents());
	}
}
