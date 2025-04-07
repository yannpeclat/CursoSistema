package application;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import entities.Course;
import entities.Student;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		List<Course> courses = new ArrayList<>();

		System.out.print("Quantos cursos serão cadastrados? ");
		int n = sc.nextInt();
		sc.nextLine();

		for (int i = 0; i < n; i++) {
			System.out.printf("\nCurso $%d: \n", i + 1);
			System.out.print("Nome do curso: ");
			sc.nextLine();
			String courseName = sc.nextLine();
			Course course = new Course(courseName);

			System.out.print("Quantos alunos no curso: ");
			int studentCount = sc.nextInt();

			for (int j = 0; j < studentCount; j++) {
				System.out.printf("\nAluno #%d: \n", j + 1);
				System.out.print("ID: ");
				int id = sc.nextInt();
				while (hasStudentId(course.getStudents(), id)) {
					System.out.print("ID ja existe neste curso! Tente outro: ");
					id = sc.nextInt();
				}
				System.out.print("Nome: ");
				sc.nextLine();
				String name = sc.nextLine();
				course.addStudent(new Student(id, name));
			}

			courses.add(course);
		}

		System.out.println("\nResumo de Cursos:");
		for (Course c : courses) {
			System.out.println("\nCurso: " + c.getName());
			for (Student s : c.getStudents()) {
				System.out.println("- " + s);
			}
		}

		Set<Student> allStudents = new HashSet<>();
		for (Course c : courses) {
			allStudents.addAll(c.getStudents());
		}

		System.out.println("\nTotal de alunos distintos em todos os cursos: " + allStudents.size());

		sc.close();
	}

	public static boolean hasStudentId(Set<Student> students, int id) {
		return students.stream().anyMatch(s -> s.getId().equals(id));
	}

}
