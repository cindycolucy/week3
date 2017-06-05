package maps;

import java.util.ArrayList;
import java.util.List;

import students.Student;

public class StudentRecords {

	public static void main(String[] args) {

		List<Student> students = new ArrayList<>(); // same as
													// ArrayList<Student>();

		Student harvey = createStudent("23A52", "Harvey Dent");
		students.add(harvey);

		Student jessica = createStudent("68Z29", "Jessica Jones");
		students.add(jessica);

		Student jj = new Student ("57W85", "J Jonah Jameson");
		students.add(jj);

		System.out.println(students);

		String lookingFor = "Harvey Dent";

		for (Student current : students) {
			if (lookingFor.equalsIgnoreCase(current.name)) {
				System.out.println("Found my student. His id is " + current.id);
				break;
			}
		}

	}

	public static Student createStudent(String idParam, String nameParam) {
		Student s = new Student(); //default constructor
		s.id = idParam;
		s.name = nameParam;
		return s;

	}
}
