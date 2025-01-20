package classAssignment;

import java.util.HashMap;
import java.util.Map;

public class Assignment10_StudentGrades {

	Map<String, Integer> stdGrades;

	public Assignment10_StudentGrades() {
		stdGrades = new HashMap<String, Integer>();
	}

	public void studentGrades() {
		if (stdGrades.isEmpty()) {
			System.out.println("Students with no grades");
		} else {
			System.out.println("Students grades :" + stdGrades);
		}
	}

	public void addNewStudentGrades(String std, Integer grd) {
		stdGrades.put(std, grd);
		System.out.println("Added new Students" + stdGrades.get(std) + "with grades :" + stdGrades.get(grd));
	}

	public void removeGrades(String std) {
		if (stdGrades.remove(std) != null) {
			System.out.println("Students are removed form list ");
		} else {
			System.out.println("Student name not found");
		}
	}

	// Method to view a specific student's grade
	public void viewGrades(String std) {
		Integer grade = stdGrades.get(std);
		if (grade != null) {
			System.out.println("Grade of " + std + " is: " + grade);
		} else {
			System.out.println("Student " + std + " not found.");
		}
	}
}
