package entities;

import java.util.HashSet;
import java.util.Set;

public class Course {
	private String name;
	private Set<Student> students = new HashSet<>();

	public Course(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void addStudent(Student student) {
		students.add(student);
	}

	public Set<Student> getStudents() {
		return students;
	}

	public int totalStudents() {
		return students.size();
	}

	
}
