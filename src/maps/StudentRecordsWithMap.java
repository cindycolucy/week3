package maps;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import students.Student;

public class StudentRecordsWithMap {

	public static void main(String[] args) {

		Student harvey = new Student("23A52", "Harvey Dent");
		Student jessica = new Student("68Z29", "Jessica Jones");
		Student jj = new Student("57W85", "J Jonah Jameson");

		// create map <key, value (type parameter)>
		Map<String, String> students = new HashMap<String, String>();

		// add students to map
		students.put("68Z29", "Jessica Jones");
		System.out.println("hashcode for 68Z29 is " + "68Z29".hashCode());
		System.out.println(students);

		students.put("23A52", "Harvey Dent");
		System.out.println("hashcode for 23A52 is " + "23A52".hashCode());
		System.out.println(students);

		//input key, output the value
		String studentName = students.get("23A52");

		System.out.println("I found student " + studentName);

		// common map methods
		System.out.println("Student names (map values) are " + students.values());
		System.out.println("Student ids (map keys) are " + students.keySet());
		// when you need both key and value
		System.out.println("Student entries (key/value pairs) are " + students.entrySet());

		System.out.println("Iterating over student names:");
		for (String currentName : students.values()) {
			System.out.println(currentName);

		}

		System.out.println("Iterating over entries:");
		for (Entry<String, String> entry : students.entrySet()) {
			System.out.println("Key is " + entry.getKey() + ", value is " + entry.getValue());
		}

		// sorting a list (total sidebar)
		System.out.println("Sorting a list:");
		List<String> listOfClasses = new ArrayList<String>();
		listOfClasses.add("Philosophy");
		listOfClasses.add("Creative Writing");
		System.out.println(listOfClasses);
		Collections.sort(listOfClasses);
		System.out.println(listOfClasses);

		// is this a valid student id?
		if (students.containsKey("23A52")) {
			System.out.println("Yes, that's a valid id");
		}
		if (students.containsKey("12345")) {
			System.out.println("NO, that's not a valid id");// doesn't print
		}
		
		//is that a student name?
		if(students.containsValue("Harvey Dent")){
			System.out.println("Found Harvey!");
		}
		
		// do we have any students?
		if (!students.isEmpty()) {
			System.out.println("We have students!");

		}
		// sorry Harvey, remove
		students.remove("23A52");
		System.out.println(students);
	}
}
